package com.mapsa.SnapFood2.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SedderCategori implements ApplicationRunner {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*Category category = categoryRepository.findById(8l).get();
        category.setTitle("cat 1 update2");
        categoryRepository.save(category);
        System.out.println("finish update");
        Category cat = new Category();
        cat.setTitle("cat1");
        categoryRepository.save(cat);

        Category cat2 = new Category();
        cat2.setTitle("cat2");
        categoryRepository.save(cat2);

        System.out.println("finish inh");*/
    }
}
