package practice1;

import java.util.Scanner;
// so nguyen to
public class pratice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number\n");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println(number+ ": is not a prime");

        }else {
            int i =2;
            boolean check = true;
            while (i<number){
                if (number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + ": is a prime");
            else
                System.out.println(number+ ": is not prime ");
        }
    }
}

