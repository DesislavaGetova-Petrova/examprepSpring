package softuni.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.demo.model.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
