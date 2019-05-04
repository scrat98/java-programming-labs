package scrat98.github.lab4.task1;

import scrat98.github.lab2.GenericItem;
import java.util.Date;

public class Main {

  public static void main(String[] args) {
    final ItemCatalog cat = new ItemCatalog();
    cat.addItem(new GenericItem("asfsaf", 0.0));
    cat.addItem(new GenericItem("asfsaf", 0.0));
    cat.addItem(new GenericItem("asfsaf", 0.0));
    cat.addItem(new GenericItem("asfsaf", 0.0));
    cat.addItem(new GenericItem("asfsaf", 0.0));
    cat.addItem(new GenericItem("asfsaf", 0.0));
    cat.addItem(new GenericItem("asfsaf", 0.0));
    cat.addItem(new GenericItem("asfsaf", 0.0));
    cat.addItem(new GenericItem("asfsaf", 0.0));

    long begin = new Date().getTime();
    for (int i = 0; i < 1e5; i++) {
      cat.findItemByID(10);
    }
    long end = new Date().getTime();
    System.out.println("In HashMap: " + (end - begin));

    begin = new Date().getTime();
    for (int i = 0; i < 1e5; i++) {
      cat.findItemByIDAL(10);
    }
    end = new Date().getTime();
    System.out.println("In ArrayList: " + (end - begin));
  }
}
