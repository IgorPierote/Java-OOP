package Class;

public class Animal {

    public String nome;
    public int identificador;
    public int idade;
    public String especie;

    public void modificaidade(int novaidade){
        this.idade = novaidade;
    }

    public boolean verificaidade(int idade){
        if(this.idade > 50) {

            System.out.println("A idade do animal é maior que 50 ");
            return true;
        }else{
            System.out.println("A idade do animal é menor que 50 ");

            return false;
        }
    }
}
