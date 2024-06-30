package dev.pehlivan.ecommerceproject.service;

import dev.pehlivan.ecommerceproject.model.Campaign;
import dev.pehlivan.ecommerceproject.repository.CampaignRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampaignService {
    private final CampaignRepository campaignRepository;

    public CampaignService(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    public Campaign save(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    public Optional<Campaign> findById(Long id) {
        return campaignRepository.findById(id);
    }

    public List<Campaign> findAll() {
        return campaignRepository.findAll();
    }

    public void deleteById(Long id) {
        campaignRepository.deleteById(id);
    }
}
