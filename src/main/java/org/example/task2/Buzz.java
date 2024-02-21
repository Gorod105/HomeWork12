package org.example.task2;

public class Buzz extends Thread{
    @Override
    public void run() {
        while (Resource.getStep() < Resource.getCapacity()){
            if (Resource.getStep()%5 == 0 && Resource.getStep()%15 !=0) {
                System.out.println("buzz");
                Resource.incrementStep();
            }
        }
        interrupt();
    }
}
