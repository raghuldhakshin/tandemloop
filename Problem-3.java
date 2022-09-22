package client;

import java.util.Scanner;


public class Client {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int n = 1;
        System.out.print(n);
        if(a%2==0){
            a = a-1;
        }
        for(int i = 1;i<a;i++){
            n = n+2;
            System.out.print(","+n);
        }
}
}
