package com.example.bankaccountprogram

fun main(){

    val aimyBanksAccount=BankAccount(accountHolder = "Aimy", balance = 12.000)
    aimyBanksAccount.deposit(amount = 200.0)
    aimyBanksAccount.withdraw(amount = 100.0)
    aimyBanksAccount.deposit(amount = 1200.00)

    aimyBanksAccount.displaytransactionhistory()
    println("${aimyBanksAccount.accountHolder} 's" + " balance is ${aimyBanksAccount.balance}")
}