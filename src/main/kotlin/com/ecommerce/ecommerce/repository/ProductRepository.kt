package com.ecommerce.ecommerce.repository

import com.ecommerce.ecommerce.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long>