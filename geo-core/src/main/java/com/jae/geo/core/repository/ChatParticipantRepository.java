package com.jae.geo.core.repository;

import com.jae.geo.core.entity.ChatParticipant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatParticipantRepository extends JpaRepository<ChatParticipant , Long> {
}
