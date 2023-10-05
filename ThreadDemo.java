public class ThreadDemo implements Runnable {

   public void run() {
      System.out.println("Thread " + Thread.currentThread().getId() + " is running");
   }

   public static void main(String[] args) {
      int n = 5; // number of threads
      for (int i = 0; i < n; i++) {
         ThreadDemo threadDemo = new ThreadDemo();
         Thread t = new Thread(threadDemo);
         t.start();
      }
   }
}