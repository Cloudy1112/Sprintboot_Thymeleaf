package vn.iotstar.SpringbootThymeleaf.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import vn.iotstar.SpringbootThymeleaf.Entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{
	//Tim kiem theo noi dung ten
	List<CategoryEntity> findByNameContaining(String name);
	
	//Tim kiem va phan trang
	Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);

}
