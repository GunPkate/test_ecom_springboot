package com.gunp.testEcom;

import com.gunp.testEcom.model.Customer.Customer;
import com.gunp.testEcom.model.Customer.CustomerInvoice;
import com.gunp.testEcom.model.Product;
import com.gunp.testEcom.repo.CustomerInvoiceRepo;
import com.gunp.testEcom.repo.CustomerPaymentRepo;
import com.gunp.testEcom.repo.CustomerRepo;
import com.gunp.testEcom.repo.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TestEcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestEcomApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(ProductRepo productRepo){
//		return (args ->{
//			productRepo.save(new Product("Jackfruit","Fruit"));
//			productRepo.save(new Product("Papaya","Fruit"));
//			productRepo.save(new Product("Coconut","Fruit"));
//			productRepo.save(new Product("Apple","Fruit"));
//		} );
//	}
	@Bean
	public CommandLineRunner mockCustomer(CustomerRepo customerRepo, CustomerInvoiceRepo customerInvoiceRepo, CustomerPaymentRepo customerPaymentRepo){
		return (args -> {
			Customer c1 = new Customer("GunP","0832224444","Bangkok","BTS Bangchak","");
			Customer c2 = new Customer("Archar","0832224455","Bangkok","BTS Bangchak","mark2");

			CustomerInvoice Ic1 = new CustomerInvoice(1,"AR121120_800","Medicine", 1000.00F,new Date("2020/12/11"),"");
			CustomerInvoice Ic2 = new CustomerInvoice(1,"AR121120_801","Medicine", 1000.00F,new Date("2020/12/11"),"");
			CustomerInvoice Ic3 = new CustomerInvoice(1,"AR121120_803","Medicine", 1000.00F,new Date("2020/12/11"),"");

//			c1.setCustomerInvoices((List<CustomerInvoice>) Ic1);
//			c1.setCustomerInvoices((List<CustomerInvoice>) Ic2);
//			c2.setCustomerInvoices((List<CustomerInvoice>) Ic3);
			customerRepo.save(c1);
			customerRepo.save(c2);

			customerInvoiceRepo.save(Ic1);
			customerInvoiceRepo.save(Ic2);
			customerInvoiceRepo.save(Ic3);
		});
	}
}
