package com.ecommerce.ecommerceaccounts.infrastracture.database

import com.ecommerce.ecommerceaccounts.domain.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountJpaRepository: JpaRepository<Account, Long> {
}