public class Computador {

    private String marca;
    private String cor;
    private String modelo;
    private long numeroSerie;
    private double preco;

    public Computador(){}

    public Computador(String marca, String cor, String modelo, long numeroSerie, double preco){
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.preco = preco;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("marca = " + marca);
        System.out.println("cor = " + cor);
        System.out.println("modelo = " + modelo);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preco = " + preco);
    }

    public void calcularValor(){
        if(this.marca == "HP") {
            this.preco = this.preco + (this.preco * 0.3);
        } else if (this.marca == "IBM") {
            this.preco += this.preco * 0.5;
        } else {
            this.preco = getPreco();
        }
    }

    public int alterarValor(double preco){
        if(preco > 0){
            this.preco = preco;
            return 1;
        }
        return 0;
    }
}
