package Class;

public class Conta {

    public String nome_cliente;
    public int numero_conta;
    public double saldo;

    public void depositar(double valor){
            double novosaldo =  this.saldo + valor;
            this.saldo = novosaldo;
            System.out.println("Valor depositado " + this.saldo);
    }

    public void sacar (double valor) {
        if(this.saldo < valor) {

            System.out.println("Não a dinheiro em conta suficiente para este saque. O saldo atual é de: " + this.saldo);

        }else{

            double novovalor = this.saldo - valor;
            this.saldo = novovalor;

            System.out.println("Valor sacado: " + valor + "\nvalor em conta atual: " + this.saldo);
        }

    }

    public void verifcasaldoemconta(){
        System.out.println("Seu saldo é de " + this.saldo);
    }
}
