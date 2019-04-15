package com.ecommerce.ecommerce

import com.ecommerce.ecommerce.domain.Product
import com.ecommerce.ecommerce.infrastracture.database.ProductJpaRepository
import com.ecommerce.ecommerce.usecase.GetAllProductData
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import java.util.stream.Collectors
import java.util.stream.Stream

@RunWith(SpringRunner::class)
@SpringBootTest
class EcommerceApplicationTests {
    @Autowired
    internal var getAllProductData: GetAllProductData? = null

    @MockBean
    internal var productJpaRepository: ProductJpaRepository? = null

    @Test
    fun getProductsTest() {
        Mockito.`when`(productJpaRepository!!
                .findAll())
                .thenReturn(Stream.of(
                        Product(1L, "asd", "asd"),
                        Product(1L, "qwe", "qwe"))
                        .collect(Collectors.toList()))

        Assert.assertEquals(
                2,
                getAllProductData!!
                        .getAll()
                        .size
                        .toLong())
    }

    @Test
    fun contextLoads() {
    }

}
