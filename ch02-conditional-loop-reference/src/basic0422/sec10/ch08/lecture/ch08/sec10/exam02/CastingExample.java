package basic0422.sec10.ch08.lecture.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();


        vehicle.run();
//        checkFare();


        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}