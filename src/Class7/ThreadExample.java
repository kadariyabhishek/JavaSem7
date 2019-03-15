package Class7;

/**
 * Created by a-19-k on 3/5/19.
 */
class ThreadExample extends Thread {
    ThreadGroup threadGroup; String name;
    public ThreadExample (ThreadGroup threadGroup, String name) { this.threadGroup = threadGroup;
        this.name = name;
    }
    public void run() { System.out.println("Thread Name: " +
            Thread.currentThread().getName()); }
}
class ThreadGroupExample {
    public static void main(String args[]) {
        ThreadGroup threadGroupOne = new ThreadGroup("Thread Group 1");
        ThreadGroup threadGroupTwo = new ThreadGroup("Thread Group 2");
        ThreadExample exampleOne = new ThreadExample(threadGroupOne, "Thread One");
        ThreadExample exampleTwo = new ThreadExample(threadGroupOne, "Thread Two");
        ThreadExample exampleThree = new ThreadExample(threadGroupTwo, "Thread Three");
        ThreadExample exampleFour = new ThreadExample(threadGroupTwo, "Thread Four");
        exampleOne.start();
        exampleTwo.start();
        exampleThree.start(); exampleFour.start();
        threadGroupOne.list(); threadGroupOne.interrupt();
        threadGroupTwo.list();
        threadGroupTwo.interrupt(); }
}