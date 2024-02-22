package com.innowise.apigatewayserver.model.dto;

import lombok.Builder;

@Builder
public record FallbackDto(String fallbackMessage) {
}