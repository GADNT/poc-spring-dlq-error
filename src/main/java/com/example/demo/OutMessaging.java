package com.example.demo;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * @author gabriel.deaconu.
 * @since June 2017
 */
@MessagingGateway
public interface OutMessaging {

    @Gateway(requestChannel = Out.OUT_ERROR)
    void initiateOutResponse( com.example.demo.ErrorMessage errorMessage );
}