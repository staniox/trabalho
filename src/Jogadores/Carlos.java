public class Carlos implements Jogador {
    Carta[] baralho(Carta[] b) {
        Fila<Carta> baralho = new Fila<Carta>();
        for (int i = 0; i < b.length; i++) {
            baralho.insere(b[i]);
        }
        return b;
    }

    ;

    Carta jogada(Carta[] m);
}
