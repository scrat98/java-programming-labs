public class U0901Main {
  public static void main(String[] args) {
    final Integer[] intArr = {10, 20, 15};
    final Float[] floatArr = new Float[100];
    for (int i = 0; i < floatArr.length; i++) {
      floatArr[i] = (float) Math.random() * 100;
    }

    final U0901WorkArray<Integer> workArrayInt = new U0901WorkArray<Integer>(intArr);
    final U0901WorkArray<Float> workArrayFloat = new U0901WorkArray<Float>(floatArr);
    System.out.println(workArrayInt.sum());
    System.out.println(workArrayFloat.sum());

    // final String[] stringArray = {"1fasfsa", "fasf"};
    // final U0901WorkArray<Float> workArrayString = new U0901WorkArray<String>(stringArray);
  }
}
