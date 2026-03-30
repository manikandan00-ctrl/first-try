class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread()+ ": " + i);
            try {
                System.out.println("Thread using runnable interface");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
    public static void main(String args[]) {
        NumberPrinter r = new NumberPrinter(); 
        Thread t = new Thread(r);           
        t.start();                             
    }
}