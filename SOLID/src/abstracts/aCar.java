package abstracts;

/**
 * Спроектировать абстрактный класс «Car» у которого должны быть свойства: марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя;
 * методы: движение, обслуживание, переключение передач, включение фар, включение дворников. *
 */


public abstract class aCar {
    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int numberOfWheels;
    private String fuelType;
    private String transmissionType;
    private double engineVolume;

    public aCar(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType, String transmissionType, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineVolume = engineVolume;
    }

    public abstract void move();

    public abstract void service();

    public abstract void shiftGears();

    public abstract void turnOnLights();

    public abstract void turnOnWipers();
}
