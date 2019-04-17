package com.ecommerce.ecommerce.usecase

import com.ecommerce.ecommerce.domain.ProductRepository
import com.ecommerce.ecommerce.exception.ProductServiceException
import com.ecommerce.ecommerce.infrastracture.database.ProductJpaRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class DeleteOneProductData(val productRepository: ProductRepository,
                           val productJpaRepository: ProductJpaRepository) {
    fun deleteOne(id: Long) {
        if(!productJpaRepository.existsById(id))
            throw ProductServiceException("No Products with id: " + id)

        return productRepository.deleteById(id)
    }
}