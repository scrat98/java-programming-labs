package scrat98.github.lab2;

public class Main {
  public static void main(String[] args) {
    GenericItem item1 = new GenericItem("name1", 123.0);
    GenericItem item2 = new GenericItem("name2", 1143.0);
    GenericItem item3 = new GenericItem("name3", 1421.0);
    item1.printAll();
    item2.printAll();
    item3.printAll();
    System.out.println();

    GenericItem[] items = new GenericItem[3];
    items[0] = new GenericItem("generic", 123.0);
    items[1] = new FoodItem("food", 123124.0);
    items[2] = new TechicalItem("technical", 1124.0);
    for (GenericItem item : items) {
      item.printAll();
    }
    System.out.println();

    FoodItem food1 = new FoodItem("food1", 123124.0);
    FoodItem food2 = new FoodItem("food2", 123124.0);
    food1.printAll();
    food2.printAll();
    System.out.println(food1.equals(food2));
    FoodItem food1Clonned = food1.clone();
    System.out.println(food1.equals(food1Clonned));
  }
}
