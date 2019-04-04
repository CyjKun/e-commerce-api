package com.ecommerce.ecommerce.repository

import com.ecommerce.ecommerce.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface ProductRepository: JpaRepository<Product, Long>