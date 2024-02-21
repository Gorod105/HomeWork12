package org.example.task2;

public class Fizz extends Thread{
    @Override
    public void run() {
        while (Resource.getStep() < Resource.getCapacity()){
            if (Resource.getStep()%3 == 0 && Resource.getStep()%15 !=0) {
                System.out.println("fizz");
                Resource.incrementStep();
            }
        }
        interrupt();
    }
}
