
public abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight){
        this.numberOfBeds=numberOfBeds;
        this.squareFeet=squareFeet;
        this.pricePerNight=pricePerNight;
    }
    public void displayRoomDetails(){
        System.out.println("Number of beds: "+numberOfBeds);
        System.out.println("Room size: "+squareFeet+" sq. ft");
        System.out.println("Price per night: "+pricePerNight);
    }
}
