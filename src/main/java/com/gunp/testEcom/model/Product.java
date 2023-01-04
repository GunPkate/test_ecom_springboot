package com.gunp.testEcom.model;

import javax.persistence.*;

@Entity
@Table(name = "product") //mapping data // connect database config springboot //JPA keyword
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_category")
    private String category;

    public Product(){}
    public Product(String name,String category){
//        Super();
        this.name = name;
        this.category = category;
    }

    public long getId(){return id;}
    public void setId(long id){this.id = id;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getCategory(){return category;}
    public void setCategory(String category){this.category = category;}
}
