package com.ecommerce.ecommerce.controller

import com.ecommerce.ecommerce.model.Product
import com.ecommerce.ecommerce.repository.ProductRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(val productRepository: ProductRepository){
    //CREATE
    @PostMapping
    fun saveProduct(@RequestBody product: Product)
            = productRepository.save(product)

    //READ
    @GetMapping
    fun getAllProducts()
            = productRepository.findAll()

    @GetMapping("/{id}")
    fun getOneProduct(@PathVariable id: Long)
            = productRepository.findById(id)

    //UPDATE
    @PutMapping("/{id}")
    fun updateProduct(@RequestParam id: Long, @RequestBody product: Product){
        assert(product.id == id)
        productRepository.save(product)
    }

    //DELETE
    @DeleteMapping("/{id}")
    fun deleteProduct(@RequestParam id: Long)
            = productRepository.deleteById(id)

}