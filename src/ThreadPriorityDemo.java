class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        // No task required
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getName() + " Priority: " + t1.getPriority());
        System.out.println(t2.getName() + " Priority: " + t2.getPriority());
        System.out.println(t3.getName() + " Priority: " + t3.getPriority());
    }
}
