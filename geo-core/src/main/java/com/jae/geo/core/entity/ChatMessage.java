package com.jae.geo.core.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "chat_message")
public class ChatMessage {

    @Id
    private String id;

    @Field("room_id")
    @Indexed
    private Long chatRoomId;

    private Long senderId;

    private String content;

    @Indexed
    private LocalDateTime createdAt;

}
