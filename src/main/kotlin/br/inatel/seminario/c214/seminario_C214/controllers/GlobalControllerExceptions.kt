package br.inatel.seminario.c214.seminario_C214.controllers

import br.inatel.seminario.c214.seminario_C214.controllers.exceptions.FieldInvalidException
import br.inatel.seminario.c214.seminario_C214.controllers.exceptions.ItemAlreadyExistException
import br.inatel.seminario.c214.seminario_C214.controllers.exceptions.StandardError
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import org.webjars.NotFoundException
import java.time.Instant

@ControllerAdvice
class GlobalControllerExceptions : ResponseEntityExceptionHandler() {

    @ExceptionHandler(value = [(NotFoundException::class)])
    fun handlerNotFound(e: Exception, request: WebRequest): ResponseEntity<StandardError> {
        val error = StandardError()
        error.setTimestamp(Instant.now().toString())
        error.setStatus(HttpStatus.NOT_FOUND.value())
        error.setError(HttpStatus.NOT_FOUND.reasonPhrase)
        error.setMessage(e.localizedMessage)
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error)
    }

    @ExceptionHandler(value = [(ItemAlreadyExistException::class)])
    fun handlerConflict(e: ItemAlreadyExistException, request: WebRequest): ResponseEntity<StandardError> {
        val error = StandardError()
        error.setTimestamp(Instant.now().toString())
        error.setStatus(HttpStatus.CONFLICT.value())
        error.setError(HttpStatus.CONFLICT.reasonPhrase)
        error.setMessage(e.localizedMessage)
        return ResponseEntity.status(HttpStatus.CONFLICT).body(error)
    }

    @ExceptionHandler(value = [(FieldInvalidException::class)])
    fun handlerBadRequest(e: FieldInvalidException, request: WebRequest): ResponseEntity<StandardError> {
        val error = StandardError()
        error.setTimestamp(Instant.now().toString())
        error.setStatus(HttpStatus.BAD_REQUEST.value())
        error.setError(HttpStatus.BAD_REQUEST.reasonPhrase)
        error.setMessage(e.localizedMessage)
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error)
    }
}