package com.jflow.sbp.dto;

import lombok.*;

import java.time.LocalDateTime;

import com.jflow.sbp.domain.entity.MemberEntity;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .id(id)
                .name(name)
                .email(email)
                .password(password)
                .build();
    }

    @Builder
    public MemberDto(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
