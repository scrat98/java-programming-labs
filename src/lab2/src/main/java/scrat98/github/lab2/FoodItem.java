package scrat98.github.lab2;

import java.util.Date;

public class FoodItem extends GenericItem {

  private Date dateOfIncome = new Date();

  private short expires = 25920;

  public FoodItem(final String name, final Double price) {
    super(name, price);
  }

  public FoodItem(final String name, final Double price, final short expires) {
    super(name, price);
    this.expires = expires;
  }

  public FoodItem(final String name, final Double price, final Category category) {
    super(name, price, category);
  }

  public FoodItem(final String name, final Double price, final GenericItem analog) {
    super(name, price, analog);
  }

  public FoodItem(
      final String name,
      final Double price,
      final Category category,
      final GenericItem analog
  ) {
    super(name, price, category, analog);
  }

  public FoodItem(
      final String name,
      final Double price,
      final Category category,
      final GenericItem analog,
      final Date dateOfIncome
  ) {
    super(name, price, category, analog);
    this.dateOfIncome = dateOfIncome;
  }

  public FoodItem(
      final String name,
      final Double price,
      final Category category,
      final GenericItem analog,
      final Date dateOfIncome,
      final short expires
  ) {
    super(name, price, category, analog);
    this.dateOfIncome = dateOfIncome;
    this.expires = expires;
  }

  protected FoodItem(FoodItem item) {
    super(item);
    this.dateOfIncome = item.dateOfIncome;
    this.expires = item.expires;
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

    if (!(o instanceof FoodItem)) {
      return false;
    }

    FoodItem other = (FoodItem) o;
    return other.dateOfIncome == dateOfIncome &&
        other.expires == expires;
  }

  @Override
  public FoodItem clone() {
    return new FoodItem(this);
  }

  @Override
  public String toString() {
    return super.toString() + String
        .format("Additional properties - dateOfIncome: %s, expires: %d", dateOfIncome, expires);
  }
}
