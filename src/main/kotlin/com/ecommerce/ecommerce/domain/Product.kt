package com.ecommerce.ecommerce.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "products")
class Product(
        @Id @GeneratedValue
        var id: Long = 0,
        var name: String = "",
        var description: String = ""
)