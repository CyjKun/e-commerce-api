package com.ecommerce.ecommerce.exception

import com.ecommerce.ecommerce.response.ErrorMessage
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.lang.NullPointerException

import java.util.Date

@ControllerAdvice
class ExceptionHandler : ResponseEntityExceptionHandler() {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = [Exception::class])
    fun handleAnyException(ex: Exception, request: WebRequest): ResponseEntity<Any> {
        var errorMessageDescription = ex.localizedMessage

        if(errorMessageDescription == null)
            errorMessageDescription = ex.toString()

        val errorMessage = ErrorMessage(Date(), ex.localizedMessage)

        return ResponseEntity(
                errorMessage,
                HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR
        )
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = [ProductServiceException::class])
    fun handleProductServiceException(ex: ProductServiceException, request: WebRequest): ResponseEntity<Any> {
        var errorMessageDescription = ex.localizedMessage

        if(errorMessageDescription == null)
            errorMessageDescription = ex.toString()

        val errorMessage = ErrorMessage(Date(), ex.localizedMessage)

        return ResponseEntity(
                errorMessage,
                HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR
        )
    }
}
