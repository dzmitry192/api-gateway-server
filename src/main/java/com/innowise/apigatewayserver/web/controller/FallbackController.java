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

    @GetMapping("/client-service-fallback")
    public ResponseEntity<FallbackDto> clientServiceCircuitBreaker() {
        log.info("User service is down");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(FallbackDto.builder()
                .fallbackMessage("Client service is not available, please try again later")
                .build());
    }

    @GetMapping("/car-service-fallback")
    public ResponseEntity<FallbackDto> carServiceCircuitBreaker() {
        log.info("Car service is down");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(FallbackDto.builder()
                .fallbackMessage("Car service is not available, please try again later")
                .build());
    }

    @GetMapping("/rent-service-fallback")
    public ResponseEntity<FallbackDto> rentServiceCircuitBreaker() {
        log.info("Rent service is down");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(FallbackDto.builder()
                .fallbackMessage("Rent service is not available, please try again later")
                .build());
    }

    @GetMapping("/payment-service-fallback")
    public ResponseEntity<FallbackDto> paymentServiceCircuitBreaker() {
        log.info("Payment service is down");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(FallbackDto.builder()
                .fallbackMessage("Payment service is not available, please try again later")
                .build());
    }

    @GetMapping("/notification-service-fallback")
    public ResponseEntity<FallbackDto> notificationServiceCircuitBreaker() {
        log.info("Notification service is down");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(FallbackDto.builder()
                .fallbackMessage("Notification service is not available, please try again later")
                .build());
    }

    @GetMapping("/audit-service-fallback")
    public ResponseEntity<FallbackDto> auditServiceCircuitBreaker() {
        log.info("Audit service is down");
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(FallbackDto.builder()
                .fallbackMessage("Audit service is not available, please try again later")
                .build());
    }
}
