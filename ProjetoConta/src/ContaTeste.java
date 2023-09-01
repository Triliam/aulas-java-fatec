import java.util.Scanner;

public class ContaTeste {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean sair = true;

        ContaTeste c1 = new ContaTeste();

        while (sair){
            System.out.println("Digite 0 para sair, digite 1 para Sacar, digite 2 para Depositar, digite 3 para Consultar e digite 4 para Cadastrar");
            int digito = scan.nextInt();

            switch (digito) {
                case 1:
                    c1.execSacar();
                    break;
                case 2:
                    c1.execDepositar();
                    break;
                case 3:
                    c1.execConsultar();
                    break;
                case 4:
                    c1.execCadastrar();
                    break;
                case 0:
                    sair = false;
            }

        }

    }
    public Conta c = new Conta();

    Scanner scan = new Scanner(System.in);

    public void execDepositar(){
        System.out.println("Valor do deposito");
        double valor = scan.nextDouble();
        c.depositar(valor);
    }

    public void execSacar(){
        System.out.println("Digite um valor para o saque");
        double valor = scan.nextDouble();
        int retorno = c.sacar(valor);
        if(retorno == 1){
            System.out.println("Saque realizado");
        } else if (retorno == 0) {
            System.out.println("Saque n realizado");
        }
    }

    public void execConsultar(){
        c.imprimir();
    }

    public void execCadastrar(){
        System.out.println("Entre com a conta: ");
        String conta = scan.next();
        c.setConta(conta);

        System.out.println("Entre com a agencia: ");
        String agencia = scan.next();
        c.setAgencia(agencia);

        System.out.println("Entre com o nome: ");
        String nome = scan.next();
        c.setNomeCliente(nome);

    }
}
