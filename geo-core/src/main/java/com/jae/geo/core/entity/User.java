package com.jae.geo.core.entity;

import com.jae.geo.core.enums.Role;
import com.jae.geo.core.enums.SocialType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true , length = 100)
    private String email;

    @Column(nullable = true , length = 200)
    private String password;

    @Column(nullable = false , length = 100)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column
    private SocialType socialType;

    @Column
    private String socialId;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private List<Store> stores;

    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ChatParticipant> chatParticipants;

}
