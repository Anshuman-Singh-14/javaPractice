package learning;

import java.util.Scanner;

public class OutputFormatting {
    //we need output like
    /*
     * 
     * for input:
     *  
     * java 100
     * cpp 65
     * python 50
     * 
     * output shud be: 
     * 
     * java           100 
     * cpp            065 
     * python         050 
     * 
     * 
     * so basically there shud be exactly 15 characters before the leftmost digit  including whitespaces
     * and for a number having less than 3 digits, preceding zeroes must be added manually 
     * 
     */
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
            }
            System.out.println("================================");

    }



}
