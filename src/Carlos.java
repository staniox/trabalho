import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Carlos implements Jogador {
    Queue<Carta> fila = new LinkedList<>();


    public static Carta retornaCarta (String[] carta ){
        Carta temp = new Carta(carta[0],carta[1],Integer.valueOf(carta[2]),Integer.valueOf(carta[3]),Integer.valueOf(carta[4]),Integer.valueOf(carta[5]),Integer.valueOf(carta[6]));
        return temp;
    }

    public void setBaralho(int tamanhoBaralho) {
        Scanner input= new Scanner(System.in);

        for (int i = 0 ;i<tamanhoBaralho;i++){
            String[] temp = input.nextLine().split(",");


            for (int j=0;j<temp.length;j++){
                System.out.println("tempCarlos "+j+temp[j]);
            }
            fila.add(retornaCarta(temp));

        }

    }
    public Carta getCarta(){
        return fila.remove();

    }




    public String Nome () {
        String nome="Carlos";
        return nome;
    }
}
