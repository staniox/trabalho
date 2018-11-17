import java.util.Scanner;

public class Jogo {
    static Scanner input = new Scanner(System.in);
        public static Jogador[] InstanciaJogadores(String[] idJ){

            int i=1;
            Jogador[] arrayDeJogadores = new  Jogador[idJ.length+1];
            while (i<idJ.length){
                switch (idJ[i]){
                    case "1": {
                        arrayDeJogadores[i]= new Jogadores.Frederico();
                    }
                    case "2": {
                        arrayDeJogadores[i]= new Jogadores.Carlos();
                    }
                    case "3": {
                        arrayDeJogadores[i]= new Jogadores.Rosa();
                    }
                    case "4": {
                        arrayDeJogadores[i]= new Jogadores.Bruno();
                    }
                }
                i++;
            }
            return arrayDeJogadores;
        }
        public static Carta retornaCarta (String[] carta ){
            Carta temp = new Carta(carta[0],carta[1],Integer.valueOf(carta[2]),Integer.valueOf(carta[2]),Integer.valueOf(carta[3]),Integer.valueOf(carta[4]),Integer.valueOf(carta[5]));
            return temp;
        }
        public static Carta[] retornaBaralho (int tamanhoBaralho){
            String[] cartaTemp;
            Carta[] baralhoTemp =  new Carta[tamanhoBaralho];
            for (int i = 0 ;i<baralhoTemp.length;i++){
                baralhoTemp[i]= retornaCarta(cartaTemp=input.nextLine().split(" " ));

            }
            return baralhoTemp;
        }

        public static void retornaJogadoresComBaralho (Jogador[] )

    public static void main(String[] args) {

        String linha = input.nextLine();
        String[] idJogadores = linha.split(" ");
        InstanciaJogadores(idJogadores);
        Jogador[] arrayDejogadores = InstanciaJogadores(idJogadores);

        int rodadas= Integer.valueOf(input.nextLine());
        int tamanhoBaralho = Integer.valueOf(input.nextLine());
        System.out.println(String.valueOf(idJogadores));
    }
}
