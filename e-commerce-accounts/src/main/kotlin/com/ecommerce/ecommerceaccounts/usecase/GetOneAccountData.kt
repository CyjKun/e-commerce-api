package com.ecommerce.ecommerceaccounts.usecase

import com.ecommerce.ecommerceaccounts.domain.Account
import com.ecommerce.ecommerceaccounts.exception.AccountServiceException
import com.ecommerce.ecommerceaccounts.infrastracture.database.AccountJpaRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
open class GetOneAccountData(val accountJpaRepository: AccountJpaRepository) {
    fun getOne(id: Long): Account {
        if (!accountJpaRepository.existsById(id))
            throw AccountServiceException("No Accounts with id: " + id)

        return accountJpaRepository.getOne(id)
    }

}