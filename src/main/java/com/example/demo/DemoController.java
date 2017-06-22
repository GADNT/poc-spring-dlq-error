package com.example.demo;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import static com.example.demo.In.*;

/**
 * @author gabriel.deaconu.
 * @since June 2017
 */
@Service
public class DemoController {
    @StreamListener(INPUT)
    public void process( DemoInfo demoInfo ) throws Exception {
        validate( demoInfo );
    }

    private void validate( DemoInfo demoInfo ) throws Exception {
        if ( demoInfo != null ) {

            throw new Exception( "BAD!" );
        }
    }
}
