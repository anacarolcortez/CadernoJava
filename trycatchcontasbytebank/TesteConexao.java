package trycatchcontasbytebank;

public class TesteConexao {
    public static void main(String[] args) {

        try(Conexao conexao = new Conexao()){
            //fecha automaticamente por conta da implementacao da interface em Conexao
            conexao.leDados();
        } catch (IllegalStateException erro){
            System.out.println("Deu erro na conexão: " + erro.getMessage());
        } //finally {
           // conexao.fecha();
    }
}
