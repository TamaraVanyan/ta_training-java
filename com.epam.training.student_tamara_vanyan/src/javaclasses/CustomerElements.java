package javaclasses;

import java.util.ArrayList;
import java.util.*;

public class CustomerElements {

    public static void main(String args[]) {
        Customer[] mainCostumers = new Customer[5];

        mainCostumers[0] = new Customer(1511345859, "Karen", "Sahakyan", "Armeni",
                "Goris", 1245653699, 1181415259);
        mainCostumers[1] = new Customer(85653269, "Gagik", "Khazaryan", "Armeni",
                "Goris", 253668978, 88752546);
        mainCostumers[2] = new Customer(1511345859, "Mari", "Arzumanyan", "Armeni",
                "Goris", 1143656788, 252425233);
        mainCostumers[3] = new Customer(1511345859, "Gor", "Galstyan", "Armeni",
                "Goris", 1225458574, 1445782536);
        mainCostumers[4] = new Customer(256536645, "Anna", "Petrosyan", "Armeni",
                "Goris", 253656458, 474585253);

        //a list of customers whose credit card number is in the given range.
        int min = 253656459;
        int max = 1225458500;
        System.out.println("\nList of customers whose credit card number is in the (253656459; 1225458500) range.");
        printCustomers(customersOfCredirNumberInterval(mainCostumers, min, max));

        //a list of buyers in alphabetical order;
        System.out.println("\nList of buyers in alphabetical order");
        printCustomersSortedNames(customersOfSortedNames(mainCostumers));

    }
    private static String[] customersOfSortedNames(Customer[] customers){
        String customersName[] = new String[customers.length];
        for(int i = 0; i < customers.length; i++){
                customersName[i] = customers[i].getName();
        }
        Arrays.sort(customersName);
        return customersName;
    }
    private static List<Customer> customersOfCredirNumberInterval(Customer[] customers, int min, int max){
        List<Customer> filteredCustomer = new ArrayList<>();
        for (int i = 0; i < customers.length; i++){

            if(customers[i].getCard() > min  && customers[i].getCard() < max){
                filteredCustomer.add(customers[i]);
            }
        }
        return filteredCustomer;
    }
    private static void printCustomers(List<Customer> customers) {
        for (int i = 0; i < customers.size(); i++)
            System.out.println("Full name: " + customers.get(i).getName() + " " + customers.get(i).getSurname() + ", credit card number: " + customers.get(i).getCard());
    }
    private static void printCustomersSortedNames(String[] names) {
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}