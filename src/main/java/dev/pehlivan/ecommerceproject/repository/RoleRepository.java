package dev.pehlivan.ecommerceproject.repository;

import dev.pehlivan.ecommerceproject.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
}
