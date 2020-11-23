package com.annmary;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMap {

    public static void main(String[] args){
        // does not have a particular sorting method
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        // returns the result the same way it was inputted
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        // sorts the array in natural order
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map){
        map.put(9, "fox");
        map.put(3, "cat");
        map.put(5, "rat");
        map.put(1, "dog");
        map.put(10, "goat");

        for(Integer key: map.keySet()){
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }
}
