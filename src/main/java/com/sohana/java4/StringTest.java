package com.sohana.java4;

import java.util.Locale;
import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {


    String fname= "SyEda";
    String lname= "SoHana";

    String fullname= fname+" "+ lname;
        //System.out.println(fullname);
    String up=fname.toUpperCase();
    String up1=lname.toUpperCase();

    System.out.println(up+" "+up1);
    //String lo=fname.toLowerCase();

        int pw=12345;
        Scanner obj = new Scanner(System.in);

  System.out.println("Enter Your Password");
        int password= obj.nextInt();
        System.out.println(password);

        if(password==pw)

        {
            System.out.println("You Enter Right Password");
        }
        else{

            System.out.println("You Enter Invalid Password");
            System.exit( 0);
        }

    }

}
