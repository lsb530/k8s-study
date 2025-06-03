package com.boki.demoz.product

import com.boki.demoz.product.dto.ProductCreateRequest
import com.boki.demoz.product.dto.ProductResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/products")
@RestController
class ProductController(
    private val productService: ProductService
) {

    @GetMapping
    fun getProducts(): List<ProductResponse> {
        return productService.getProducts()
    }

    @PostMapping
    fun createProduct(@RequestBody request: ProductCreateRequest): ProductResponse {
        return productService.createProduct(request)
    }

}