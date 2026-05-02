class Car{
    String color;
    String model;
    String brand;
    int mileage;
    int no_of_gears;

    Car(String color,String model,String brand,int mileage,int no_of_gears){
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.no_of_gears=no_of_gears;
    }

    void applyBrake(){
        System.out.println("Breaking");
    }
    void applySpeed(){
        System.out.println("Speed....");
    }
    void shiftGear(){
        System.out.println("Shifting gear...");
    }
}

class Verna extends Car{
    int capacity;
    Verna(String color,String model,String brand,int mileage,int no_of_gears){
        super(color,model,brand,mileage,no_of_gears);
        this.capacity = capacity;
    }

    void airbags(){
        System.out.println("Airbags...");
    }
}
public class Inheritance1 {
    public static void main(String[] args){
        Verna v = new Verna("Black","Second TOP","H",15,5);
        v.applyBrake();
        v.applySpeed();
        v.shiftGear();
        v.airbags();
    }
}