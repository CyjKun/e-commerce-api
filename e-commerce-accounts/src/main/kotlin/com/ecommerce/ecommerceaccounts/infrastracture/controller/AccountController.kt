package com.ecommerce.ecommerceaccounts.infrastracture.controller

import com.ecommerce.ecommerceaccounts.domain.Account
import com.ecommerce.ecommerceaccounts.usecase.*
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/accounts")
class AccountController(
        val createAccountData: CreateAccountData,
        val getAllAccountData: GetAllAccountData,
        val getOneAccountData: GetOneAccountData,
        val deleteOneAccountData: DeleteOneAccountData,
        val updateAccountData: UpdateAccountData
) {
    //CREATE
    @PostMapping
    fun saveAccount(@RequestBody account: Account): Account {
        return createAccountData.create(account)
    }

    //READ
    @GetMapping
    fun getAllAccount(): List<Account> {
        return getAllAccountData.getAll()
    }

    @PutMapping("/{id}")
    fun updateAccounts(@RequestBody newAccount: Account, @PathVariable id: Long): Account {
        return updateAccountData.updateOne(newAccount, id)
    }

    @GetMapping("/{id}")
    fun getOneAccount(@PathVariable id: Long): Account {
        return getOneAccountData.getOne(id)
    }

    //DELETE
    @DeleteMapping("/{id}")
    fun deleteOneAccount(@PathVariable id: Long) {
        return deleteOneAccountData.deleteOne(id)
    }
}