package com.example.demo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author gabriel.deaconu.
 * @since June 2017
 */
public interface In {
    String INPUT = "input";
    String ERRORS = "errors";

    @Input
    SubscribableChannel input();

    @Input
    SubscribableChannel errors();
}
