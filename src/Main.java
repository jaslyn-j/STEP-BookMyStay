import java.util.*;
/*
@author: Jaslyn Jacob
@version: 3.0;
 */
public class Main{
  public static void main(String[] args){
    System.out.println("Welcome to Hotel Management System");
    System.out.println("System initialized successfully");

    RoomInventory inv = new RoomInventory();

    inv.displayInventory();

    inv.updateAvailability("Single", 4);

    System.out.println("After Update");

    inv.displayInventory();

  }
}