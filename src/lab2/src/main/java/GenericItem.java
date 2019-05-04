public class GenericItem {

  protected Integer id;

  protected String name;

  protected Double price;

  protected Category category;

  protected GenericItem analog;

  public GenericItem(final String name, final Double price) {
    this(name, price, Category.GENERAL, null);
  }

  public GenericItem(final String name, final Double price, final Category category) {
    this(name, price, category, null);
  }

  public GenericItem(final String name, final Double price, final GenericItem analog) {
    this(name, price, Category.GENERAL, analog);
  }

  public GenericItem(
      final String name,
      final Double price,
      final Category category,
      final GenericItem analog
  ) {
    this.id = getNextId();
    this.name = name;
    this.price = price;
    this.category = category;
    this.analog = analog;
  }

  protected GenericItem(GenericItem item) {
    this(item.name, item.price, item.category, item.analog);
    id = item.id;
  }

  public void printAll() {
    System.out.println(toString());
  }

  private static int currentId = 0;

  private static Integer getNextId() {
    return GenericItem.currentId++;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }

    if (o == this) {
      return true;
    }

    if (!(o instanceof GenericItem)) {
      return false;
    }

    GenericItem other = (GenericItem) o;
    return other.id.equals(id) &&
        other.name.equals(name) &&
        other.price.equals(price) &&
        other.category == category &&
        other.analog == analog;
  }

  @Override
  public GenericItem clone() {
    return new GenericItem(this);
  }

  @Override
  public String toString() {
    return String.format("ID: %d , Name: %-20s , price:%5.2f , category: %s, analog: %s\n",
        id, name, price, category, analog);
  }
}
