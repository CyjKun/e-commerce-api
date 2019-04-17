package com.ecommerce.ecommerceaccounts.usecase

import com.ecommerce.ecommerceaccounts.domain.Account
import com.ecommerce.ecommerceaccounts.infrastracture.database.AccountJpaRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
open class CreateAccountData (val accountJpaRepository: AccountJpaRepository){
    fun create(account: Account): Account {
        return accountJpaRepository.save(account)
    }
}