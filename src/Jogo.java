import java.util.Scanner;
public class Jogo {
    static Scanner input = new Scanner(System.in);
        public static Jogador[] InstanciaJogadores(String[] idJ){

            int i=1;
            Jogador[] arrayDeJogadores = new  Jogador[(idJ.length+1)];

            while (i<arrayDeJogadores.length){
                switch (idJ[i-1]){
                    case "1": {
                        arrayDeJogadores[i]= new Frederico() ;
                        break;
                    }
                    case "2": {
                        arrayDeJogadores[i]= new Carlos();
                        break;
                    }
                    case "3": {
                        arrayDeJogadores[i]= new Rosa();
                        break;
                    }
                    case "4": {
                        arrayDeJogadores[i]= new Bruno();
                        break;
                    }
                }
                i++;
            }
            return arrayDeJogadores;
        }
        public static Carta retornaCarta (String[] carta ){
            Carta temp = new Carta(carta[0],carta[1],Integer.valueOf(carta[2]),Integer.valueOf(carta[3]),Integer.valueOf(carta[4]),Integer.valueOf(carta[5]),Integer.valueOf(carta[6]));
            return temp;
        }
        public static Carta[] retornaBaralho (int tamanhoBaralho){
            String[] cartaTemp;
            Carta[] baralhoTemp =  new Carta[tamanhoBaralho];
            for (int i = 0 ;i<baralhoTemp.length;i++){
                baralhoTemp[i]= retornaCarta(cartaTemp=input.nextLine().split("," ));

            }
            return baralhoTemp;
        }

        public static Jogador[] retornaJogadoresComBaralho (Jogador[] jds, int tBaralho){
            for (int i =1;i<jds.length;i++){
                jds[i].setBaralho(retornaBaralho(tBaralho));
            }
            return jds;
        }
        public static int SimulaJogo (Jogador player1, Jogador player2){
            int player1Pontos=20;
            int player2Pontos=20;
            int RemovePontos (int player, int pontos){
                return player-pontos;
            }
           public  int VerificaEfeito(Carta[] player){
                campo
            }
            return 1;
        }

    public static void main(String[] args) {

        String linha = input.nextLine();
        String[] idJogadores = linha.split(" ");
        Jogador[] arrayDejogadores = InstanciaJogadores(idJogadores);
        for (int i =1;i<arrayDejogadores.length;i++){
           String test = arrayDejogadores[i].Nome();
           System.out.println(test);
        }

        int rodadas= Integer.valueOf(input.nextLine());
        int tamanhoBaralho = Integer.valueOf(input.nextLine());
        arrayDejogadores=retornaJogadoresComBaralho(arrayDejogadores,tamanhoBaralho);
        String[] idSimulacao = linha.split(" ");
        Jogador[] jogadorSimulacao = InstanciaJogadores(idSimulacao);
        while (input.nextLine().compareTo("fim")!=0){
            input.nextLine().split(" ");
        }
        SimulaJogo(jogadorSimulacao[0],jogadorSimulacao[1]);

        System.out.println(arrayDejogadores[1].getCarta());
        for (int i =0;i<tamanhoBaralho;i++){
            int j =1;
            Carta[] test = arrayDejogadores[j].getBaralho();
            System.out.println(arrayDejogadores[j].Nome());
            System.out.println(test[i].nome);
            System.out.println(test[i].descricao);
            System.out.println(test[i].ataque);
            System.out.println(test[i].vida);
            System.out.println(test[i].custo);
            System.out.println(test[i].efeito);
            System.out.println(test[i].idCarta);
        }
    }
}
