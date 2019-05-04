package scrat98.github.lab3;

import scrat98.github.lab2.FoodItem;

public class Main {
  public static void main(String[] args) {
    final String line = "Конфеты ’Маска’;45;120";
    final String[] item_fld = line.split(";");

    final FoodItem fi = new FoodItem(
        item_fld[0],
        Double.parseDouble(item_fld[1]),
        Short.parseShort(item_fld[2])
    );

    fi.printAll();
  }
}
