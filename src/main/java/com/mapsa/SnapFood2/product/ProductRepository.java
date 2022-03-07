package com.mapsa.SnapFood2.product;

import com.mapsa.SnapFood2.category.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {

    List<Product>    findAllByCategory(Category category) ;
    Boolean existsByTitle(String title);

}
