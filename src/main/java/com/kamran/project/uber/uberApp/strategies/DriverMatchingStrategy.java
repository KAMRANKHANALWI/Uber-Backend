package com.kamran.project.uber.uberApp.strategies;

import com.kamran.project.uber.uberApp.entities.Driver;
import com.kamran.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDrivers(RideRequest rideRequest);
}
