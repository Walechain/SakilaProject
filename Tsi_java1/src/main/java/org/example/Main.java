package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String thanks = "Thank you,";
        String name = "miguel!";
        String order = " Your order number is #";
        int previousOrder = 715;
        System.out.println(thanks + " " + name.toUpperCase() + order + (++previousOrder));

        int x = 50;
        int y = 10;
        if (x > y) {
            System.out.println("Greater");
        }

        if (x == y) {
            System.out.println("equal");
        }

        if (x == y) {
            System.out.println("Equal");

        } else {
            System.out.println("Unequal");
        }

        if (x == y) {
            System.out.println(1);
        } else if (x > y) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }


        int num = 0;
        while (num < 6) {
            System.out.println(num);
            num++;
        }

        do {
            System.out.println(num);
            num++;
        } while (num <= 6);

        for (int d = 3; d <= 31; d +=3){
          String weekday = " ";
          switch (d % 7 ) {
              case 1:
                  weekday = "Monday";
                  break;
              case 2:
                  weekday = "Tuesday";
                  break;
              case 3:
                  weekday = "Wednesday";
                  break;
              case 4:
                  weekday = "Thursday";
                  break;
              case 5:
                  weekday = "Friday";
                  break;
              case 6:
                  weekday = "Saturday";
                  break;
              case 0:
                  weekday = "Sunday";
                  break;
          }
          System.out.println("Day " + d + ", "  + weekday);
        }
    }
}