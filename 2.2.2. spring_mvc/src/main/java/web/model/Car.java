package web.model;

public class Car {
    private int id;
    private String model;
    private String color;
    private String vin;

    public Car(int id, String model, String color, String vin) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.vin = vin;
    }

    public Car(String model, String color, String vin) {
        this.model = model;
        this.color = color;
        this.vin = vin;
    }

    public Car() {

    }

    public int getId(int COUNT) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getVin() {
        return vin;
    }
}
