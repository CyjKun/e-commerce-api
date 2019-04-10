package com.ecommerce.ecommerce.domain

interface ProductRepository {
    fun save(product: Product): Product

    fun findAll(): List<Product>

    fun findById(id: Long): Product

    fun deleteById(id: Long): Product
}