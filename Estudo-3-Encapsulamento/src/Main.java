import Construtor.Construtor1;
import Encapsulamento.Visibilidade;

public class Main {
    public static void main(String[] args) {

       /*
        Visibilidade visibilidade;
        visibilidade = new Visibilidade();

        visibilidade.setIdade(10);
        System.out.println("O valor da idade é = " + visibilidade.getIdade());
        */

        /*
            Anotação: O Java identifica automaticamente qual construtor instanciado deve ser usado com base nos valores
            enviados.
        */

        Construtor1 c1 = new Construtor1(5, 7);
        System.out.println("Valor enviado para o construtor é: " + c1.getNum());




    }
}