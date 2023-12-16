package com.safidiniaina.customerservice.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "global.param")
public record ConfigParams(int x, int y) {   
}
