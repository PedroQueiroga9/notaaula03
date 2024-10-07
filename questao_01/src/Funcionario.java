public class Funcionario {

    protected int nasc, idade;
    protected double salario;
    protected String nome;

    public void informarSalario(){
        System.out.printf("O salário do Funcionário é de: R$%.2f\n", salario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularIdade(){
        idade = 2024 - nasc;
    }
}
