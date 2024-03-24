package com.telecine.service;

import com.telecine.client.TelecineClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelecineService {
    private final Logger logger = LoggerFactory.getLogger(TelecineService.class);

    @Autowired
    private TelecineClient telecineClient;

    public void listMovies(){
        final var movies = telecineClient.getMovies();
        logger.info(String.valueOf(movies.size()));
    }
}
