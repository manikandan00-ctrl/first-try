class NumberPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
    public static void main(String args[]){
      Thread t=new Thread();
      MyRunnable r=new MyRunnable();
      t.start();
    }
}