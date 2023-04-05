public class ServiceStation {

    public void check(Car car) {
        printNotice(car);
        updateAllTyres(car);
        car.checkEngine();
    }

    public void check(Bicycle bicycle) {
        printNotice(bicycle);
        updateAllTyres(bicycle);
    }

    public void check(Truck truck) {
        printNotice(truck);
        updateAllTyres(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    public static void printNotice(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
    }
    public static void updateAllTyres(Transport transport) {
        for (int i = 0; i < transport.getWheelCount(); i++) {
            transport.updateTyre();
        }
    }
}
