/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.util.regex.Matcher; 

import java.util.regex.Pattern; 

import java.util.*; 
 import java.util.Scanner;

public class NewClass {
 
  
 public static boolean isValid(String email) {

     
        
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 

                            "[a-zA-Z0-9_+&*-]+)*@" + 

                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 

                            "A-Z]{2,7}$"; 

                              
        Pattern pat = Pattern.compile(emailRegex); 

        if (email == null) 

            return false; 

        return pat.matcher(email).matches(); 

    } 

  
    public static void main(String[] args) 

    { Scanner input = new Scanner(System.in);
  boolean f = true ;
        ArrayList<String> address = new ArrayList<>();
        do{
           System.out.println(" Please enter your Email Addres ");
          String email = input.next(); 
          address.add(email); 

      

            
        for(String i : address){ 

         if (isValid(i)==false ){
             System.out.println("       ______________________________________");
            System.out.println("     /\\                                      |");
            System.out.println("    /  \\              Sorry                  |");
            System.out.println("   / ): \\         Email is invalid           |");
            System.out.println("  /      \\  Please enter your Email again    |");
            System.out.println(" /________\\__________________________________|");
            System.out.println("\n");
             
             
           f =false ;}
         else {f =true;}      

        }}
        while(f==false);

        
        
    } 
}

