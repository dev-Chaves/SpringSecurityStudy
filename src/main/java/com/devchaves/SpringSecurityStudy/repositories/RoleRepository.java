package com.devchaves.SpringSecurityStudy.repositories;

import com.devchaves.SpringSecurityStudy.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Long> {
}
