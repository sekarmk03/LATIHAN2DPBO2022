from Memory import *

list = []

n = 0

n = int(input("Masukkan Jumlah Data : "))

for i in range(0, n):
    print("Masukkan data product" + str(i + 1))
    idProduct = input("Id Product: ")
    price = input("Price: ")
    brand = input("Brand: ")
    model = input("Model: ")
    frecuency = input("Frequency: ")
    memorySize = input("Memory Size: ")
    supportsCuda = input("Supports Cuda: ")
    list.append(Memory())
    list[i].setIdProduct(idProduct)
    list[i].setPrice(price)
    list[i].setBrand(brand)
    list[i].setModel(model)
    list[i].setFrecuency(frecuency)
    list[i].setMemorySize(memorySize)
    list[i].setSupportsCuda(supportsCuda)

print("\n\n---> Detail Product <---\n")

for l in list:
    print("---- Product Id " + l.getIdProduct() + " ----")
    print("- Brand : " + l.getBrand())
    print("- Model : " + l.getModel())
    print("- Frecuency : " + l.getFrecuency())
    print("- Memory Size : " + l.getMemorySize())
    print("- Supports Cuda? " + l.getSupportsCuda())
    print("- Price : " + l.getPrice() + " IDR\n")
