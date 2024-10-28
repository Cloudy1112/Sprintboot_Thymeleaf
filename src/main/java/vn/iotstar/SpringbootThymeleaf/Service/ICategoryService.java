package vn.iotstar.SpringbootThymeleaf.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import vn.iotstar.SpringbootThymeleaf.Entity.CategoryEntity;


public interface ICategoryService {

	<S extends CategoryEntity> Optional<S> findOne(Example<S> example);

	List<CategoryEntity> findByNameContaining(String name);

	List<CategoryEntity> findAllById(Iterable<Long> ids);

	Page<CategoryEntity> findAll(Pageable pageable);

	void deleteById(Long id);

	void deleteAll();

	void delete(CategoryEntity entity);

	long count();

	List<CategoryEntity> findAll(Sort sort);

	<S extends CategoryEntity> S save(S entity);

	Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);

	Optional<CategoryEntity> findById(Long id);

	List<CategoryEntity> findAll();

}
