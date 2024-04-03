package org.example;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        while(num <= 6){
            System.out.println(num);
            num++;
        }

        num = 0; // Reset num to 0

        do{
            System.out.println(num);
            num++;
        }while (num <= 6);
    }
}