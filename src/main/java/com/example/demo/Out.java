package com.example.demo;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author gabriel.deaconu.
 * @since June 2017
 */
public interface Out {
    String OUT_ERROR = "out_error";

    @Output(OUT_ERROR)
    SubscribableChannel out_error();
}
