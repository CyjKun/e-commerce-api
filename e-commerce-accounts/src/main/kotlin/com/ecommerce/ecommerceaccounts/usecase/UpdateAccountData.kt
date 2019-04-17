package com.ecommerce.ecommerceaccounts.usecase

import com.ecommerce.ecommerceaccounts.domain.Account
import com.ecommerce.ecommerceaccounts.infrastracture.database.AccountJpaRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
open class UpdateAccountData(val accountJpaRepository: AccountJpaRepository) {
    fun updateOne(newAccount: Account, id: Long): Account {
        return accountJpaRepository.findById(id)
                .map { account ->
                    account.firstName = newAccount.firstName
                    account.lastName = newAccount.lastName
                    accountJpaRepository.save(account)
                }
                .orElseGet {
                    newAccount.id = id
                    accountJpaRepository.save(newAccount)
                }
    }

}