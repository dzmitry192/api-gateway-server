package com.innowise.apigatewayserver.web.controller;

import com.innowise.apigatewayserver.model.dto.FallbackDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("/fallback")
@RestController
public class FallbackController {

    @GetMapping("/user-service-fallback")
    public ResponseEntity<FallbackDto> userServiceCommonCircuitBreaker() {
        log.info("User service is down");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(FallbackDto.builder()
                .fallbackMessage("Client service is not available, please try again later")
                .build());
    }

    @GetMapping("/notification-service-fallback")
    public ResponseEntity<FallbackDto> notificationServiceCommonCircuitBreaker() {
        log.info("Notification service is down");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(FallbackDto.builder()
                .fallbackMessage("Notification service is not available, please try again later")
                .build());
    }

    @GetMapping("/audit-service-fallback")
    public ResponseEntity<FallbackDto> auditServiceCommonCircuitBreaker() {
        log.info("Audit service is down");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(FallbackDto.builder()
                .fallbackMessage("Audit service is not available, please try again later")
                .build());
    }
}
