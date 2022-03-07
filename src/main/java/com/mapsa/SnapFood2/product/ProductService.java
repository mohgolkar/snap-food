package com.mapsa.SnapFood2.product;

import com.mapsa.SnapFood2.Exception.ConflictException;
import com.mapsa.SnapFood2.category.Category;
import com.mapsa.SnapFood2.category.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {

    private ProductRepository productRepository;
    private ICategoryService categoryService;

    public ProductService(ProductRepository productRepository, ICategoryService categoryService) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
    }

    @Override
    public Product save(Long categoryId, Product product) {
        if (productRepository.existsByTitle(product.getTitle())){
            throw new ConflictException("this categori with this title is already exist");
        }
        Category category=categoryService.getById(categoryId) ;

        product.setCategory(category);


        return productRepository.save(product);
    }

    @Override
    public List<Product> findbyCategoryId(Long catId) {

        Category category=categoryService.getById(catId) ;


        return productRepository.findAllByCategory(category);
    }

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }
}
