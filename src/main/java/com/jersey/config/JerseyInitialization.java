package com.jersey.config;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.stereotype.Component;

@Component
public class JerseyInitialization extends ResourceConfig {
    /**
     * Register JAX-RS application components.
     */
    public JerseyInitialization() {
        this.register(JacksonFeature.class);
        this.property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        this.property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
        this.packages(true, "com.jersey.resources");
    }
}
