package com.company;


public class NullPointerException {
    public static void main(String[] args) {
        String s= null;
try{
    System.out.println(s.length());

    }
catch (Exception e) {
    System.out.println("Got rid off null pointer exception");
}

}
    }
