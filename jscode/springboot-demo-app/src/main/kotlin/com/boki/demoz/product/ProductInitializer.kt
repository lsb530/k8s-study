package com.boki.demoz.product

import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
open class ProductInitializer(
    private val productRepository: ProductRepository
) {

    @Transactional
    @EventListener(ApplicationReadyEvent::class)
    fun init(event: ApplicationReadyEvent) {
        val product1 = Product(name = "포켓몬 피규어", price = 8000)
        val product2 = Product(name = "편의점 과자", price = 1500)
        val product3 = Product(name = "치킨 콜라 셋트", price = 23000)
        productRepository.saveAll(
            listOf(product1, product2, product3)
        )
    }

}