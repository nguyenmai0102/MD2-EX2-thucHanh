package practice1;

import java.util.Scanner;

public class pratice4 {
    public static void main(String[] args) {
        int choice=-1;
        Scanner input = new Scanner(System.in);
        while (choice!=0){
            System.out.println("1: draw the triangle");
            System.out.println("2: draw the square");
            System.out.println("3: draw the rectangle");
            System.out.println("0: exit");
            System.out.println("enter your choice: ");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1: draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("2: draw the square");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    break;
                case 3:
                    System.out.println("3: draw the rectangle");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice");

            }
        }
    }
}

