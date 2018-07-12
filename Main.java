package com.company;

public class Main {

    public static void main(String[] args) {
	    ListGen<Integer> arr = new ListGen<>();
	    arr.add(7);

        arr.add(2,12);
        System.out.println(arr);
    }
}
