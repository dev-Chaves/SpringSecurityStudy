package com.devchaves.SpringSecurityStudy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_roles")
public class RoleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    private String name;

    public enum values {
        BASIC(2L),
        ADMIN(1L);

        long roleId;

        values(long roleId) {
            this.roleId = roleId;
        }

        public long getRoleId() {
            return roleId;
        }
    }



}
