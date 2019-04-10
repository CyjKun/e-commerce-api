package com.ecommerce.ecommerce.domain

interface ProductRepository {
    fun save (product: Product): Product

    fun findAll(): List<Product>
}