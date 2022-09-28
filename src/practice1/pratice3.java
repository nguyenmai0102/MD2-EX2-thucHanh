package practice1;

import java.util.Scanner;

public class pratice3 {
    public static void main(String[] args) {
        // tim uoc chung lon nhat
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a ");
        a = scanner.nextInt();
        System.out.println("enter b ");
        b = scanner.nextInt();
//        a= Math.abs(a);
//        b = Math.abs(b);
//        if (a==0 || b==0){
//            System.out.println("no greatest comment facter");
//        }
//        while (a!=b){
//            if (a>b){
//                a=a-b;
//                System.out.println("a = " + a);
//            }else {
//                b=b-a;
//                System.out.println("b= "+b);
//            }
//        }


        if (a==b && a!=0){
            System.out.println("uoc chung lon nhat cua 2 so la"+a);
        }else if (a==b&& a==0){
            System.out.println("khong co uoc chung");
        }else {
            while (a!=b){
                if (a>b){
                    a-=b;
                }else {
                    b=-a;
                }
            }
            System.out.println("uoc chung lon nhat cua hai so la: "+a);
        }
    }
}
