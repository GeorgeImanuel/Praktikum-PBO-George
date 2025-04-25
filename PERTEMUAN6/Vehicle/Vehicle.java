/**
 * File         : Vehicle.java
 * Deskripsi    : Program latihan penggunaan Polimorfisme Universal: Inclusion. Pembuatan Superclass Vehicle
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance*price;
        System.out.println("Vehicle price = "+fare);
    }
}