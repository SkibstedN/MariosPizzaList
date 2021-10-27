package com.company;

import java.util.*;

public class MarioScreen {
    public static void main(String[] args) {

        showList listObject = new showList();

        CreateOrder[] orders =


        Scanner console = new Scanner(System.in);

        //showList.showOrders();

        while (true){

            System.out.println("Enter \n\n1 : to place an order \n2 : to se the current orderlist \n3 : to delete an order from the list \n4 : to se the Menu card \n5 : to shut down ");
            int mAnswer = console.nextInt();
            switch (mAnswer){

                case 3:
                    deleteOrder(console, listObject);
                    break;
            }
        }
    }
    public static void deleteOrder(Scanner console, showList listObject){
        System.out.println("Enter the number of the order you want to change");
        int answer = console.nextInt();
        listObject.orders[answer] = null;


    }
}
