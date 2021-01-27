package Threads;

public class Assignment4Q8 {
    private volatile Integer count = 1;
    private volatile Integer threadIdToRun = 1;
    private Object object = new Object();

    public static void main(String[] args) {

        Assignment4Q8 testClass = new Assignment4Q8();
        Thread t1 = new Thread(testClass.new Printer(1));
        Thread t2 = new Thread(testClass.new Runnable(2));
        Thread t3 = new Thread(testClass.new Runnable(3));

        t1.start();
        t2.start();
        t3.start();
}
