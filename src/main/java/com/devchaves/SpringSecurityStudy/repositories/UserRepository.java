package com.devchaves.SpringSecurityStudy.repositories;

import com.devchaves.SpringSecurityStudy.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
