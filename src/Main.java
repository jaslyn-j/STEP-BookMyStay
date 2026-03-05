import java.util.*;
/*
@author: Jaslyn Jacob
@version: 2.0;
 */
public class Main{
  public static void main(String[] args){
    System.out.println("Welcome to Hotel Management System");
    System.out.println("System initialized successfully");

    SingleRoom single=new SingleRoom();
    DoubleRoom doubl=new DoubleRoom();
    SuiteRoom suite=new SuiteRoom();

    System.out.println("Single Room: ");
    single.displayRoomDetails();
    System.out.println("\n");
    System.out.println("Double Room: ");
    doubl.displayRoomDetails();
    System.out.println("\n");
    System.out.println("Suite Room: ");
    suite.displayRoomDetails();

  }
}