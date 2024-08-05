package com.amigoscode.notification;

import com.amigoscode.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository repository;

    public void sendNotification(NotificationRequest request) {
        repository.save(
                Notification.builder()
                        .toCustomerId(request.toCustomerId())
                        .toCustomerName(request.toCustomerName())
                        .sentAt(LocalDateTime.now())
                        .message(request.message())
                        .sender("Amigoscode")
                        .build()
        );
    }
}
