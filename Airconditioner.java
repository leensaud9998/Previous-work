package GUI;

public interface Airconditioner{
void raiseTemp(int degrees);
void lowerTemp(int degrees);
}
public abstract class Vehicle implements Airconditioner{
private String type; //type of vehicle i.e. car, bus, motorcycle
protected double temperature;
public Vehicle(String type, double temperature) {
this.type = type;
this.temperature = temperature;
System.out.printIn("Vehicle created!");
}
@Override
public String toString(){
return "Vehicle Type: " + type + ", Temperature: " + temperature;
}
}
public class Car extends Vehicle{
private double horsepower;

public Car(String type, double temperature, double horsepower){
super(type, temperature);
this.horsepower = horsepower;
System.out.println("Car initiated");
@Override
public void raiseTemp(int degrees) {
temperature += degrees;
}
@Override
public void lowerTemp(int degrees){
temperature -= degrees;
)
@Override
public String toString0 (
return super.toString0 + "In" + "Car Horsepower: " + horsepower;
}

public class House implements Airconditioner(
private String type; /type of house small, medium, large
private int floors; //number of floors in the house
double temperature;
public House(String type, int floors, double temperature){
this.type - type;
this.floors = floors;
this.temperature = temperature;
}
@Override
public void raiseTemp(int degrees){
temperature = temperature + degrees + floors;
}
}
@Override
public void lowerTemp(int degrees){
temperature = temperature - degrees + floors;}
@Override
public String toString(){
return "House Type: " + type + " Floors: "+ floors + " Temperature: "+ temperature;}
public class Test1 {
public static void main (String] args) {
Car car I = new Car("Car", 75.0, 300);
House housel = new House("medium", 3, 78);
Airconditioner[] AC = new Airconditioner[2];
AC[0] = carl;
AC[I] = housel;
for(Airconditioner air: AC)
if (air != null && air instanceof Car)
System.out.printIn(air);
}
}