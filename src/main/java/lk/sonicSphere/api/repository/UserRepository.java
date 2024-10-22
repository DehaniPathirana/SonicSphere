package lk.sonicSphere.api.repository;

import lk.sonicSphere.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
