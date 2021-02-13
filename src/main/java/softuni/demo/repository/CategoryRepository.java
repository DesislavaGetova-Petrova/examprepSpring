package softuni.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import softuni.demo.model.entity.Category;
import softuni.demo.model.entity.CategoryName;

import java.util.Optional;

@RequestMapping
public interface CategoryRepository extends JpaRepository<Category,String> {
  Optional<Category> findByName(CategoryName categoryName);
}
