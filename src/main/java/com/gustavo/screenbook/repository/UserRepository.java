package com.gustavo.screenbook.repository;

import com.gustavo.screenbook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
