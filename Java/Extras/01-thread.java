class ThreadRun extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + " value " + i);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Good morning");
            e.printStackTrace();
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        ThreadRun t1 = new ThreadRun();
        t1.start();

        ThreadRun t2 = new ThreadRun();
        t2.start();
    }
}
