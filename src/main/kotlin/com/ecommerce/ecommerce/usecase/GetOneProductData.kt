package com.ecommerce.ecommerce.usecase

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.domain.ProductRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class GetOneProductData(val productRepository: ProductRepository) {
    fun getOne(id: Long): Product{
        return productRepository.findById(id)
    }

}