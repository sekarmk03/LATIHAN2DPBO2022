import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah memory : ");
        try {
            n = sc.nextInt();
        } catch (Exception e) {
        }
        Memory[] ram;
        ram = new Memory[n];

        for (int i = 0; i < n; i++) {
            System.out.println("+++ Input Detail " + (i+1) + " +++");
            ram[i] = new Memory();
            String idProd = "", price = "", brand = "", model = "", frec = "", size = "", cuda = "";
            System.out.print("Product ID : ");
            try {
                idProd = sc.next();
            } catch (Exception e) {
            }
            System.out.print("Price : ");
            try {
                price = sc.next();
            } catch (Exception e) {
            }
            System.out.print("Brand : ");
            try {
                brand = sc.next();
            } catch (Exception e) {
            }
            System.out.print("Model : ");
            try {
                model = sc.next();
            } catch (Exception e) {
            }
            System.out.print("Frecuency : ");
            try {
                frec = sc.next();
            } catch (Exception e) {
            }
            System.out.print("Size : ");
            try {
                size = sc.next();
            } catch (Exception e) {
            }
            System.out.print("Support Cuda?(yes/no) : ");
            try {
                cuda = sc.next();
            } catch (Exception e) {
            }
            ram[i].setIdProduct(idProd);
            ram[i].setPrice(price);
            ram[i].setBrand(brand);
            ram[i].setModel(model);
            ram[i].setFrecuency(frec);
            ram[i].setMemorySize(size);
            ram[i].setSupportCuda(cuda);
        }

        for (int i = 0; i < ram.length; i++) {
            System.out.println("---- Memory Detail " + (i+1) + " ----");
            System.out.println("Id : " + ram[i].getIdProduct());
            System.out.println("Brand : " + ram[i].getBrand());
            System.out.println("Model : " + ram[i].getModel());
            System.out.println("Size : " + ram[i].getMemorySize());
            System.out.println("Frecuency : " + ram[i].getFrecuency());
            System.out.println("Support Cuda : " + ram[i].getSupportCuda());
            System.out.println("Price : " + ram[i].getPrice() + " IDR\n");
        }
    }

}
