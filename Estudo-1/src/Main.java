import Class.Animal;
import Class.Collaborator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal animal;

        animal = new Animal();

        animal.idade = 15;
        animal.nome = "Choko";
        animal.especie = "Chokobo";
        animal.identificador = 568;

        Animal a2;

        a2 = new Animal();

        a2.idade = 3;
        a2.nome = "Jeronimo";
        a2.especie = "Cuco";
        a2.identificador = 456;

        /*System.out.println("Nome: " + animal.nome + "\nIdade: " + animal.idade);
        System.out.println("Nome: " + a2.nome + "\nIdade: " + a2.idade);*/

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a idade do animal: ");
        animal.idade = ler.nextInt();
        System.out.println("A idade que você digitou para o animal foi: " + animal.idade);

        animal.modificaidade(25);

        System.out.println("A nova idade por método é: " + animal.idade);

         animal.verificaidade(animal.idade);
    }

}