package dev.pehlivan.ecommerceproject.service;

import dev.pehlivan.ecommerceproject.model.Coupon;
import dev.pehlivan.ecommerceproject.repository.CouponRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CouponService {
    private final CouponRepository couponRepository;

    public CouponService(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }

    public Coupon save(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    public Optional<Coupon> findById(Long id) {
        return couponRepository.findById(id);
    }

    public Coupon findByCode(String code) {
        return couponRepository.findByCode(code);
    }

    public void deleteById(Long id) {
        couponRepository.deleteById(id);
    }
}
