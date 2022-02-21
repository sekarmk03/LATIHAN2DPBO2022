#include <iostream>
#include <string>

using namespace std;

class Product {
    private:
        string price;
        string idProduct;
    
    public:
        Product() {
        }

        Product(string price, string idProduct) {
            this->price = price;
            this->idProduct = idProduct;
        }

        void setPrice(string price) {
            this->price = price;
        }

        string getPrice() {
            return this->price;
        }

        void setIdProduct(string idProduct) {
            this->idProduct = idProduct;
        }

        string getIdProduct() {
            return this->idProduct;
        }

        ~Product(){
        }
};