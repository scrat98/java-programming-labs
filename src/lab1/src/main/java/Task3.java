import javafx.util.Pair;
import java.util.Date;

public class Task3 {
  public static void main(String[] args) {

    for (char i = 'a'; i < 'z'; i++) {
      System.out.print(i);
    }
    System.out.println();

    Pair<Long, Long> withForCycle = withForCycle();
    Pair<Long, Long> withWhileCycle = withWhileCycle();

    System.out.println(String.format(
        "With for cycle\n"
            + "With int: %d\n"
            + "With long: %d",
        withForCycle.getKey(), withForCycle.getValue()
    ));

    System.out.println(String.format(
        "With while cycle\n"
            + "With int: %d\n"
            + "With long: %d",
        withWhileCycle.getKey(), withWhileCycle.getValue()
    ));
  }

  private static Pair<Long, Long> withForCycle() {
    long startInt = new Date().getTime();
    for (int i = 0; i < 1e8; i++) {
      continue;
    }
    long endInt = new Date().getTime();

    long startLong = new Date().getTime();
    for (long i = 0; i < 1e8; i++) {
      continue;
    }
    long endLong = new Date().getTime();

    return new Pair<Long, Long>(endInt - startInt, endLong - startLong);
  }

  private static Pair<Long, Long> withWhileCycle() {
    long startInt = new Date().getTime();
    int iInt = 0;
    while (iInt < 1e8) {
      iInt++;
    }
    long endInt = new Date().getTime();

    long startLong = new Date().getTime();
    long iLong = 0;
    while (iLong < 1e8) {
      iLong++;
    }
    long endLong = new Date().getTime();

    return new Pair<Long, Long>(endInt - startInt, endLong - startLong);
  }
}
