//package com.gunp.testEcom.service;
//
//import com.gunp.testEcom.model.Product;
//import com.gunp.testEcom.repo.ProductRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import java.util.List;
//import java.util.Optional;
//
//public class ProductService {
//
//    @Autowired
//    private ProductRepo productRepo;
//    public void createProduct(Product product){
//        productRepo.save(product);
//    }
//
//    public List<Product> getAllProducts(){
//        List<Product> list = this.productRepo.findAll();
//        return  list;
//    }
//
//    public Optional<Product> getProductByID(Integer id){
//        Optional<Product> product = this.productRepo.findById(id);
//        return product;
//    }
//
//}
//
//
