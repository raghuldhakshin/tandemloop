
package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arrRef = {1,2,3,4,5,6,7,8,9};
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int arrLen = arr.length;
        int count = 0;
        System.out.print("{");
        for(int i = 0;i<arrRef.length;i++){
            for(int j = 0;j<arrLen;j++){
                if(arr[j]%arrRef[i]==0){
                    count++;
                }
            }
            if(i == arrRef.length-1){
                System.out.print(arrRef[i]+":"+count);
            }
            else{
                System.out.print(arrRef[i]+":"+count+",");
            }
            count = 0;
        }
        System.out.print("}");
        
    }
    
}
