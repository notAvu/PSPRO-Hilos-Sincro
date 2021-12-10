package Contenedor;

import java.util.Random;

public class NumOculto {
    public boolean isGuessed;
    public int numOculto;

    public static int getIdPartida() {
        return idPartida;
    }

    public static int idPartida;

    public NumOculto() {
        Random random= new Random();
        isGuessed=false;
        this.numOculto = random.nextInt(1,100);
    }

    public synchronized int guess(int numGuess)
    {
        int result=-1;
        if(numGuess==numOculto)
        {
            result=1;
            idPartida++;
            isGuessed=true;
        }
        else if(isGuessed)
        {
            result=0;
        }
        return result;
    }
}
