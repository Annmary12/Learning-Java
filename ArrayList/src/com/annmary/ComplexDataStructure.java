package com.annmary;

import java.util.*;

public class ComplexDataStructure {
  protected static String[] vehicles = {
    "helicopter", "volks-wagen", "lifeboat"
  };

  protected static String[][] drivers = {
      {"Jane", "Joe", "Livinus"},
      {"Joe", "Greg", "Kcee", "Douglas"},
      {"Longe", "Saheed", "Jerry"},
  };

  public static void main(String[] arg){
    Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

    for(int i = 0; i < vehicles.length; i++){
      String vehicle = vehicles[i];
      String[] driversList = drivers[i];
      Set<String> driverSet = new LinkedHashSet<String>(Arrays.asList(driversList));

      personnel.put(vehicle, driverSet);
    }

    // Iterate through a particular set
    {
      Set<String> drivers = personnel.get("lifeboat");

      for(String driver: drivers){
        System.out.println(driver);
      }
    }
    System.out.println("\nIterating through the whole set\n");
    // iterate thought the whole set
    {
      for(String key: personnel.keySet()){
        Set<String> drivers = personnel.get(key);
        System.out.print(key + ": ");
        for(String driver: drivers){
          System.out.print(driver);
          System.out.print(", ");
        }
        System.out.println("");
      }
    }
  }
}
