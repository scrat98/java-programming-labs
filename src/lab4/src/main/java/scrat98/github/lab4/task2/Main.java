package scrat98.github.lab4.task2;

import scrat98.github.lab4.task1.ItemCatalog;

public class Main {
  public static void main(String[] args) {
    final ItemCatalog cat = new ItemCatalog();
    CatalogLoader loader = new CatalogStubLoader();
    loader.load(cat);
    cat.printItems();
  }
}
