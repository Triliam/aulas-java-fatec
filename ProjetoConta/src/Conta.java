public class Conta {

    private String conta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    public Conta(){
    }

    public Conta(String conta, String agencia, double saldo, String nomeCliente){
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int sacar(double valor){
        if(this.saldo >= valor){
            return 1;
        }
        return 0;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void imprimir(){
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
        System.out.println("nomeCliente = " + nomeCliente);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "conta='" + conta + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", nomeCliente='" + nomeCliente + '\'' +
                '}';
    }
}
