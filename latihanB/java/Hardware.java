class Hardware extends Product {
    private String brand;
    private String model;

    Hardware() {
        this.brand = "";
        this.model = "";
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return this.brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return this.model;
    }

}