package com.ecommerce.ecommerce.infrastracture.controllers

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.exception.ProductServiceException
import com.ecommerce.ecommerce.infrastracture.database.ProductJpaRepository
import com.ecommerce.ecommerce.usecase.*
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import java.util.*


@RestController
@RequestMapping("/api/products")
class ProductController(val createProductData: CreateProductData,
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

//    @PutMapping("/employees/{id}")
//    fun replaceEmployee(@RequestBody newEmployee: Employee, @PathVariable id: Long?): Employee {
//
//        return repository.findById(id)
//                .map({ employee ->
//                    employee.setName(newEmployee.getName())
//                    employee.setRole(newEmployee.getRole())
//                    repository.save(employee)
//                })
//                .orElseGet({
//                    newEmployee.setId(id)
//                    repository.save(newEmployee)
//                })
//    }

    @PutMapping("/{id}")
    fun updateProducts(@RequestBody newProduct: Product, @PathVariable id: Long): Product{
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
