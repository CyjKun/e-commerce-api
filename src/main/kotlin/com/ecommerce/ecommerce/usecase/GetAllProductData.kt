package com.ecommerce.ecommerce.usecase

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.exception.ProductServiceException
import com.ecommerce.ecommerce.infrastracture.database.ProductJpaRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class GetAllProductData(val productJpaRepository: ProductJpaRepository) {
    fun getAll(): List<Product> {
        if (productJpaRepository.findAll().isEmpty())
            throw ProductServiceException("No Products to display")

        return productJpaRepository.findAll()
    }
}