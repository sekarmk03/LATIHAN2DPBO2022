class Product {
    private String price;
    private String idProduct;

    Product() {
        this.price = "";
        this.idProduct = "";
    }

    void setPrice(String price) {
        this.price = price;
    }

    String getPrice() {
        return this.price;
    }

    void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    String getIdProduct() {
        return this.idProduct;
    }
}