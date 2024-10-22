package com.kamran.project.uber.uberApp.services.impl;

import com.kamran.project.uber.uberApp.services.DistanceService;
import lombok.Data;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {

    private static final String OSRM_API_BASE_URL = "http://router.project-osrm.org/route/v1/driving/";

    @Override
    public double calculateDistance(Point src, Point dest) {

        // Call the third-party API OSRM to fetch the distance
        try {
            String uri = OSRM_API_BASE_URL + src.getX() + "," + src.getY() + ";" + dest.getX() + "," + dest.getY();
            OSRMResponseDto responseDto = RestClient.builder()
                    .baseUrl(uri)
                    .build()
                    .get()
                    .retrieve()
                    .body(OSRMResponseDto.class);

            return responseDto.getRoutes().get(0).getDistance() / 1000.0;  // Distance in kilometers
        } catch (Exception e) {
            throw new RuntimeException("Error getting data from OSRM: " + e.getMessage());
        }
    }
}

@Data
class OSRMResponseDto {
    private List<OSRMRoute> routes;
}

@Data
class OSRMRoute {
    private Double distance;
}
