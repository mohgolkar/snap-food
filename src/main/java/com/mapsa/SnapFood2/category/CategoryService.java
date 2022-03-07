package com.mapsa.SnapFood2.category;

import com.mapsa.SnapFood2.Exception.ConflictException;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService{
   private CategoryRepository categoryRepository;


    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    @Caching(evict = {
            @CacheEvict(value = "catCach",allEntries = true)
    })
    public Category save(Category category) {
        if(categoryRepository.existsByTitle(category.getTitle())){
            throw new ConflictException("this categori with this title is already exist");
        }
       return categoryRepository.save(category) ;

    }

    @Override
    public Category getById(Long categoryId) {
        Optional<Category> optionalCategory=categoryRepository.findById(categoryId);

        if(!optionalCategory.isPresent()){
            // update in next session
            throw  new NotFoundException("catId not exsit");
        }


        return optionalCategory.get();
    }

    @Override
    @Cacheable(value = "catCach")
    public List<Category> getAll() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public void delete(long id) {
        categoryRepository.deleteById(id);
    }
}
