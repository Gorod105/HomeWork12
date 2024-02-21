package org.example.task2;

public class PrintNumber extends Thread{
    @Override
    public void run() {
        while (Resource.getStep() < Resource.getCapacity()){
            if (Resource.getStep()%3 != 0 && Resource.getStep()%5 !=0) {
                System.out.println(Resource.getStep());
                Resource.incrementStep();
            }
        }
    }
}
