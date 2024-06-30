package dev.pehlivan.ecommerceproject.controller;

import dev.pehlivan.ecommerceproject.model.Campaign;
import dev.pehlivan.ecommerceproject.service.CampaignService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {
    private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping
    public Campaign addCampaign(@RequestBody Campaign campaign) {
        return campaignService.save(campaign);
    }

    @GetMapping("/{id}")
    public Campaign getCampaign(@PathVariable Long id) {
        return campaignService.findById(id).orElse(null);
    }

    @GetMapping
    public List<Campaign> getAllCampaigns() {
        return campaignService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteCampaign(@PathVariable Long id) {
        campaignService.deleteById(id);
    }
}