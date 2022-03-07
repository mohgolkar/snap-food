package com.mapsa.SnapFood2.product;

import com.mapsa.SnapFood2.category.Category;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.HttpsURLConnection;
import java.util.List;

@RestController
@RequestMapping(name = "/product")
public class ProductController {

 IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @PutMapping("/{categoryId}")
    public ResponseEntity<Void> save(@RequestBody Product product, @PathVariable Long categoryId){

         productService.save(categoryId, product);
         return ResponseEntity.status(HttpsURLConnection.HTTP_CREATED).build();

    }
    @GetMapping("/find-by-category/{categoryId}")
    @Cacheable(value = "productByCatCash")
    public ResponseEntity<List<Product>>  filter(@PathVariable Long categoryId){

        return ResponseEntity.ok(productService.findbyCategoryId(categoryId));

    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Product>> getAll(){

        return ResponseEntity.ok(productService.getAll());


    }
}
