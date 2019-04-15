package com.ecommerce.ecommerce.infrastracture.controllers

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.usecase.CreateProductData
import com.ecommerce.ecommerce.usecase.DeleteOneProductData
import com.ecommerce.ecommerce.usecase.GetAllProductData
import com.ecommerce.ecommerce.usecase.GetOneProductData
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(val createProductData: CreateProductData,
                        val getAllProductData: GetAllProductData,
                        val getOneProductData: GetOneProductData,
                        val deleteOneProductData: DeleteOneProductData
) {
    //CREATE
    @PostMapping
    fun saveProduct(@RequestBody product: Product): Product {
        return createProductData.create(product)
    }

    //READ
    @GetMapping
    fun getAllProduct(): List<Product> {
        return getAllProductData.getAll()
    }

    @GetMapping("/{id}")
    fun getOneProduct(@PathVariable id: Long): Product {
        return getOneProductData.getOne(id)
    }

    //DELETE
    @DeleteMapping("/{id}")
    fun deleteOneProduct(@PathVariable id: Long) {
        return deleteOneProductData.deleteOne(id)
    }
}
