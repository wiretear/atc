package com.example.atc.data;

import lombok.Data;

@Data
public class FlightInfo {
    private String flightName;
    private double top;
    private double left;
    private double right;
    private double down;
    private double speed;
}
