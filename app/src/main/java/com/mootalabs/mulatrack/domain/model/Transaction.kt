package com.mootalabs.mulatrack.domain.model

data class Transaction(
    val transactionId: Int,
    val categoryId: Int,
    val walletId: Int,
    val amount: Double,
    val createdAt: String,
    val updatedAt: String,
)