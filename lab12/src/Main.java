class Car {
    private String brand;
    private String model;
    protected int yearOfManufacture;
    private String fuelType;
    private int power;
    private String owner;

    public Car(String brand, String model, int yearOfManufacture, String fuelType, int power, String owner) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.fuelType = fuelType;
        this.power = power;
        this.owner = owner;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public String getFuelType() {
        return fuelType;
    }
    public int getPower() {
        return power;
    }
    public String getOwner() {
        return owner;
    }

    public void showData() {
        System.out.println(brand + " " + model + " " + yearOfManufacture + " " + fuelType + " Power: " + power + " Owner: " + owner);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2018, "Gasoline", 200, "Ivan");
        Car car2 = new Car("Tesla", "Model 3", 2021, "Electric", 350, "Maria");
        Car car3 = new Car("BMW", "X5", 2019, "Diesel", 300, "Alex");

        car1.showData();
        car2.showData();
        car3.showData();
    }
}
