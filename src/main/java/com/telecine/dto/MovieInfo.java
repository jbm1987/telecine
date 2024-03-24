package com.telecine.dto;

import java.util.ArrayList;

public record MovieInfo(ArrayList<String> castnames,
        String contentrating,
        ArrayList<String> contentratingcriteria,
        ArrayList<String> countries,
        String cover,
        String covercard,
        String coverlandscape,
        String coverlandscapeminified,
        String coverportrait,
        String coverposter,
        String coverwide,
        String deeplink,
        String description,
        ArrayList<String> directorsnames,
        ArrayList<String> genresnames,
        String headline,
        String id,
        String poster,
        int releaseyear,
        boolean selfratedcontent,
        String slug,
        String structure_duration,
        boolean video_published,
        String video_publishedat,
        String video_scheduledunpublicationdate,
        int video_serviceid) {
    
}
