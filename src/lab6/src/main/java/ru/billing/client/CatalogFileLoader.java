package ru.billing.client;

import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;
import scrat98.github.lab2.Category;
import scrat98.github.lab2.FoodItem;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class CatalogFileLoader implements CatalogLoader {

  private String fileName;

  public CatalogFileLoader(String fileName) {
    this.fileName = fileName;
  }

  public void load(final ItemCatalog cat)
  throws CatalogLoadException {
    File f = new File(fileName);
    FileInputStream fis;
    String line;
    try {
      fis = new FileInputStream(f);
      Scanner s = new Scanner(fis);

      while (s.hasNextLine()) {
        line = s.nextLine();
        if (line.length() == 0) {
          break;
        }
        String[] item_fld = line.split(";");
        String name = item_fld[0];
        Double price = Double.parseDouble(item_fld[1]);
        short expires = Short.parseShort(item_fld[2]);
        FoodItem item = new FoodItem(name, price, Category.FOOD, null, new Date(), expires);
        cat.addItem(item);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new CatalogLoadException(e.getMessage());
    } catch (ItemAlreadyExistsException e) {
      e.printStackTrace();
      throw new CatalogLoadException(e.getMessage());
    }
  }
}
