package com.ecommerce.ecommerceaccounts.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "accounts")
class Account (
    @Id @GeneratedValue
    var id: Long = 0,
    var firstName: String = "",
    var lastName: String = ""
)