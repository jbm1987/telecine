package com.telecine.dto;

import java.util.ArrayList;

public record Catalog(int currentPage,
        ArrayList<MovieInfo> data,
        int itemsInPage,
        int itemsPerPage,
        int totalItems,
        int totalPages) {

}
