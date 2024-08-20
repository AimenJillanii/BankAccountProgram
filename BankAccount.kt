package com.example.bankaccountprogram

class BankAccount (var accountHolder: String, var balance: Double){

    private val transactionHistory= mutableListOf<String>()
    fun deposit(amount:Double)
    {
        balance+=amount
        transactionHistory.add("$accountHolder deposited $$amount")

    }
    fun withdraw(amount:Double)
    {
        if (amount<=balance)
        {
            balance-=amount
            transactionHistory.add("$accountHolder deposited $$amount")
        }
        else{
            println("you dont have the funds to withdraw $$amount")
        }

    }
    fun displaytransactionhistory()
    {
        println("for transaction history $accountHolder")
        for (transaction in transactionHistory)
            println(transaction)
    }
}