package Deadlock;

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using Pen and trying to get Paper...");
        
        // Simulating some work/delay to ensure both threads start
        try { Thread.sleep(100); } catch (InterruptedException e) {}

        paper.finishWriting(); // Tries to call a synchronized method on Paper
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using Pen.");
    }
}

class Paper {
    public synchronized void writeWithPenAndPaper(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using Paper and trying to get Pen...");
        
        try { Thread.sleep(100); } catch (InterruptedException e) {}

        pen.finishWriting(); // Tries to call a synchronized method on Pen
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using Paper.");
    }
}

public class exampleDemo {
    public static void main(String[] args) {
        final Pen pen = new Pen();
        final Paper paper = new Paper();

        // Thread 1: Grabs Pen first
        Thread thread1 = new Thread(() -> {
          synchronized(pen){
            synchronized(paper){
               pen.writeWithPenAndPaper(paper); }
              }
            },"Thread-Pen");


        // Thread 2: Grabs Paper first
        Thread thread2 = new Thread(() -> paper.writeWithPenAndPaper(pen), "Thread-Paper");

        thread1.start();
        thread2.start();
    }
}