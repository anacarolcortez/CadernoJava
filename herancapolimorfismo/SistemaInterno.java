package herancapolimorfismo;

public abstract class SistemaInterno {

    private String senha = "senha recebida de alguma entrada em implentação";

    public void autenticaFuncionario(UsuarioAutenticavel f){
        boolean isAutenticado = f.autentica(this.senha);
        if (isAutenticado){
            System.out.println("Acesso autorizado");
        } else {
            System.out.println("Senha inválida. Acesso negado");
        }
    }
}
