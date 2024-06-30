package dev.pehlivan.ecommerceproject.controller;

import dev.pehlivan.ecommerceproject.model.Favorite;
import dev.pehlivan.ecommerceproject.service.FavoriteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
public class FavoriteController {
    private final FavoriteService favoriteService;

    public FavoriteController(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    @GetMapping("/user/{userId}")
    public List<Favorite> getUserFavorites(@PathVariable Long userId) {
        return favoriteService.getUserFavorites(userId);
    }

    @PostMapping("/user/{userId}/product/{productId}")
    public Favorite addFavorite(@PathVariable Long userId, @PathVariable Long productId) {
        return favoriteService.addFavorite(userId, productId);
    }

    @DeleteMapping("/user/{userId}/product/{productId}")
    public void removeFavorite(@PathVariable Long userId, @PathVariable Long productId) {
        favoriteService.removeFavorite(userId, productId);
    }
}