package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        double tip = cost * ((double) percent / 100); // calculates tip needed to be paid
        double totalCost = cost + tip; // calculates total including tip
        double costPP = cost / people; // calculates cost per person before tip
        double tipPP = tip / people; // calculates tip per person
        double totalCostPP = totalCost / people; // calculates total cost per person

        result.append("-------------------------------\n");
        result.append("Total bill before tip: "); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("$" + (Math.round(cost * 100.0) / 100.0) + "\n");
        result.append("Total percentage: ");
        result.append(percent + "%\n");
        result.append("Total tip: ");
        result.append("$" + (Math.round(tip * 100.0) / 100.0) + "\n");
        result.append("Total Bill with tip: ");
        result.append("$" + (Math.round(totalCost * 100.0) / 100.0) + "\n");
        result.append("Per person cost before tip: ");
        result.append("$" + (Math.round(costPP * 100.0) / 100.0) + "\n");
        result.append("Tip per person: ");
        result.append("$" + (Math.round(tipPP * 100.0) / 100.0) + "\n");
        result.append("Total cost per person: ");
        result.append("$" + (Math.round(totalCostPP * 100.0) / 100.0) + "\n");
        result.append("-------------------------------\n");

        /* I learned how to round using Math.round from https://www.educative.io/answers/how-to-use-the-java-mathround-method */

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;  
        String input = "";
    
        //Your scanner object and while loop should go here
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an item name or type '-1' to finish: ");
        String items = scan.nextLine();
        items += "\n";
        while (!"-1".equals(input)) {
            System.out.print("Enter an item name or type '-1' to finish: ");
            items += scan.nextLine();
            items += "\n";
            System.out.print(items);
        }

        System.out.println(calculateTip(people,percent,cost,items));
    }
}
