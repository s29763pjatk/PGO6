public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2020, 500, 20);
        System.out.println("Efektywność paliwowa samochodu: " + car.calculateFuelEfficiency() + " mil/galon");

        Vehicle truck = new Truck("Volvo", "FH16", 2019, 500, 50, 10);
        System.out.println("Efektywność paliwowa ciężarówki: " + truck.calculateFuelEfficiency() + " mil/galon");
    }
}