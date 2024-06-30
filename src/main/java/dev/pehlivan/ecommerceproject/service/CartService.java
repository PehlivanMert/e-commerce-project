package dev.pehlivan.ecommerceproject.service;

import dev.pehlivan.ecommerceproject.model.Cart;
import dev.pehlivan.ecommerceproject.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    private final CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart save(Cart cart) {
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
        // Burada Redis kullanımı yerine alternatif bir yöntem kullanılabilir,
        // örneğin veritabanından kullanıcıya ait sepet bilgisi getirilebilir.
        return cartRepository.findByUserId(userId);
    }
}
