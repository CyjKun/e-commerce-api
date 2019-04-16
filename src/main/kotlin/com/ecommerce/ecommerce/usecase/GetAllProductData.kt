package com.ecommerce.ecommerce.usecase

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.domain.ProductRepository
import com.ecommerce.ecommerce.exception.ProductServiceException
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class GetAllProductData(val productRepository: ProductRepository) {
    fun getAll(): List<Product> {
        if (productRepository.findAll().isEmpty())
            throw ProductServiceException("No Products to display")

        return productRepository.findAll()
    }
}