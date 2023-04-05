public abstract class Transport {
    private final String modelName;
    private final int wheelCount;

    public Transport(String modelName, int wheelCount) {
        this.modelName = modelName;
        this.wheelCount = wheelCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}

