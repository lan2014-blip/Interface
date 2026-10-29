 public class Main{
    public static void main(String[] args){
        Car car=new Car();
        car.changeGear(2);
        car.speedUp(4);
        car.applyBrakes(3);
        car.printStates();

        Bicycle bicycle=new Bicycle();
        bicycle.changeGear(1);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        bicycle.printStates();
    }
 }

 interface Vehicle{
    //all are abstract method
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
 }

 class Car implements Vehicle{
    int speed;
    int gear;

    //to change the gear
    @Override 
    public void changeGear(int newGear){
        gear=newGear;
    }

    @Override 
    public void speedUp(int increment){
        speed=speed+increment;
    }

    @Override 
    public void applyBrakes(int decrement){
        speed=speed-decrement;
    }

    public void printStates(){
        System.out.println("speed:" +speed+"gear:" + gear);
    }
 }

 class Bicycle implements Vehicle{
    int speed;
    int gear;

    @Override 
    public void changeGear(int newGear){
        gear=newGear;
    }

    @Override 
    public void speedUp(int increment){
        speed=speed+increment;
    }

    @Override 
    public void applyBrakes(int decrement){
        speed=speed-decrement;
    }

    public void printStates(){
        System.out.println("speed:" +speed+"gear:" + gear);
    }
 }