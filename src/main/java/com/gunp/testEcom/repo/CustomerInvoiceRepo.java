package com.gunp.testEcom.repo;

import com.gunp.testEcom.model.Customer.Customer;
import com.gunp.testEcom.model.Customer.CustomerInvoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInvoiceRepo extends JpaRepository<CustomerInvoice, Integer> {
}
