package com.company;

import java.util.Scanner;

public class showList {
    public static void main(String[] args) {
        CreateOrder[] orders = new CreateOrder[10];
        Scanner console = new Scanner(System.in);

        System.out.println("\t\t\t\t\t***** Velkommen til Mario's Pizzabar! *****\nMed dette program får du en masse muligheder som simplificer Mario's arbejde");

        while (true) {
        System.out.println("Enter \n\n1 : to place an order \n2 : to se the current orderlist \n3 : to delete an order from the list \n4 : to se the Menu card \n5 : to shut down ");
        int menuAnswer = console.nextInt();



            switch (menuAnswer) {

                case 1:
                    System.out.println("How many pizzas do you want to order? ");
                    int pizzaAmount = console.nextInt();
                    getOrder(pizzaAmount, console, orders);
                    break;

                case 2:
                    showOrders(orders);
                    break;

                default:
                    break;

            }
        }

    }
    public static CreateOrder[] showOrders(CreateOrder[] orders){
        for(int k = 0; k < orders.length; k++){
            System.out.println(orders[k]);
            System.out.println();
        }
        return orders;
    }

    public static CreateOrder[] getOrder(int pizzaAmount, Scanner console, CreateOrder[] orders) {
        for (int j = 0; j < orders.length; j++) {
            double orderTime = 0;
            double pickupTime = 0;
            int pizzaNumber = 0;

            if (orders[j] == null) {
                for (int L = 0; j < pizzaAmount; j++) {
                    System.out.println("Enter the number of the Pizza you want");
                    pizzaNumber = console.nextInt();
                    orders[j] = new CreateOrder(pizzaNumber, orderTime, pickupTime);
                }
                System.out.println("Enter the time of ordering. (ex 12,40");
                orderTime = console.nextDouble();
                System.out.println("Enter the time you want to pick up the order");
                pickupTime = console.nextDouble();
                orders[j] = new CreateOrder(pizzaNumber, orderTime, pickupTime);
                break;
            }
            break;
        }
        return orders;
    }
}
