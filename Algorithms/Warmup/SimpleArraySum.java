import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleArraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum=0;
        for(int i = 0;i<number;i++){
            sum+=sc.nextInt();
        }
        System.out.println(sum);
    }
}