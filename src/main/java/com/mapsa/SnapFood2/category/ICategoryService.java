package com.mapsa.SnapFood2.category;

import java.util.List;

public interface ICategoryService {

    Category save(Category category);
    Category getById(Long categoryId);
    List<Category> getAll();
    void delete(long id);
}
