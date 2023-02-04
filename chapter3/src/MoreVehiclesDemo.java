public class MoreVehiclesDemo {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        Vehicle bus1 = new Vehicle();
        bus1.passengers = 45;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup = 45;

        double interval = 1.25;
        double distanceCar = car1.maxspeed * interval;
        double distanceBus = bus1.maxspeed * interval;

        System.out.println("Car1 можнт проехать за 1 час 15 минут расстояние в " + distanceCar + " км.");
        System.out.println("Bus1 может проехать за 1 час 15 минут расстояние в " + distanceBus + " км.");
    }
}
