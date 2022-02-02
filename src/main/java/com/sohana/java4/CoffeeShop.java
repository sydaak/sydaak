package com.sohana.java4;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        System.out.println("after push in the github");
        System.out.println("after push in the github");
        System.out.println("after push in the github");
        Scanner obj= new Scanner(System.in);
        System.out.println("What size of coffee you want? For large press L.For Medium press M. For small press S");
        String size=obj.nextLine();
        //String add=obj.nextLine();


        if(size.equalsIgnoreCase("L"))
        {
            System.out.println("you select large size");
            System.out.println("Number of coffee?");
            int num= obj.nextInt();
            int price=5;
            int totalbill= num*price;
            System.out.println("your total coffee price="+totalbill);
        }

       else if(size.equalsIgnoreCase("M"))
            {
                System.out.println("you select medium size");
                System.out.println("Number of coffee?");
                int num= obj.nextInt();
                int price=3;
                int totalbill= num*price;
                System.out.println("your total coffee price="+totalbill);
            }

       else if(size.equalsIgnoreCase("S"))
        {
            System.out.println("you select small size");
            System.out.println("Number of coffee?");
            int num= obj.nextInt();
            int price=2;
            int totalbill= num*price;
            System.out.println("your total coffee price="+totalbill);
        }

       else {
            System.out.println("You enter invalid word");
        }


    }


}
