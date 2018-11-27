
import java.util.Scanner;
import java.util.Stack;

public class Frederico implements Jogador{
    Stack<Carta> stack = new Stack<Carta>();


    public static Carta retornaCarta (String[] carta ){
        System.out.println("tamanho array carta "+carta.length);
        Carta temp = new Carta(carta[0],carta[1],Integer.valueOf(carta[2]),Integer.valueOf(carta[3]),Integer.valueOf(carta[4]),Integer.valueOf(carta[5]),Integer.valueOf(carta[6]));
        return temp;
    }

    public void setBaralho(int tamanhoBaralho) {
        Scanner input= new Scanner(System.in);

        for (int i = 0 ;i<tamanhoBaralho;i++){
          /*  while (!input.hasNextLine()) {
                System.out.println("deu ruimmm");
            }*/
            System.out.println(stack.push(retornaCarta(input.nextLine().split(","))));
        }

    }
    public Carta getCarta(){

        return stack.pop();
    }




    public String Nome () {
        String nome="Frederico";
        return nome;
    }
}
