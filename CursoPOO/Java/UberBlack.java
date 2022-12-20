package Java;
import java.util.ArrayList;
import java.util.Map;

class UberPool extends Car{
    Map<String, ArrayList<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberPool(String license, Account driver,
     Map<String, ArrayList<String, Integer>> typeCarAccepted,
     ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted= typeCarAccepted;
        this.seatsMaterial=seatsMaterial;
    }
    
}