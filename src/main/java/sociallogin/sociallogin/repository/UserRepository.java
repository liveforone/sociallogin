package sociallogin.sociallogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sociallogin.sociallogin.domain.Users;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Users> findByEmail(String email);
}
