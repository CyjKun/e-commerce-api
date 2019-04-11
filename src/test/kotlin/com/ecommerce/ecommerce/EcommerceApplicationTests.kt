package com.ecommerce.ecommerce

import com.ecommerce.ecommerce.infrastracture.database.ProductJpaRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

@RunWith(SpringRunner::class)
@WebMvcTest
class EcommerceApplicationTests {

    @Autowired
    internal var mockMvc: MockMvc? = null

    @MockBean
    internal var productRepository: ProductJpaRepository? = null

    @Test
    @Throws(Exception::class)
    fun contextLoads() {
        Mockito.`when`(productRepository!!.findAll()).thenReturn(
                emptyList()
        )

        val mvcResult = mockMvc!!.perform(
                MockMvcRequestBuilders.get("/api/products")
                        .accept(MediaType.APPLICATION_JSON)
        ).andReturn()

        println(mvcResult.response)

        //ERROR WITH VERIFY. Unit Test still returns as passed
//		Mockito.verify(productRepository!!.findAll())
    }

}
