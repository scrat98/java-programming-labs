public class Task2 {
  public static void main(String[] args) {
    byte v_byte = 120;
    short v_short = 129;
    char v_char = 'a';
    int v_int = 65999;
    long v_long = 4294967296L;
    float v_float = 0.33333334f;
    double v_double = 0.3333333333333333;
    printValues(v_byte, v_short, v_char, v_int, v_long, v_float, v_double);
  }

  private static void printValues(Object... values) {
    for (Object value : values) {
      printValue(value);
    }
  }

  private static void printValue(Object value) {
    System.out.println(String.format("This is %s with value %s", value.getClass(), value));
  }
}
