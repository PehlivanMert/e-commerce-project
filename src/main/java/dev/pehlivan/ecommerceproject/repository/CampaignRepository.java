package dev.pehlivan.ecommerceproject.repository;

import dev.pehlivan.ecommerceproject.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}