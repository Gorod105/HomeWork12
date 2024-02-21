package org.example.task2;


    public class Resource {
        private static int capacity;
        private static int step;

        public Resource(int capacity) {
            Resource.capacity = capacity;
            step = 1;
        }


        public static synchronized int getStep(){
            return step;
        }
        public static synchronized void incrementStep (){
            step++;
        }
        public static synchronized int getCapacity (){
            return capacity;
        }

    }