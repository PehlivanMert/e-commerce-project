package dev.pehlivan.ecommerceproject.service;

import dev.pehlivan.ecommerceproject.model.Favorite;
import dev.pehlivan.ecommerceproject.model.Product;
import dev.pehlivan.ecommerceproject.model.User;
import dev.pehlivan.ecommerceproject.repository.FavoriteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteService {

    private final FavoriteRepository favoriteRepository;
    private final UserService userService;
    private final ProductService productService;

    public FavoriteService(FavoriteRepository favoriteRepository, UserService userService, ProductService productService) {
        this.favoriteRepository = favoriteRepository;
        this.userService = userService;
        this.productService = productService;
    }

    public List<Favorite> getUserFavorites(Long userId) {
        User user = userService.findById(userId).orElse(null);
        return favoriteRepository.findByUser(user);
    }

    public Favorite addFavorite(Long userId, Long productId) {
        User user = userService.findById(userId).orElse(null);
        Product product = productService.findById(productId).orElse(null);
        Favorite favorite = new Favorite();
        favorite.setUser(user);
        favorite.setProduct(product);
        return favoriteRepository.save(favorite);
    }

    public void removeFavorite(Long userId, Long productId) {
        User user = userService.findById(userId).orElse(null);
        Product product = productService.findById(productId).orElse(null);
        Favorite favorite = favoriteRepository.findByUserAndProduct(user, product);
        favoriteRepository.delete(favorite);
    }
}