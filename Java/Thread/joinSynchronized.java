class MyThread extends Thread{
    static int count = 0;

    public void inCount(){
        count++;
    }

    public void run(){
        for(int i = 0; i < 10000; i++){
            inCount();
        }
    }

    public void showCount(){
        System.out.println(count);
    }
}

class A{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();

        try{
        t1.join();
        } catch(InterruptedException e){
            System.out.println(e);
        }

        t2.start();

        try{
        t2.join();
        } catch(InterruptedException e){
            System.out.println(e);
        }
        
        t2.showCount();

    }
}
