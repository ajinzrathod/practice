class MyThread extends Thread{
    public void run(){
        System.out.println("Thread Started");
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("Thread Started 2");
    }
}

class MyThread3 implements Runnable{
    public void run(){
        System.out.println("Thread Started 3");
    }
}

class Dummy{
    // INtentionally left blank to understand the purpose of Runnable
}

/* 
 class MyThread4 extends Dummy, Thread{
 } 
 This will give an ERROR coz
 Multiple Inheritance is not supported in Java
 */

/* To overcome this, we use Runnable */
class MyThread4 extends Dummy implements Runnable{
    public void run(){
        System.out.println("Thread Started 4");
    }
}


/* Main thread
   Main thread is executed by jvm
   Child Threads are threads that are executed inside Main Thread */

/* If we set any thread to daemon thread,
   it get started by JVM and thus it is not a child thread of Main thread */ 

class A{
    public static void main(String[] args){
        MyThread t1 = new MyThread(); //Child Thread or Worker Thred
        t1.setDaemon(true);
        t1.start();

        MyThread2 t2 = new MyThread2(); //Child Thread or Worker Thred
        t2.start();

        Thread t3 = new Thread(new MyThread3()); //Child Thread or Worker Thred
        t3.start();

        // This Line break might be anywhere because thread are Working parallely
        System.out.println(); 


        // Extending Dummy class and Thread together

        // Passing By reference
        Thread t4 = new Thread(new MyThread4()); //Child Thread or Worker Thred
        t4.start();
        // OR
        // Using polymorphic state
        Runnable r = new MyThread4();
        Thread t5 = new Thread(r); //Child Thread or Worker Thred
        t5.start();

        // One Liner
        new Thread(new MyThread4()).start();
    }
}
