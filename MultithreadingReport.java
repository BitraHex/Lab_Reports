class SharedCounter {
    private int counter = 0;

    
    public synchronized void increment() {
        counter++;
    }

    public synchronized int getCounter() {
        return counter;
    }
}


class NumberThread extends Thread {
    private SharedCounter sharedCounter;

    NumberThread(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            sharedCounter.increment();
            System.out.println("Number: " + i + " (Counter: " + sharedCounter.getCounter() + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread implements Runnable {
    private SharedCounter sharedCounter;

    SquareThread(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            sharedCounter.increment();
            System.out.println("Square: " + (i * i) + " (Counter: " + sharedCounter.getCounter() + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingReport {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        Thread t1 = new NumberThread(counter);
        Thread t2 = new Thread(new SquareThread(counter));

        t1.start();
        t2.start();
    }
}
