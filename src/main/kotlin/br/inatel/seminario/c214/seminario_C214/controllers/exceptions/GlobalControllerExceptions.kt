package br.inatel.seminario.c214.seminario_C214.controllers.exceptions

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
    fun handleUserAlreadyExists(e: NotFoundException, request: WebRequest): ResponseEntity<StandardError> {
        val error = StandardError()
        error.setTimestamp(Instant.now().toString())
        error.setStatus(HttpStatus.BAD_REQUEST.value())
        error.setError(HttpStatus.BAD_REQUEST.reasonPhrase)
        error.setMessage(e.localizedMessage)
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error)
    }
}