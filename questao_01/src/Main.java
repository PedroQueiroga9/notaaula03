import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programador p = new Programador();
        Gerente g = new Gerente();

        int x,r;
        do {
            System.out.println("Escolha uma das opções: \n1 - Cadastrar Programador \n2 - Cadastrar Gerente\n3 - Exibir detalhes do gerente\n4 - Exibir detalhes do programador");
            x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Informe o nome do programador:");
                    p.setNome(sc.next());

                    System.out.println("Informe a data de nascimento do programador:");
                    p.setNasc(sc.nextInt());

                    System.out.println("Informe o salário do funcionário:");
                    p.setSalario(sc.nextDouble());

                    System.out.println("Qual a linguagem ultilizada pelo programador? informe abaixo:");
                    p.setLinguagem(sc.next());
                    break;

                case 2:
                    System.out.println("Informe o nome gerente:");
                    g.setNome(sc.next());
                    System.out.println("Informe a data de nascimento do gerente:");
                    g.setNasc(sc.nextInt());
                    System.out.println("Informe o salário do gerente em reais:");
                    g.setSalario(sc.nextDouble());
                    System.out.println("Informe qual projeto o gerente está trabalhando no momento:");
                    g.setProjeto(sc.next());
                    break;

                case 3:
                    System.out.println("Segue abaixo as informações do gerente:");

                    System.out.printf("Nome: %s\n", g.nome);
                    g.calcularIdade();

                    System.out.printf("Idade: %d\n", g.idade);
                    g.informarSalario();
                    g.informarProjeto();
                    break;

                case 4:
                    System.out.println("Segue abaixo as informações do programador:");

                    System.out.printf("Nome: %s\n", p.nome);
                    p.calcularIdade();
                    System.out.printf("Idade: %d\n", p.idade);
                    p.informarSalario();
                    p.informarLinguagem();
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("Para abrir novamente o menu digite 0");
            r = sc.nextInt();
        }while (r==0);
    }
}