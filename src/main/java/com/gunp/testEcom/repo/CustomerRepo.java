package com.gunp.testEcom.repo;

import com.gunp.testEcom.model.Customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
