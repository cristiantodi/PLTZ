package Java;

class Main{
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------");        
        Uberx uberx = new Uberx("AMQ123 ", new Account("Lucho ", "abc123 "), "Mazda", "model 6 ");
        uberx.setPassenger(4);
        uberx.printDataCar();
        
        UberVan ubenvan = new UberVan(" LICENCIA123",new Account("NombreAndres", "AND123"));
        ubenvan.setPassenger(6);
        System.out.println("----------------------------------------------------------------------------------");        

    }
}