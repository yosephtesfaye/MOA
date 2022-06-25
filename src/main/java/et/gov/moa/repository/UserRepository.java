package et.gov.moa.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import et.gov.moa.model.User;
 
public interface UserRepository extends CrudRepository<User, Long> {
 
    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);
}