package com.gunp.testEcom.repo;

import com.gunp.testEcom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Long> {
    @Query(value = "Select * from product",nativeQuery = true)
    public List<Product> findAllProduct();

    @Query("Select p  from Product p where p.id = :id")
    public Product findProductByID(@Param("id") long id);

    String DELETE_product = "delete from Product p where p.id = ?1";
    @Modifying
    @Query(value = DELETE_product,nativeQuery = true)
    public void deleteProductByID(@Param("id") long id);

    @Modifying
    @Query(value = "update Product p set p.name = :name where p.id = :id ",nativeQuery = true)
    public Product updateProductByID(@Param("id") long id, @Param("name") String name);
}
