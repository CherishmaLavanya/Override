package com.aasiln.override3;

/**
 * @author lavanya
 * Created a class named CustomMap that implements the Map interface.
 * Override the put() and get() methods to provide a custom implementation. 
 */

import java.util.*;

public  class CustomMap<K, V> implements Map<K, V> {
    private Map<K, V> data;

    public CustomMap() {
        data = new HashMap<>();
    }
//Override the put() 
    @Override
    public V put(K key, V value) {
        if (key == null) {
            throw new NullPointerException("Key cannot be null");
        }
        return data.put(key, value);
    }
//Override the and get() methods 
    @Override
    public V get(Object key) {
        if (key == null) {
            throw new NullPointerException("Key cannot be null");
        }
        return data.get(key);
    }


    //  the CustomMap implementation
    public static void main(String[] args) {
        CustomMap<String, String> cm = new CustomMap<>();

        // Test putting key-value pairs
        cm.put("1", "lavanya");
        cm.put("2", "resh");
        cm.put("3", "priya");

        // Test retrieving values
        System.out.println(cm.get("1")); 
        System.out.println(cm.get("2"));
        System.out.println(cm.get("3"));

        // Test handling null keys
        try {
        	cm.put(null, "likki"); // This will throw  exception that is NullPointerException
        } catch (NullPointerException e) {
           e.printStackTrace();
        }

        // handling null values
        cm.put("4", null);
        System.out.println(cm.get("4")); // Output will be null for this
    }
}