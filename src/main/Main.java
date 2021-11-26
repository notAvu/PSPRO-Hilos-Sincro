package main;

import clasesHilos.Player;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Thread> threadList=generateVectorThreadList();
        for (Thread t:threadList) {
            t.start();
        }
    }

    private static LinkedList<Thread> generateVectorThreadList() {
       LinkedList<Thread> d=new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            d.add(new Thread(new Player()));
        }
        return d;
    }
}
