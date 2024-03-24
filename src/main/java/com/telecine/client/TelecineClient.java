package com.telecine.client;

import com.telecine.dto.Catalog;
import com.telecine.dto.MovieInfo;
import com.telecine.worker.TelecineScheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class TelecineClient {
    private static final String URL_CATALOG = "https://bff.telecinecloud.com/api/v1/catalog/?page=%s&pageSize=500&orderBy=asc";
    private final Logger logger = LoggerFactory.getLogger(TelecineScheduler.class);

    @Autowired
    private RestTemplate restTemplate;

    public List<MovieInfo> getMovies(){

        int currentPage = 1;
        int totalPage = 1;
        final List<MovieInfo> movieInfos = new ArrayList<>();

        do {
            final var response = restTemplate.getForEntity(String.format(URL_CATALOG, currentPage), Catalog.class);
            movieInfos.addAll(response.getBody().data());
            totalPage = response.getBody().totalPages();
            currentPage++;
        } while (currentPage <= totalPage);

        logger.info(String.valueOf(movieInfos.size()));

        return movieInfos;
    }
}
