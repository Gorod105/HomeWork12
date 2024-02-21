package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource(30);
        Thread printNumber = new PrintNumber();
        Thread fizz = new Fizz();
        Thread buzz = new Buzz();
        Thread fizzbuzz = new FizzBuzz();
        printNumber.start();
        fizz.start();
        buzz.start();
        fizzbuzz.start();
    }
}
