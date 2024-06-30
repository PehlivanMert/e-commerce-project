package dev.pehlivan.ecommerceproject.service;

import dev.pehlivan.ecommerceproject.model.Cart;
import dev.pehlivan.ecommerceproject.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public Cart save(Cart cart) {
        redisTemplate.opsForValue().set("cart_" + cart.getUser().getId(), cart);
        return cartRepository.save(cart);
    }

    public Optional<Cart> findById(Long id) {
        return cartRepository.findById(id);
    }

    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    public void deleteById(Long id) {
        cartRepository.deleteById(id);
    }

    public Cart getCartByUserId(Long userId) {
        return (Cart) redisTemplate.opsForValue().get("cart_" + userId);
    }
}