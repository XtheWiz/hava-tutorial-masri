package com.ws.javamasri.morecollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap {

    public static void main(String[] args) {
        Map<String, Integer> phoneNumberMap = new HashMap<>();
        phoneNumberMap.put("Nicolas", 1111111);
        phoneNumberMap.put("Travolta", 2222222);
        phoneNumberMap.put("Stallone", 3333333);
        phoneNumberMap.put("Ronaldo", 7777777);

        System.out.println(phoneNumberMap);
        System.out.println(phoneNumberMap.keySet());
        System.out.println(phoneNumberMap.get("Ronaldo"));
        System.out.println(phoneNumberMap.containsKey("Jason"));
        System.out.println(phoneNumberMap.get("Jason"));

        Set<String> keys = phoneNumberMap.keySet();
        for (String key: keys) {
            System.out.println("Names: " + key);
        }

        Collection<Integer> phoneNumbers = phoneNumberMap.values();
        for (Integer number: phoneNumbers) {
            System.out.println("Number " + number);
        }

    }

}
