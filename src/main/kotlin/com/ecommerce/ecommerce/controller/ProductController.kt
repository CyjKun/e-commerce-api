package com.ecommerce.ecommerce.controller

import com.ecommerce.ecommerce.model.Product
import com.ecommerce.ecommerce.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api/products")
class ProductController(@Autowired private val productRepository: ProductRepository) {
    //CREATE
    @PostMapping
    fun saveProduct(@RequestBody product: Product): Product = productRepository.save(product)

    //READ
    @GetMapping
    fun getAllProducts(): List<Product> = productRepository.findAll()

    @GetMapping("/{id}")
    fun getOneProduct(@PathVariable id: Long): ResponseEntity<Product> = productRepository.findById(id).map {
        ResponseEntity.ok(it)
    }.orElse(ResponseEntity.notFound().build())

    //UPDATE
    //TO TEST
//    @PutMapping("/{id}")
//    fun updateProduct(@PathVariable id: Long, @Valid @RequestBody product: Product): ResponseEntity<Product> = productRepository.findById(id).map {
//        val newProduct = it.copy(name = product.name, description =  product.description)
//        ResponseEntity.ok().body(productRepository.save(newProduct))
//    }.orElse(ResponseEntity.notFound().build())


    //DELETE
    @DeleteMapping("/{id}")
    fun deleteProduct(@RequestParam id: Long): ResponseEntity<Void> = productRepository.findById(id).map{
        productRepository.delete(it)
        ResponseEntity<Void>(HttpStatus.OK)
    }.orElse(ResponseEntity.notFound().build())

}