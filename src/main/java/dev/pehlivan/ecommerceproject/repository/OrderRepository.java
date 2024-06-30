package dev.pehlivan.ecommerceproject.repository;

import dev.pehlivan.ecommerceproject.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
