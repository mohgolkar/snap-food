package com.mapsa.SnapFood2.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.HttpsURLConnection;
import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {
    private ICategoryService categoryService;
    @Autowired
    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PutMapping(value = "")
    public ResponseEntity<Void> save(@RequestBody Category category) {

        categoryService.save(category);
        return ResponseEntity.status(HttpsURLConnection.HTTP_CREATED).build();

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> getById(@PathVariable Long id) {
        Category category = categoryService.getById(id);
        return ResponseEntity.ok(category);
    }


    @GetMapping(value = "")
    public ResponseEntity<List<Category>> getAll() {


        List<Category> categories= categoryService.getAll();
        return ResponseEntity.ok(categories);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        categoryService.delete(id);
        return ResponseEntity.status(HttpsURLConnection.HTTP_CREATED).build();
}









}
