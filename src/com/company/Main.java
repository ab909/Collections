package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat>seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);
        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }else {
            System.out.println("Seat already reserved");
        }
        //theatre.getSeats();

        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry, seat is reserved");
        }



    }
    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat: list){
            System.out.println(" " + seat.getSeatNumber());

        }
        System.out.println();
        System.out.println("========================================");

        //Hashset concept
        // implements set interface
        // there is only a key value
        // add() needs to be used, at least 1 object is required
        Set<String> set = new HashSet<String>();
        set.add("Hello world");
        set.add("Abhishek");
        System.out.println(set);
        set.add("Sunshine");
        System.out.println(set);

        //HashMap concept
        // implements map interface
        // there is both kay and value *key,value pair
        // method put() must be used (at least 2 objects should be used)
        Map<String, String> map = new HashMap<String, String>();
        map.put("Name","Abhishek");
        map.put("Location","Toronto");
        map.put("Weather","Sunny");
        System.out.println(map);



    }
}
