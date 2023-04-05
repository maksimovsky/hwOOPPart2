public class Truck extends Transport implements WithEngine, WithTrailer {

    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
