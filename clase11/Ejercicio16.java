public class Main implements Runnable {​
    public static int compartida, n;
    public void run() {​
        for(int i = 0; i < n; ++i) modifica();
    }​
    public synchronized void modifica() {​
        if(Thread.currentThread().getId() == 15) compartida--;
        else compartida++;
    }​
    public static void main(String[] args) {​
        n = Integer.parseInt(args[0]);
        // Runnable target
        try {​
            Main t = new Main();
        // create threads
        Thread t1 = new Thread(t, "First Thread");
        Thread t2 = new Thread(t, "Second Thread");
        // start threads
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(compartida);
        }​ catch (Exception e) {​
            // TODO: handle exception
        }​
    }​
}​