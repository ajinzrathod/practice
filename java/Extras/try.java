class MyThread implements Runnable {
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }

    public void run() {
        System.out.println(thrdName + "starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(5000);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrdName + " interrupted.");
        }

        System.out.println(thrdName + " terminating.");
    }
}

class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread mt = new MyThread("Child #1");

        Thread newThrd = new Thread(mt);

        newThrd.start();

        for (int i = 0; i < 50; i++) {
            System.out.println(".\n" + newThrd.isAlive());
            try {
                Thread.sleep(500);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
            newThrd.interrupt();
        }
        System.out.println("\nMain thread ending.");
    }
}
