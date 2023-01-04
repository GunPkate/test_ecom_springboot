package com.gunp.testEcom.model.Customer;

import javax.persistence.*;

@Entity
@Table(name ="customer_payment")
public class CustomerPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CustomerPaymentId;
//    private int CustomerId;
    private int CustomerInvoiceId;
    private int UserId;
    private int invoiceNo;
    private float TotalAmount;
    private float PaidAmount;
    private float RemainingAmount; //?

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "CustomerId", referencedColumnName = "CustomerId")
//    @JsonIgnoreProperties("storyList")
    private Customer customer;

    public CustomerPayment(int customerInvoiceId, int userId, int invoiceNo, float totalAmount, float paidAmount, float remainingAmount, Customer customer) {
        CustomerInvoiceId = customerInvoiceId;
        UserId = userId;
        this.invoiceNo = invoiceNo;
        TotalAmount = totalAmount;
        PaidAmount = paidAmount;
        RemainingAmount = remainingAmount;
        this.customer = customer;
    }

    public int getCustomerPaymentId() {
        return CustomerPaymentId;
    }

    public void setCustomerPaymentId(int customerPaymentId) {
        CustomerPaymentId = customerPaymentId;
    }

    public int getCustomerInvoiceId() {
        return CustomerInvoiceId;
    }

    public void setCustomerInvoiceId(int customerInvoiceId) {
        CustomerInvoiceId = customerInvoiceId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        TotalAmount = totalAmount;
    }

    public float getPaidAmount() {
        return PaidAmount;
    }

    public void setPaidAmount(float paidAmount) {
        PaidAmount = paidAmount;
    }

    public float getRemainingAmount() {
        return RemainingAmount;
    }

    public void setRemainingAmount(float remainingAmount) {
        RemainingAmount = remainingAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
