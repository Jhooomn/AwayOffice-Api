/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.domain.repository;

import awayoffice.api.auth.domain.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  @Query(value = "select * from User u where u.username like %?1%",
         nativeQuery = true)
  Optional<User>
  findByUsername(String username);
}
