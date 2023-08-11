package com.example.atc.data;

import lombok.Data;

@Data
public class FlightInfo {
    private String flightName;
    private int top;
    private int left;
    private int right;
    private int down;
    private int speed;
}
