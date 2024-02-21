package org.example.task2;

public class FizzBuzz extends Thread{
    @Override
    public void run() {
        while (Resource.getStep() < Resource.getCapacity()){
            if (Resource.getStep()%15 == 0) {
                System.out.println("fizzbuzz");
                Resource.incrementStep();
            }
        }
        interrupt();
    }
}
