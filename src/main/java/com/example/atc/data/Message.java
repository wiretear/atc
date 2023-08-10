package com.example.atc.data;

import lombok.Data;

@Data
public class Message {
    private String senderName;
    private String targetUserName;
    private  FlightInfo flightInfo;
}
