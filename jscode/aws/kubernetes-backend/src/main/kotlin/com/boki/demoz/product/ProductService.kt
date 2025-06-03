package com.boki.demoz.product

import com.boki.demoz.product.dto.ProductCreateRequest
import com.boki.demoz.product.dto.ProductResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProductService(
    private val productRepository: ProductRepository
) {

    @Transactional(readOnly = true)
    fun getProducts(): List<ProductResponse> {
        return productRepository.findAll()
            .map(ProductResponse::of)
    }

    @Transactional
    fun createProduct(request: ProductCreateRequest): ProductResponse {
        val newProduct = productRepository.save(
            Product(name = request.name, price = request.price)
        )
        return ProductResponse.of(newProduct)
    }

}