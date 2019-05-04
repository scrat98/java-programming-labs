public class U0901WorkArray<T extends Number> {

  private T[] arrNums;

  U0901WorkArray(final T[] numP) {
    arrNums = numP;
  }

  public double sum() {
    double sum = 0.0;
    for (final T num : arrNums) {
      sum += num.doubleValue();
    }
    return sum;
  }
}
