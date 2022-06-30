package com.example.shardingjdbcdemo.domain.repo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface BaseRepo<T, ID> extends PagingAndSortingRepository<T, ID>, JpaSpecificationExecutor<T> {
}
