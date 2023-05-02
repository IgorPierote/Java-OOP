package Construtor;

public class Construtor1 {
    private int num;

    public Construtor1() {
        System.out.println("Essa é uma mensagem do construtor");

    }

    public Construtor1(int valor){
        this.num= valor;
    }

    public Construtor1(int v1, int v2) {
        this.num = v1 + v2;
    }

    public int getNum(){
        return this.num;
    }

}
