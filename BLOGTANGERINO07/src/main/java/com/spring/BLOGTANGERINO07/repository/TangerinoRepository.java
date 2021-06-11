package com.spring.BLOGTANGERINO07.repository;

import com.spring.BLOGTANGERINO07.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TangerinoRepository extends JpaRepository<Post, Long> {
}
