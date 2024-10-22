package lk.sonicSphere.api.repository;

import lk.sonicSphere.api.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
