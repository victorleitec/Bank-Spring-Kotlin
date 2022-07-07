package io.github.victorleitec.bank.service

import io.github.victorleitec.bank.repository.BankRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val repository: BankRepository = mockk(relaxed = true)

    private val bankService = BankService(repository)

    @Test
    fun `should call its data source to retrieve banks`() {
        // when
        bankService.getBanks()

        // then
        verify(exactly = 1) { repository.retrieveBanks() }
    }
}