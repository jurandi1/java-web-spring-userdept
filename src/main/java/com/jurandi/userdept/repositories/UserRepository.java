package com.jurandi.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jurandi.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}