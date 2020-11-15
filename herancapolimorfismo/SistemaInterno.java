package herancapolimorfismo;

public abstract class SistemaInterno {

    public void autenticaFuncionario(Gerente f){
        boolean isAutenticado = f.autentica(f.getSenha());
        if (isAutenticado){
            System.out.println("Acesso autorizado");
        } else {
            System.out.println("Senha inválida. Acesso negado");
        }
    }
}
