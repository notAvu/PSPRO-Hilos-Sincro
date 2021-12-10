package main;

import Contenedor.NumOculto;
import clasesHilos.Player;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        while (NumOculto.getIdPartida()<10){
            LinkedList<Thread> threadList=generateVectorThreadList();
            for (Thread t:threadList) {
                t.start();

            }
        }
    }

    private static LinkedList<Thread> generateVectorThreadList() {
        LinkedList<Thread> threads = new LinkedList<>();
        NumOculto manager= new NumOculto();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(new Player(manager)));
        }
        return threads;
    }
}
