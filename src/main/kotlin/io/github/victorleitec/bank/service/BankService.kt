package io.github.victorleitec.bank.service

import io.github.victorleitec.bank.model.Bank
import io.github.victorleitec.bank.repository.BankRepository
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class BankService(private val repository: BankRepository) {

    fun getBanks(): Collection<Bank> = repository.retrieveBanks()
    fun getBank(accountNumber: String): Bank = repository.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank = repository.addBank(bank)
    fun updateBank(bank: Bank): Bank = repository.updateBank(bank)
    fun deleteBank(accountNumber: String): Unit = repository.deleteBank(accountNumber)
}
