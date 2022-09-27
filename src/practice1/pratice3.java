package practice1;

import java.util.Scanner;

public class pratice3 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a ");
        a = scanner.nextInt();
        System.out.println("enter b ");
        b = scanner.nextInt();
        a= Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b==0){
            System.out.println("no greatest comment facter");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
                System.out.println("a = " + a);
            }else {
                b=b-a;
                System.out.println("b= "+b);
            }
        }
    }
}
