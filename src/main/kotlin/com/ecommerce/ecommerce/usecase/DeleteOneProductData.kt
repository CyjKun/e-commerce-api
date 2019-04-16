package com.ecommerce.ecommerce.usecase

import com.ecommerce.ecommerce.domain.ProductRepository
import com.ecommerce.ecommerce.exception.ProductServiceException
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class DeleteOneProductData(val productRepository: ProductRepository) {
    fun deleteOne(id: Long) {
        if(productRepository.findById(id).id != id)
            throw ProductServiceException("No Products to display")

        return productRepository.deleteById(id)
    }
}