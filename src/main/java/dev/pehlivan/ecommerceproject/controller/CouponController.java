package dev.pehlivan.ecommerceproject.controller;

import dev.pehlivan.ecommerceproject.model.Coupon;
import dev.pehlivan.ecommerceproject.service.CouponService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/coupons")
public class CouponController {
    private final CouponService couponService;

    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    @PostMapping
    public Coupon addCoupon(@RequestBody Coupon coupon) {
        return couponService.save(coupon);
    }

    @GetMapping("/{id}")
    public Coupon getCoupon(@PathVariable Long id) {
        return couponService.findById(id).orElse(null);
    }

    @GetMapping("/code/{code}")
    public Coupon getCouponByCode(@PathVariable String code) {
        return couponService.findByCode(code);
    }

    @DeleteMapping("/{id}")
    public void deleteCoupon(@PathVariable Long id) {
        couponService.deleteById(id);
    }
}
