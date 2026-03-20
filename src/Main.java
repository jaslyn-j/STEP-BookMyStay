import java.util.*;
import java.io.*;
/*
@author: Jaslyn Jacob
@version: 12.0;
 */

class DataStore12 implements Serializable {

  HashMap<String, Integer> inventory;

  DataStore12() {

    inventory = new HashMap<>();

    inventory.put("Single", 2);
    inventory.put("Double", 1);
  }
}

class PersistenceService12 {

  String file = "data.ser";

  void save(DataStore12 d) {

    try {

      ObjectOutputStream o =
              new ObjectOutputStream(
                      new FileOutputStream(file));

      o.writeObject(d);

      o.close();

      System.out.println("Saved");

    } catch (Exception e) {

      System.out.println("Save error");
    }
  }

  DataStore12 load() {

    try {

      ObjectInputStream i =
              new ObjectInputStream(
                      new FileInputStream(file));

      DataStore12 d =
              (DataStore12) i.readObject();

      i.close();

      System.out.println("Loaded");

      return d;

    } catch (Exception e) {

      System.out.println("No file, new data");

      return new DataStore12();
    }
  }
}

public class Main{

  public static void main(String[] args) {

    PersistenceService12 p =
            new PersistenceService12();

    DataStore12 d =
            p.load();

    System.out.println(d.inventory);

    d.inventory.put("Single",
            d.inventory.get("Single") - 1);

    p.save(d);
  }
}