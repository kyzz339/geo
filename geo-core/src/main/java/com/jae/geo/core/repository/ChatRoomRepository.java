package com.jae.geo.core.repository;

import com.jae.geo.core.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom , Long> {
}
