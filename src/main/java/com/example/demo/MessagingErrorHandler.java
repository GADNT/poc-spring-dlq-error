package com.example.demo;

import com.rabbitmq.client.LongString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import static com.example.demo.In.*;

/**
 * @author gabriel.deaconu.
 * @since June 2017
 */
@Service
public class MessagingErrorHandler {

    private static final Logger log = LoggerFactory.getLogger( MessagingErrorHandler.class );

    @ServiceActivator(inputChannel = ERRORS)
    public void handlerForErrors( Message<?> failedMessage ) {

        System.out.println( "Failed message: " + failedMessage );
        DemoInfo failedMessagePayload =(DemoInfo) failedMessage.getPayload();

        log.info( "*** demo: [{}]",failedMessagePayload.getName() );

        String exceptionMessage = (String) failedMessage.getHeaders().get( "x-exception-message" );
        LongString exceptionStacktrace = (LongString) failedMessage.getHeaders().get( "x-exception-stacktrace" );

        log.info( "exceptionMessage: {}", exceptionMessage );
        log.info( "exceptionStacktrace: {}", exceptionStacktrace );

    }
}
