public class Programador extends Funcionario {

    private String linguagem;

    public void informarLinguagem(){
        System.out.printf("a liguagem ultilizada pelo programador é: %s\n", linguagem);
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
