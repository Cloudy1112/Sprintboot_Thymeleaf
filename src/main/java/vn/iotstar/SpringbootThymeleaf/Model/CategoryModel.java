package vn.iotstar.SpringbootThymeleaf.Model;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoryId;
	@Column(name ="category_name", length = 200, columnDefinition = "nvarchar(200) not null")
	private String name;
	
	private Boolean isEdit = false;
	
	
	/*
	 * @OneToMany(mappedBy = "category", cascade = CascadeType.ALL) private
	 * Set<ProductEntity> product;
	 */
	
	
}
