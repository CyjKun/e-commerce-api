package com.ecommerce.ecommerce.infrastracture.database

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.domain.ProductRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductJpaRepository : CrudRepository<Product, Long>, ProductRepository