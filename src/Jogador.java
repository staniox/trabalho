public interface Jogador {
    Carta retornaCarta (String[] carta );
    void setBaralho(Carta[] baralho);
    Carta[] getBaralho();
    Carta getCarta();

    Carta jogada(Carta[] m);

    String Nome();
}
