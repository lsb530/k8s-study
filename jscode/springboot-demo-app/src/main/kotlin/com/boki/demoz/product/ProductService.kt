package com.boki.demoz.product

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

}