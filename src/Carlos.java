import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Carlos implements Jogador {
    Queue<Carta> fila = new LinkedList<>();

    public Carta[] getBaralho() {
        return baralho;
    }
    public static Carta retornaCarta (String[] carta ){
        Carta temp = new Carta(carta[0],carta[1],Integer.valueOf(carta[2]),Integer.valueOf(carta[3]),Integer.valueOf(carta[4]),Integer.valueOf(carta[5]),Integer.valueOf(carta[6]));
        return temp;
    }

    public void setBaralho(int tamanhoBaralho, Carta carta) {
        Scanner input;

            for (int i = 0 ;i<fila.size();i++){

                fila.add(retornaCarta(input.nextLine().split("," )));

            }

    }
    public Carta getCarta(){
        return fila.remove();
    }

    public Carta jogada(Carta[] m){

    }


    public String Nome () {
        String nome="Carlos";
        return nome;
    }
}
