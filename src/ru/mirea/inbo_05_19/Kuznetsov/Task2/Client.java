package ru.mirea.inbo_05_19.Kuznetsov.Task2;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println(chair.toString() + " is pretty nice.");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}