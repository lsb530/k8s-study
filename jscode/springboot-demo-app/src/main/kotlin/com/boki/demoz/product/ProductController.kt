package com.boki.demoz.product

import com.boki.demoz.product.dto.ProductResponse
import org.springframework.web.bind.annotation.GetMapping
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

}