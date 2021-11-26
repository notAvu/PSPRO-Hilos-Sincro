package Contenedor;

import java.util.Random;

public class NumOculto {
    boolean isGuessed;
    int numOculto;

    public NumOculto() {
        Random random= new Random();
        this.numOculto = random.nextInt(1,100);
    }

    public synchronized int guess(int numGuess)
    {
        int result=0;
        if(numGuess==numOculto)
        {
            result=1;
        }
        else if(!isGuessed)
        {
            result=-1;
        }
        return result;
    }
}
