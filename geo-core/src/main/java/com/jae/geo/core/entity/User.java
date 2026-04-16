package com.jae.geo.core.entity;

import com.jae.geo.core.enums.Role;
import com.jae.geo.core.enums.SocialType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true , length = 100)
    private String email;

    @Column(nullable = false , length = 200)
    private String password;

    @Column(nullable = false , length = 100)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column
    private SocialType socialType;

    private String socialId;

}
