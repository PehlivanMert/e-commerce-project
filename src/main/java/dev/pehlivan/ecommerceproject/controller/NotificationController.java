package dev.pehlivan.ecommerceproject.controller;

import dev.pehlivan.ecommerceproject.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/order-status")
    public void notifyOrderStatus(@RequestParam Long userId, @RequestParam String status) {
        notificationService.sendOrderStatusUpdate(userId, status);
    }
}
