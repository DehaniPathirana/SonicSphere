package lk.sonicSphere.api.repository;

import lk.sonicSphere.api.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
