package com.ecommerce.ecommerce.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity(name = "products")
class Product(
        @Id
        var id: Long = 0,
        var name: String = "",
        var description: String = ""
)