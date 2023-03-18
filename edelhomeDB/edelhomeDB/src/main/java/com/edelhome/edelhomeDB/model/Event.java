package com.edelhome.edelhomeDB.model;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.time.LocalDateTime;

@Value
public class Event 
{
    Long event_id;
    String name_of_event;
    LocalDate date_of_event;
    LocalTime start_of_event;
    LocalTime end_of_event;
    ArrayList<Integer> images_of_event;
    //Worker worker;
    String name_of_client;
    String phone_number;
    LocalDateTime date_added;
    String address;
    int category; //1 - замеры, 2 - мебель, 3 - окна, 4 - входные двери, 5 - межкомнатные двери, 6 - кухни
    boolean in_archive;
}
