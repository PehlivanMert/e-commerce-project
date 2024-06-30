package dev.pehlivan.ecommerceproject.repository;

import dev.pehlivan.ecommerceproject.model.Favorite;
import dev.pehlivan.ecommerceproject.model.Product;
import dev.pehlivan.ecommerceproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    List<Favorite> findByUser(User user);
    Favorite findByUserAndProduct(User user, Product product);
}
