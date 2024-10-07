public class Animal {

    protected String raca, nome;

    public void caminha(){
        System.out.println("Estou caminhando");
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal(){}

    public Animal (String nome){
        this.nome = nome;
    }

}

