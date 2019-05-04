package sync;

public class U1901Thread extends Thread {

  private U1901Bank bankWork;

  private int intTrans;

  private long lngSleep;

  public U1901Thread(final U1901Bank bankWork, final int intTrans, final long lngSleep) {
    this.bankWork = bankWork;
    this.intTrans = intTrans;
    this.lngSleep = lngSleep;
  }

  @Override
  public void run() {
    bankWork.calc(intTrans, lngSleep);
  }
}
