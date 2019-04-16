package com.ecommerce.ecommerce.usecase

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.domain.ProductRepository
import com.ecommerce.ecommerce.exception.ProductServiceException
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class GetOneProductData(val productRepository: ProductRepository) {
    fun getOne(id: Long): Product {
        if(productRepository.equals(id))
            throw ProductServiceException("No Products with id: " + id)
        return productRepository.findById(id)
    }

}