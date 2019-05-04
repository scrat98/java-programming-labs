package scrat98.github.lab4.task2;

import scrat98.github.lab2.Category;
import scrat98.github.lab2.FoodItem;
import scrat98.github.lab2.GenericItem;
import scrat98.github.lab4.task1.ItemCatalog;
import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {

  public void load(final ItemCatalog cat) {
    final GenericItem item1 = new GenericItem("Sony TV", 23000.0, Category.GENERAL);
    final FoodItem item2 = new FoodItem("Bread", 12.0, Category.FOOD, null, new Date(), (short) 10);

    cat.addItem(item1);
    cat.addItem(item2);
  }
}
