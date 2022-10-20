package br.inatel.seminario.c214.seminario_C214.controllers.exceptions

import java.io.Serializable

class StandardError : Serializable {
    private var timestamp: String? = null
    private var status: Int? = null
    private var error: String? = null
    private var message: String? = null

    fun getTimestamp(): String? {
        return timestamp
    }

    fun setTimestamp(timestamp: String?) {
        this.timestamp = timestamp
    }

    fun getStatus(): Int? {
        return status
    }

    fun setStatus(status: Int?) {
        this.status = status
    }

    fun getError(): String? {
        return error
    }

    fun setError(error: String?) {
        this.error = error
    }

    fun getMessage(): String? {
        return message
    }

    fun setMessage(message: String?) {
        this.message = message
    }
}