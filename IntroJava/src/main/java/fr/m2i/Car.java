package fr.m2i;

public class Car extends Vehicle {

    public Car(){
        this.gasCapacity = 50;
        this.speed = 0;
        this.gasConsumption = 7;
        this.passengerCapacity = 5;
        this.currentGas = gasCapacity;
    }

    public Car(float gasCapacity, int passengerCapacity)throws Exception{
        if(gasCapacity < 0 || passengerCapacity < 0){
            throw new Exception("La quantité d'essence et la capacité du véhicule ne peuvent pas être négatif.");}
        this.gasCapacity = gasCapacity;
        this.passengerCapacity = passengerCapacity;
        this.speed = 0;
        this.gasConsumption = 7;
        this.currentGas = gasCapacity;
    }

    @Override
    public void accelerate() {
        if(speed <= 220){
        this.speed = speed + 10;
        }

        System.out.println("j'avance à" + speed + "km/h");
    }

    @Override
    public void brake() {
        System.out.println("Je freine");
    }
}








