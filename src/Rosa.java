import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Rosa implements Jogador{
    PriorityQueue<Carta> heap = new PriorityQueue<>(new Comparador());
    public class Comparador implements Comparator<Carta>
    {
        public int compare( Carta x, Carta y ) {
           int fCartaX = x.custo/(x.vida+x.ataque);
           int fCartaY = y.custo/(y.vida+y.ataque);
           if (fCartaX==fCartaY){
               if (x.idCarta<y.idCarta){
                   return -1;
               }
               if (x.idCarta>y.idCarta){
                   return 1;
               }
               return 0;
           }
           else if (fCartaX<fCartaY){
               return -1;
           }
           else
               return 1;
           }
        }



    public static Carta retornaCarta (String[] carta ){
        Carta temp = new Carta(carta[0],carta[1],Integer.valueOf(carta[2]),Integer.valueOf(carta[3]),Integer.valueOf(carta[4]),Integer.valueOf(carta[5]),Integer.valueOf(carta[6]));
        return temp;
    }

    public void setBaralho(int tamanhoBaralho) {
        Scanner input= new Scanner(System.in);
        String[] temp =new String[7];
        for (int i = 0 ;i<tamanhoBaralho;i++){




                temp = input.nextLine().split(",");



                System.out.println("tempRosa "+temp.length);

            heap.add(retornaCarta(temp));

        }

    }
    public Carta getCarta(){
        return heap.remove();

    }




    public String Nome () {
        String nome="Rosa";
        return nome;
    }
}