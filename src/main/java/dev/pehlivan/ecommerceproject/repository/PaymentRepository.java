package dev.pehlivan.ecommerceproject.repository;

import dev.pehlivan.ecommerceproject.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}