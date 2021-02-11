package softuni.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import softuni.demo.model.entity.Category;

@RequestMapping
public interface CategoryRepository extends JpaRepository<Category,String> {
}
