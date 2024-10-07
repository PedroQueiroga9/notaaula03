import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        Cachorro dog = new Cachorro("Oliveira");
        Gato cat = new Gato();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do Gato:");
        cat.setNome(sc.nextLine());

        System.out.println("Infome a raça do Gato:");
        cat.setRaca(sc.nextLine());

        System.out.println("Informe a Raça do Cachorro:");
        dog.setRaca(sc.nextLine());

        int x,y;
        do {
            System.out.println("Selecione a opção desejada para visualizar:\n1 - Visualizar gato \n2 - Visualizar Cachorro");
            x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Informações do Gato");
                    System.out.printf("Nome do gato: %s\n", cat.nome);
                    System.out.printf("Raça do gato: %s\n", cat.raca);
                    a.caminha();
                    cat.mia();
                    break;
                case 2:
                    System.out.println("Informções do Cachorro:");
                    System.out.printf("Nome do cachorro: %s\n", dog.nome);
                    System.out.printf("Raça do cachorro: %s\n", dog.raca);
                    dog.late();
                    a.caminha();
                    break;
            }System.out.println("Digite 0 para ver o menu novamente");
            y = sc.nextInt();
        }while (y==0);
    }

}