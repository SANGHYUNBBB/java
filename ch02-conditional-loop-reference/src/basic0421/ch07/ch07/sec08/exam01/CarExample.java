package basic0421.ch07.ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        Tire tire = new HankookTire();
        myCar.tire = tire;
        myCar.run();
    }
}
