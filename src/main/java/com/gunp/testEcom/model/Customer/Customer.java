package com.gunp.testEcom.model.Customer;

import com.gunp.testEcom.model.Story;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CustomerId;
    private String CustomerName;
    private String ContactNo;
    private String Area;
    private String Address;
    private String Description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL) // ห้ามใช้ Eager
//    @JsonIgnoreProperties("book")
    private List<CustomerInvoice> CustomerInvoices = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL)
//    @JsonIgnoreProperties("book")
    private List<CustomerPayment> CustomerPayments = new ArrayList<>();

    public Customer(String customerName, String contactNo, String area, String address, String description, List<CustomerInvoice> customerInvoices, List<CustomerPayment> customerPayments) {
        CustomerName = customerName;
        ContactNo = contactNo;
        Area = area;
        Address = address;
        Description = description;
        CustomerInvoices = customerInvoices;
        CustomerPayments = customerPayments;
    }

    public Customer(String customerName, String contactNo, String area, String address, String description) {
        CustomerName = customerName;
        ContactNo = contactNo;
        Area = area;
        Address = address;
        Description = description;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<CustomerInvoice> getCustomerInvoices() {
        return CustomerInvoices;
    }

    public void setCustomerInvoices(List<CustomerInvoice> customerInvoices) {
        CustomerInvoices = customerInvoices;
    }

    public List<CustomerPayment> getCustomerPayments() {
        return CustomerPayments;
    }

    public void setCustomerPayments(List<CustomerPayment> customerPayments) {
        CustomerPayments = customerPayments;
    }
}
