package xadrez;

import tabuleiro.Peca;
import tabuleiro.PosicaoTabuleiro;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
    private Tabuleiro tabuleiro;

    public PartidaXadrez(){
        tabuleiro = new Tabuleiro(8,8);
        setUpInicial();
    }

    public PecaXadrez[][] getPecasPartida(){
        PecaXadrez[][] pecasPartida = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i=0; i<tabuleiro.getLinhas(); i++){
            for (int j=0; j< tabuleiro.getColunas(); j++){
                pecasPartida[i][j] = (PecaXadrez) tabuleiro.getPeca(i,j);
            }
        }
        return pecasPartida;
    }

    private void moverPecaNoTabuleiro(char coluna, int linha, PecaXadrez pecaXadrez){
        tabuleiro.setPosicaoPeca(pecaXadrez, new PosicaoXadrez(coluna, linha).converterMatriz());
    }

    public PecaXadrez performarMovePeca(PosicaoXadrez origem, PosicaoXadrez destino){
        PosicaoTabuleiro posicaoInicial = origem.converterMatriz();
        PosicaoTabuleiro posicaoFinal = destino.converterMatriz();
        validaOrigem(posicaoInicial);
        validaDestino(posicaoInicial, posicaoFinal);
        Peca pecaEmilinada = movePeca(posicaoInicial, posicaoFinal);
        return (PecaXadrez) pecaEmilinada;
    }

    private Peca movePeca(PosicaoTabuleiro origem, PosicaoTabuleiro destino){
        Peca p = tabuleiro.removePeca(origem);
        Peca pecaEmilinada = tabuleiro.removePeca(destino);
        tabuleiro.setPosicaoPeca(p, destino);
        return pecaEmilinada;
    }

    private void validaOrigem(PosicaoTabuleiro posicaoTabuleiro){
        if (!tabuleiro.posicaoExiste(posicaoTabuleiro)){
            throw new ErroXadrez("Não há peça nesta posição de origem");
        }
        if (!tabuleiro.getPeca(posicaoTabuleiro).existeMovimentoPossivel()){
            throw new ErroXadrez("Não há movimentos possíveis para esta peça");
        }
    }

    private void validaDestino(PosicaoTabuleiro origem, PosicaoTabuleiro destino){
        if (!tabuleiro.getPeca(origem).movimentoPossivel(destino)){
            throw new ErroXadrez("Destino inválido para esta peça");
        }
    }

    private void setUpInicial(){
        //Peças pretas na parte de cima do tabuleiro
        moverPecaNoTabuleiro('a', 8, new Torre(this.tabuleiro, Cor.PRETO));
        moverPecaNoTabuleiro('e', 8, new Rei(this.tabuleiro, Cor.PRETO));

        //Peças brancas na parte de baixo do tabuleiro
        moverPecaNoTabuleiro('a', 1, new Torre(this.tabuleiro, Cor.BRANCO));
        moverPecaNoTabuleiro('e', 1, new Rei(this.tabuleiro, Cor.BRANCO));
    }
}
