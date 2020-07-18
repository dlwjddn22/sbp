package com.jflow.sbp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.jflow.sbp.domain.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    Optional<MemberEntity> findByEmail(String userEmail);
}
