package clasesHilos;

import Contenedor.NumOculto;

import java.util.Random;

public class Player implements Runnable{
    int numGuess;
    NumOculto manager;

    public Player() {
        manager= new NumOculto();
        setNewGuess();
    }

    private void setNewGuess() {
        Random random = new Random();
        numGuess=random.nextInt(1,100);
    }

    @Override
    public void run() {
        if(manager.guess(numGuess)==1)
        {
            System.out.println("El numero era"+numGuess);
        }
    }
}
