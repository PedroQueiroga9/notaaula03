public class Gerente extends Funcionario {

    private String projeto;

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public void informarProjeto(){
        System.out.printf("O gerente atualmente trabalha no projeto: %s\n", projeto);
    }
}
