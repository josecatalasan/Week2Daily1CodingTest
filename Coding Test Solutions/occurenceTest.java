package com.example.week2daily1codingtest;

import java.util.HashMap;
import java.util.Map;

public class occurenceTest {
    public static void main(String[] args) {
        int [] testArray = {1,1,1,2,2,2,100,100,100,3,3,4,4,5,5,3};

        getMostOccurence(testArray);

    }

    public static void getMostOccurence (int [] intArray){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int occurenceCount = 0;

        for(int i: intArray){
            if(hashMap.containsKey(i)){
                hashMap.put(i, hashMap.get(i)+1);
            } else{
                hashMap.put(i, 1);
            }
            if(hashMap.get(i) > occurenceCount){
                occurenceCount = hashMap.get(i);
            }
        }

        System.out.print("Most frequent integers: ");
        for(Map.Entry<Integer, Integer> e: hashMap.entrySet()){
            if(e.getValue()  == occurenceCount)
                System.out.printf("%d ", e.getKey().intValue());
        }
        System.out.println();
    }
}
