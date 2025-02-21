package com.github.amag.microinventoryfailover.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableDiscoveryClient
@Configuration
@Profile({"local-discovery","digitalocean"})
public class LocalDiscoveryConfig {
}
