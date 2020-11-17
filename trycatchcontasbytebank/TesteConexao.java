package trycatchcontasbytebank;

public class TesteConexao {
    public static void main(String[] args) {

        Conexao conexao = new Conexao();

        try{
            conexao.leDados();
        } catch (IllegalStateException erro){
            System.out.println("Deu erro na conexão: " + erro.getMessage());
        } finally {
            conexao.fecha();
        }
    }
}
