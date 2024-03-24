package com.telecine.worker;


import com.telecine.service.TelecineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TelecineScheduler {

    private final Logger logger = LoggerFactory.getLogger(TelecineScheduler.class);

    @Autowired
    private TelecineService telecineService;

    @Scheduled(fixedDelay = 3600000)
    public void start(){
        telecineService.listMovies();
    }
}
