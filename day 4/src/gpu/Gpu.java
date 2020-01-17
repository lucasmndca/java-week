package gpu; //States which package our class belongs to. {PackagesAPIsAndInheritance exercise}

import java.util.Date;

abstract class Gpu {

    private float price;
    private String brand;

    public void setPrice(float price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
