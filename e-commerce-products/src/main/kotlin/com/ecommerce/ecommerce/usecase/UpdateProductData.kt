package com.ecommerce.ecommerce.usecase

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.infrastracture.database.ProductJpaRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
open class UpdateProductData(val productJpaRepository: ProductJpaRepository) {
    fun updateOne(newProduct: Product, id: Long): Product {
        return productJpaRepository.findById(id)
                .map { product ->
                    product.name = newProduct.name
                    product.description = newProduct.description
                    productJpaRepository.save(product)
                }
                .orElseGet {
                    newProduct.id = id
                    productJpaRepository.save(newProduct)
                }
    }

}