package com.logiqube.appserver.controller;

import com.logiqube.appserver.api.HealthApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class HealthController implements HealthApi {

    @Override
    public ResponseEntity<Void> getHealthStatus() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
