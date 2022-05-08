package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);

        System.out.println("plz enter a number");
        int myInt=sc.nextInt();


        switch (myInt){

            case 0:
                System.out.println("you enter 0");
                break;

            case 1:
                System.out.println("you enter 1");
                break;

            default:
                System.out.println("you enter number");
                break;
        }
    }
}
