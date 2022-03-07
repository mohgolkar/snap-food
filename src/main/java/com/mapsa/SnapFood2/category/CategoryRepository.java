package com.mapsa.SnapFood2.category;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category,Long> {
    Boolean existsByTitle(String title);
}
