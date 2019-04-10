package com.ecommerce.ecommerce.infrastracture.controllers

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.infrastracture.database.ProductJpaRepository
import com.ecommerce.ecommerce.usecase.CreateProductData
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(val createProductData: CreateProductData){
    @PostMapping
    fun saveProduct(@RequestBody product: Product): Product{
        return createProductData.create(product)
    }
}
//class ProductController(@Autowired private val productJpaRepository: ProductJpaRepository) {
//    //CREATE
//    @PostMapping
//    fun saveProduct(@RequestBody product: Product): Product = productJpaRepository.save(product)
//
//    //READ
//    @GetMapping
//    fun getAllProducts(): List<Product> = productJpaRepository.findAll()
//
//    @GetMapping("/{id}")
//    fun getOneProduct(@PathVariable id: Long): ResponseEntity<Product> = productJpaRepository.findById(id).map {
//        ResponseEntity.ok(it)
//    }.orElse(ResponseEntity.notFound().build())
//
//    //UPDATE
//    //TO TEST
////    @PutMapping("/{id}")
////    fun updateProduct(@PathVariable id: Long, @Valid @RequestBody product: Product): ResponseEntity<Product> = productJpaRepository.findById(id).map {
////        val newProduct = it.copy(name = product.name, description =  product.description)
////        ResponseEntity.ok().body(productJpaRepository.save(newProduct))
////    }.orElse(ResponseEntity.notFound().build())
//
//
//    //DELETE
//    @DeleteMapping("/{id}")
//    fun deleteProduct(@RequestParam id: Long): ResponseEntity<Void> = productJpaRepository.findById(id).map{
//        productJpaRepository.delete(it)
//        ResponseEntity<Void>(HttpStatus.OK)
//    }.orElse(ResponseEntity.notFound().build())
//
//}