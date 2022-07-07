package io.github.victorleitec.bank.repository

import io.github.victorleitec.bank.model.Bank

interface BankRepository {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun addBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
    fun deleteBank(accountNumber: String) : Unit
}