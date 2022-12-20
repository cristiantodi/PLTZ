package Java;

class Uberx extends Car {
    String brand;
    String model;

    public Uberx(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }   

    @Override
    void printDataCar() {
    System.out.println("Modelo: " + model + " Marca: " + brand ) ;
        
    }
}

