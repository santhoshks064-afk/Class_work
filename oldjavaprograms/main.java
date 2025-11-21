/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;

import java.util.Scanner;

/**
 *
 * @author santh
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the gender");
      String s=sc.nextLine();
     if(s.equals("male")||s.equals("female")){
         Scanner sr=new Scanner(System.in);
         int age=sr.nextInt();
         if(age>0&&age<100){
             if(age>=18&&(s.equals("male")||s.equals("MALE"))){
                 System.out.println("he is eligible");
             }
             else if(age>=18&&(s.equals("female")||s.equals("FEMALE")))
                     {
                         System.out.println("she is eligible");
             }
             else{
                 System.out.println("not eligible");
             }
         }
     }
     else{
         System.out.println("invalid");
     }
    }
    
} 