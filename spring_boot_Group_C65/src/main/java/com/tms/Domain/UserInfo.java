package com.tms.Domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;


import java.time.LocalDateTime;
@Schema(description = "Описание пользователя")
@Data
@EqualsAndHashCode(exclude = "updatedAt")
@Entity(name = "user_info")
@Component
public class UserInfo {
        @Schema(description = "Это уникальный идентификатор пользователя ")
        @SequenceGenerator(name="userGen", sequenceName = "user_info_id_seq",allocationSize = 1)
        @GeneratedValue(generator = "userGen")
        @Id
        private Integer id;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "created")
        private LocalDateTime createdAt = LocalDateTime.now();

        @Column(name = "updated")
        private LocalDateTime updatedAt = LocalDateTime.now();

    }

