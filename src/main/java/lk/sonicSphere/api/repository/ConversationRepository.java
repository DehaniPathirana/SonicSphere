package lk.sonicSphere.api.repository;

import lk.sonicSphere.api.model.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationRepository extends JpaRepository<Conversation, Long> {
}
