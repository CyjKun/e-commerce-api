package com.ecommerce.ecommerce.infrastracture.controllers

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.usecase.*
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/products")
class ProductController(
        val createProductData: CreateProductData,
        val getAllProductData: GetAllProductData,
        val getOneProductData: GetOneProductData,
        val deleteOneProductData: DeleteOneProductData,
        val updateOneProductData: UpdateProductData
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

    @PutMapping("/{id}")
    fun updateProducts(@RequestBody newProduct: Product, @PathVariable id: Long): Product {
        return updateOneProductData.updateOne(newProduct, id)
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
