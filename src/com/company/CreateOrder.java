package com.company;

//denne kommentar er også en Git øvelse
// Kommentar er modtaget og smider til GITHUB igen

public class CreateOrder {
    private int pizzaNumber;
    private String pizzaName;
    private double orderTime;
    private double orderPickUp;

    public CreateOrder (int pizzaNumber, String pizzaName, double orderTime, double orderPickUp){
        this.pizzaNumber = pizzaNumber;
        this.pizzaName = pizzaName;
        this.orderTime = orderTime;
        this.orderPickUp = orderPickUp;

    }
    public String toString(){
        return ("Pizza number: " + pizzaNumber +  "\nPizza name: "+ pizzaName + "\nOrderTime: " + orderTime + "\nPickup time" +orderPickUp);
    }

    public int getPizzaNumber() {
        return pizzaNumber;
    }

    public void setPizzaNumber(int pizzaNumber) {
        this.pizzaNumber = pizzaNumber;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public double getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(double orderTime) {
        this.orderTime = orderTime;
    }

    public double getOrderPickUp() {
        return orderPickUp;
    }

    public void setOrderPickUp(double orderPickUp) {
        this.orderPickUp = orderPickUp;
    }
}

