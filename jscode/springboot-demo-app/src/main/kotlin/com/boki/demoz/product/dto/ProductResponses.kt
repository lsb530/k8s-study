package com.boki.demoz.product.dto

import com.boki.demoz.product.Product

data class ProductResponse(
    val productId: Long,
    val name: String,
    val price: Int,
) {
    companion object {
        fun of(product: Product): ProductResponse {
            return ProductResponse(
                productId = product.id!!,
                name = product.name,
                price = product.price,
            )
        }
    }
}