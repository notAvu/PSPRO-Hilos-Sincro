package clasesHilos;

import Contenedor.NumOculto;

import java.util.Random;

public class Player implements Runnable{
    int numGuess;
    NumOculto manager;

    public Player(NumOculto manager) {
        this.manager= manager;
        setNewGuess();
    }

    private void setNewGuess() {
        Random random = new Random();
        numGuess=random.nextInt(1,100);
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()&&(!manager.isGuessed)) {

            if(manager.guess(numGuess)==1) {
                System.out.println("El numero era " + numGuess+"\n id partida: " + NumOculto.getIdPartida());
            }
            else setNewGuess();
        }
    }
}
