package com.ecommerce.ecommerce.usecase

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.infrastracture.database.ProductJpaRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class CreateProductData(val productJpaRepository: ProductJpaRepository) {
    fun create(product: Product): Product {
        return productJpaRepository.save(product)
    }
}