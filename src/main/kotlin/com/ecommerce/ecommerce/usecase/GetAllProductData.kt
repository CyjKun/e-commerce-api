package com.ecommerce.ecommerce.usecase

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.domain.ProductRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class GetAllProductData(val productRepository: ProductRepository) {
    fun getAll(): List<Product> {
        return productRepository.findAll()
    }
}