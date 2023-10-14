package com.example.librarymanagement.repository;

import com.example.librarymanagement.enitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
