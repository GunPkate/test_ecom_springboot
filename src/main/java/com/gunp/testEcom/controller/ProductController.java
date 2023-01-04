package com.gunp.testEcom.controller;

import com.gunp.testEcom.Exception.ResourceNotFound;
import com.gunp.testEcom.repo.ProductRepo;
import com.gunp.testEcom.model.ProductResponse;
import com.gunp.testEcom.model.Product;
//import com.gunp.testEcom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductRepo productRepo;

    @GetMapping("/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable Long id){
        Product p = productRepo.findProductByID(id);
        return ResponseEntity.ok().body(p);
    }

    @GetMapping("v2/{id}")
    public ResponseEntity<Product> findProductByIdV2(@PathVariable Long id) throws ResourceNotFound{
        Product p = productRepo.findById(id)
                .orElseThrow(()->new ResourceNotFound("Error Data not found "+ id));
        return ResponseEntity.ok().body(p);
    }

    @GetMapping("")
    public  ResponseEntity<List<Product>> getAllProduct(){
        return ResponseEntity.ok().body(productRepo.findAll());
    }

    @GetMapping("query")
    public  ResponseEntity<List<Product>> getAllProductQuery(){
        return ResponseEntity.ok().body(productRepo.findAllProduct());
    }
    @PostMapping
    public ResponseEntity<ProductResponse> saveProduct(@RequestBody Product productInput){
        try {
            productRepo.save(productInput);
            return ResponseEntity.ok().body(new ProductResponse("200","add product success"));
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(new ProductResponse("400",e.getMessage()));
        }
    }

    @PutMapping("/{id}") //Query method interface
//    public ResponseEntity<Product> updateProduct(@PathVariable("id") int id,@PathVariable("name") String name){
//            Product result = productRepo.updateProductByID(id,name);
//            return ResponseEntity.ok().body(result);
//    }
    public ResponseEntity<Product> updateProductByID(@PathVariable("id") long id,@RequestBody Product productinput) throws ResourceNotFound{
       Product p = productRepo.findById(id)
               .orElseThrow(()->new ResourceNotFound("Error Data not found "+ id));
       p.setName(productinput.getName());
       p.setCategory(productinput.getCategory());
       productRepo.save(p);
       return ResponseEntity.ok().body(p);

    }

    @DeleteMapping("/{id}")
//    public ResponseEntity<ProductResponse> deleteProduct(@PathVariable("id") int id){
//        productRepo.deleteProductByID(id);
//        return ResponseEntity.ok().body(new ProductResponse("200","deleted success"));
//    }
    public ResponseEntity<ProductResponse> deleteProductByID(@PathVariable("id") long id) throws ResourceNotFound{
        Product p = productRepo.findById(id)
                .orElseThrow(()->new ResourceNotFound("Error Data not found "+ id));
        productRepo.delete(p);
        return ResponseEntity.ok().body(new ProductResponse("200","Delete Success"));
    }
}
