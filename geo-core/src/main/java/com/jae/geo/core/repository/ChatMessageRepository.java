package com.jae.geo.core.repository;

import com.jae.geo.core.entity.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatMessageRepository extends MongoRepository<ChatMessage , String> {
}
