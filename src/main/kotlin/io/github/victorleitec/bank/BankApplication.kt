package io.github.victorleitec.bank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankApplication

fun main(args: Array<String>) {
    runApplication<BankApplication>(*args)
}
