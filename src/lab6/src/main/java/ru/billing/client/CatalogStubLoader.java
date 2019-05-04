package ru.billing.client;

import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;
import scrat98.github.lab2.Category;
import scrat98.github.lab2.FoodItem;
import scrat98.github.lab2.GenericItem;
import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {

  public void load(final ItemCatalog cat)
  throws CatalogLoadException {
    final GenericItem item1 = new GenericItem("Sony TV", 23000.0);
    final FoodItem item2 = new FoodItem("Bread", 12.0, Category.FOOD, null, new Date(), (short) 10);

    try {
      cat.addItem(item1);
      cat.addItem(item2);
    } catch (ItemAlreadyExistsException e) {
      e.printStackTrace();
      throw new CatalogLoadException(e.getMessage());
    }
  }
}
