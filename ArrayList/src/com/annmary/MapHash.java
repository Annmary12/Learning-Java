package com.annmary;
import java.util.Map;
import java.util.HashMap;

public class MapHash {
    public static void main(String[] args){
        // HashMap is not sorted
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");

        String text = map.get(7);

        System.out.println(text);

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }

    }
}
