package tabuleiro;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1) {
            throw new ErroTabuleiro("Tamanho inválido para o tabuleiro");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        this.pecas = new Peca[linhas][colunas];
    }

    public int getColunas() {
        return colunas;
    }

    public int getLinhas() {
        return linhas;
    }

    public Peca getPeca(int linha, int coluna){
        if (!posicaoExiste(linha, coluna)){
            throw new ErroTabuleiro("Posição inválida");
        }
        return pecas[linha][coluna];
    }

    public Peca getPeca(PosicaoTabuleiro posicaoTabuleiro){
        if (!posicaoExiste(posicaoTabuleiro)){
            throw new ErroTabuleiro("Posição inválida");
        }
        return pecas[posicaoTabuleiro.getLinha()][posicaoTabuleiro.getColuna()];
    }

    public void movePeca(Peca peca, PosicaoTabuleiro posicaoTabuleiro){
        if (!posicaoExiste(posicaoTabuleiro)){
            throw new ErroTabuleiro("Posição inválida");
        }
        if (existePecaNaPosicao(posicaoTabuleiro)){
            throw new ErroTabuleiro("Já existe uma peça nesta posição");
        }
        pecas[posicaoTabuleiro.getLinha()][posicaoTabuleiro.getColuna()] = peca;
        peca.setPosicao(posicaoTabuleiro);
    }

    private boolean posicaoExiste(int linha, int coluna){
        return linha >=0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }

    private boolean posicaoExiste(PosicaoTabuleiro posicaoTabuleiro){
        return posicaoExiste(posicaoTabuleiro.getLinha(), posicaoTabuleiro.getColuna());
    }

    private boolean existePecaNaPosicao(PosicaoTabuleiro posicaoTabuleiro){
        return getPeca(posicaoTabuleiro) != null;
    }
}
