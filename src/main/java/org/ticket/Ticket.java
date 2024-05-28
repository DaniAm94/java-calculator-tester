package org.ticket;

public class Ticket {
    private double distance;
    private int age;
    private double price;
    public final double PRICE_KM = 0.21;
    public final double SALE_UNDER_18 = 0.20;
    public final double SALE_OVER_65 = 0.40;

    public Ticket(double distance, int age){
        this.distance= validateDistance(distance);
        this.age= validateAge(age);
        this.price= calculatePrice();
    }

    public double getDistance() {
        return distance;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    private double calculatePrice(){
        double price = distance * PRICE_KM;
        if (age < 18){
            price = price - price * SALE_UNDER_18;
        } else if (age > 65) {
            price = price - price * SALE_OVER_65;
        }
        return price;
    }

    private double validateDistance(double distance){
        if (distance <= 0){
            throw new IllegalArgumentException("Distanza non valida");
        }
        return distance;
    }

    private int validateAge(int age){
        if (age < 0 || age > 120){
            throw new IllegalArgumentException("Età non valida");
        }
        return age;
    }
}
