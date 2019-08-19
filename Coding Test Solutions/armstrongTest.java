package com.example.week2daily1codingtest;

public class armstrongTest {
    public static void main(String[] args) {
        int checkInt = 153;
        if(ArmstrongTest(checkInt)){
            System.out.println(String.format("%d is an Armstrong Number", checkInt));
        } else {
            System.out.println(String.format("%d is not an Armstrong Number", checkInt));
        }

    }

    public static boolean ArmstrongTest(int isArmstrong){
        String numberString = Integer.toString(isArmstrong);
        int total = 0;
        for(int i=0; i<numberString.length(); i++){
            total += (int) Math.pow(Character.getNumericValue(numberString.charAt(numberString.length()-i-1)), 3);
        }
        if(isArmstrong == total)
            return true;
        else
            return false;
    }
}
