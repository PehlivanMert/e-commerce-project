package dev.pehlivan.ecommerceproject.controller;

import dev.pehlivan.ecommerceproject.model.Product;
import dev.pehlivan.ecommerceproject.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stock")
public class StockController {
    private final ProductService productService;

    public StockController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/check/{productId}")
    public String checkStock(@PathVariable Long productId) {
        Product product = productService.findById(productId).orElse(null);
        if (product == null) {
            return "Product not found";
        }
        return product.getStock() > 0 ? "In stock" : "Out of stock";
    }

    @PutMapping("/update/{productId}")
    public Product updateStock(@PathVariable Long productId, @RequestParam int quantity) {
        Product product = productService.findById(productId).orElse(null);
        if (product == null) {
            return null;
        }
        product.setStock(quantity);
        return productService.save(product);
    }
}
