public class Car {
    String make;
    int speed = 0;

    void accelerate(int increment) {
        speed += increment;
        System.out.println(make+"accelerated to " + speed + " km/h");
    }
    void brake(int decrement) {
        speed -= decrement;
        System.out.println(make+" braked to " + speed + " km/h");
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = "Nissan";
        myCar.accelerate(50);
        myCar.brake(20);
        myCar.accelerate(30);
    }
}
