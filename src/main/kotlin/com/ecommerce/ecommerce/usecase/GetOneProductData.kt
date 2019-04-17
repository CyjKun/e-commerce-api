package com.ecommerce.ecommerce.usecase

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.domain.ProductRepository
import com.ecommerce.ecommerce.exception.ProductServiceException
import com.ecommerce.ecommerce.infrastracture.database.ProductJpaRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
open class GetOneProductData(val productJpaRepository: ProductJpaRepository) {
    fun getOne(id: Long): Product {
        if(!productJpaRepository.existsById(id))
            throw ProductServiceException("No Products with id: " + id)
        return productJpaRepository.getOne(id)
    }

}