public class TechicalItem extends GenericItem {

  private short warrantyTime = 3;

  public TechicalItem(final String name, final Double price) {
    super(name, price);
  }

  public TechicalItem(final String name, final Double price, final Category category) {
    super(name, price, category);
  }

  public TechicalItem(final String name, final Double price, final GenericItem analog) {
    super(name, price, analog);
  }

  public TechicalItem(
      final String name,
      final Double price,
      final Category category,
      final GenericItem analog
  ) {
    super(name, price, category, analog);
  }

  protected TechicalItem(TechicalItem item) {
    super(item);
    this.warrantyTime = item.warrantyTime;
  }

  public TechicalItem(
      final String name,
      final Double price,
      final Category category,
      final GenericItem analog,
      final short warrantyTime
  ) {
    super(name, price, category, analog);
    this.warrantyTime = warrantyTime;
  }

  @Override
  public void printAll() {
    System.out.println(toString());
  }

  @Override
  public boolean equals(Object o) {
    if (!super.equals(o)) {
      return false;
    }

    if (!(o instanceof TechicalItem)) {
      return false;
    }

    TechicalItem other = (TechicalItem) o;
    return other.warrantyTime == warrantyTime;
  }

  @Override
  public TechicalItem clone() {
    return new TechicalItem(this);
  }

  @Override
  public String toString() {
    return super.toString() +
        String.format("Additional properties - warrantyTime: %d", warrantyTime);
  }
}
