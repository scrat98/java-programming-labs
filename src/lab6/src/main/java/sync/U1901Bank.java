package sync;

public class U1901Bank {

  private int intTo = 0;

  private int intFrom = 220;

  public synchronized void calc(final int intTransaction, final long lngTimeout) {
    System.out.printf(
        "thread=%s, from=%d, to=%d\n",
        Thread.currentThread().getName(), intFrom, intTo
    );
    intFrom -= intTransaction;
    try {
      Thread.sleep(lngTimeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    intTo += intTransaction;
    System.out.printf(
        "thread=%s, from=%d, to=%d\n",
        Thread.currentThread().getName(), intFrom, intTo
    );
  }
}
