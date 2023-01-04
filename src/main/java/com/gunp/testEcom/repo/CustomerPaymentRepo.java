package com.gunp.testEcom.repo;

import com.gunp.testEcom.model.Customer.Customer;
import com.gunp.testEcom.model.Customer.CustomerPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPaymentRepo extends JpaRepository<CustomerPayment, Integer> {
}
