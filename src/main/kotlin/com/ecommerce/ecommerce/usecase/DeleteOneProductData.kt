package com.ecommerce.ecommerce.usecase

import com.ecommerce.ecommerce.domain.ProductRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class DeleteOneProductData(val productRepository: ProductRepository) {
    fun deleteOne(id: Long) {
        return productRepository.deleteById(id)
    }
}