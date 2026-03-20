import java.util.HashMap;

public class RoomInventory {
    HashMap<String, Integer> inventory;

    public RoomInventory(){
        inventory=new HashMap<>();
        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);
    }
    public void initializeInventory(){

    }
    public HashMap<String, Integer> getInventory(){
        return inventory;
    }

    public void updateAvailability(String roomType, int count){
        inventory.put(roomType, count);
    }
    public void displayInventory() {
        for (String key : inventory.keySet()) {
            System.out.println(key + " Available: " + inventory.get(key));
        }
    }
}
