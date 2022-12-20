package Java;
import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Account driver) {
        super(license, driver);
    }
    

    @Override
    public void setPassenger (Integer passenger) {
        // TODO Auto-generated method stub
        if (passenger == 6){ 
            this.passenger = passenger;
        }
        else{
            System.out.println("Dato debe ser 6");
        }
    }
    
}