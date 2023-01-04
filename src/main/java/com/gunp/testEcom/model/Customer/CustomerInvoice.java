package com.gunp.testEcom.model.Customer;

//import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="customer_invoice")
public class CustomerInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CustomerInvoiceId;
//    private int CustomerId;
    private int UserID;
    private String InvoiceNo;
    private String Title;
    private float TotalAmount;
    private Date InvoiceDate;
    private String Description;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "CustomerId", referencedColumnName = "CustomerId")
//    @JsonIgnoreProperties("storyList")
    private Customer customer;

    public CustomerInvoice(int userID, String invoiceNo, String title, float totalAmount, Date invoiceDate, String description, Customer customer) {
        UserID = userID;
        InvoiceNo = invoiceNo;
        Title = title;
        TotalAmount = totalAmount;
        InvoiceDate = invoiceDate;
        Description = description;
        this.customer = customer;
    }

    public CustomerInvoice(int userID, String invoiceNo, String title, float totalAmount, Date invoiceDate, String description) {
        UserID = userID;
        InvoiceNo = invoiceNo;
        Title = title;
        TotalAmount = totalAmount;
        InvoiceDate = invoiceDate;
        Description = description;
    }

    public int getCustomerInvoiceId() {
        return CustomerInvoiceId;
    }

    public void setCustomerInvoiceId(int customerInvoiceId) {
        CustomerInvoiceId = customerInvoiceId;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getInvoiceNo() {
        return InvoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        InvoiceNo = invoiceNo;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        TotalAmount = totalAmount;
    }

    public Date getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        InvoiceDate = invoiceDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
