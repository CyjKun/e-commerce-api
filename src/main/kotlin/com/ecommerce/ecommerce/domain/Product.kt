package com.ecommerce.ecommerce.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity(name = "products")
class Product(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,
        @get:NotBlank
        var name: String = "",
        @get:NotBlank
        var description: String = ""
)