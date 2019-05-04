package sync;

public class U1901Main {

  public static void main(String[] args) {
    final U1901Bank bankMain = new U1901Bank();
    final U1901Thread threadOne = new U1901Thread(bankMain, 100, 2000);
    threadOne.setName("threadOne");
    threadOne.setPriority(Thread.MAX_PRIORITY);
    threadOne.start();

    final U1901Thread threadTwo = new U1901Thread(bankMain, 50, 300);
    threadTwo.setName("threadTwo");
    threadTwo.setPriority(Thread.MAX_PRIORITY);
    threadTwo.start();

    System.out.println(Thread.currentThread().getName());
  }
}
