#include <iostream>
#include <string>
#include "Memory.cpp"

using namespace std;

int main()
{
    Memory ram1[100];
    bool loop = true;
    int i = 0;

    while (loop)
    {
        string brand, model, frecuency, supportsCuda, price, idProduct, memorySize;
        cout << "++++ Input Data Produk ++++" << endl;
        cout << "Id Product: ";
        cin >> idProduct;
        cout << "Price: ";
        cin >> price;
        cout << "Brand: ";
        cin >> brand;
        cout << "Model: ";
        cin >> model;
        cout << "Frecuency: ";
        cin >> frecuency;
        cout << "Memory Size: ";
        cin >> memorySize;
        cout << "Supports Cuda: ";
        cin >> supportsCuda;

        ram1[i].setIdProduct(idProduct);
        ram1[i].setPrice(price);
        ram1[i].setBrand(brand);
        ram1[i].setModel(model);
        ram1[i].setFrecuency(frecuency);
        ram1[i].setMemorySize(memorySize);
        ram1[i].setSupportsCuda(supportsCuda);

        char next;
        cout << "Lanjut memasukan data (Y/N) : ";
        cin >> next;

        if (next == 'y' || next == 'Y')
        {
            loop = true;
        }
        else
        {
            loop = false;
        }
        i++;
    }

    cout << endl;

    for (int j = 0; j < i; j++)
    {
        cout << "---- Detail Data " << j+1 << " ----" << endl;
        cout << "Product Id : " << ram1[j].getIdProduct() << endl;
        cout << "Brand : " << ram1[j].getBrand() << endl;
        cout << "Model : " << ram1[j].getModel() << endl;
        cout << "Frecuency : " << ram1[j].getFrecuency() << endl;
        cout << "Memory Size : " << ram1[j].getMemorySize() << endl;
        cout << "Supports Cuda : " << ram1[j].getSupportsCuda() << endl;
        cout << "Price : " << ram1[j].getPrice() << endl << endl;
    }

    return 0;
}