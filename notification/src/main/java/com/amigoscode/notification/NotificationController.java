package com.amigoscode.notification;

import com.amigoscode.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    @PostMapping(path = "api/v1/notification")
    public void sendNotification(@RequestBody NotificationRequest request) {
        log.info("New notification request {}", request);
        notificationService.sendNotification(request);
    }
}
