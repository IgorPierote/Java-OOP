import Class.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Conta c1;

        c1 = new Conta();

        c1.nome_cliente = "Igor";
        c1.numero_conta = 13421;
        c1.saldo = 0;

        System.out.println("____________INFORMAÇÔES DA CONTA____________");

        System.out.println("Nome = " + c1.nome_cliente +
                    "\nNúmero da Conta: " + c1.numero_conta +
                    "\nSaldo: " + c1.saldo);

        System.out.println("____________DEPOSITAR VALOR EM CONTA____________");

        System.out.println("Insira o valor que deseja depositar: ");
        double valordepositado = ler.nextDouble();
        c1.depositar(valordepositado);

        System.out.println("____________SACAR VALOR EM CONTA____________");

        System.out.println("Insira o valor que deseja sacar: ");
        double valordesaque = ler.nextDouble();
        c1.sacar(valordesaque);

    }

}