package com.mapsa.SnapFood2.specifiction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepositorySpecifition extends JpaRepository<UserSpecifition, String>, JpaSpecificationExecutor<UserSpecifition> {

    public Page<UserSpecifition> findAll(Specification<UserSpecifition> spec, Pageable pageable);

    public List<UserSpecifition> findAll(Specification<UserSpecifition> spec);

}