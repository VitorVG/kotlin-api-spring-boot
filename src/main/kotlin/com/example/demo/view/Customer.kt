package com.example.demo.view

import com.example.demo.application.impl.CustomerApplicationImpl
import com.example.demo.domain.entity.CustomerEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerEndpoint {

    @Autowired
    lateinit var application: CustomerApplicationImpl

    @GetMapping("/customer/{id}")
    fun getCustomer(@PathVariable id: String) : CustomerEntity {
        return application.getCustomer(id)
    }
}
