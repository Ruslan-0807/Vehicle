public class Vehicle {
    public String brand;
    public int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
 public void displayInfo() {
     System.out.println("Марка : " + brand + "год : " + year );
    }
}
