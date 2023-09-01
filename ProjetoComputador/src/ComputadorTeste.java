public class ComputadorTeste {
    public static void main(String[] args) {

        Computador c = new Computador();
        c.setMarca("Dell");
        c.setModelo("Dellicius");
        c.setCor("prata");
        c.setNumeroSerie(123456);
        c.setPreco(3.000);
        c.imprimir();
        c.calcularValor();
        c.imprimir();

        Computador c2 = new Computador("IBM", "preto", "IBMara", 234567, 3.000);
        c2.imprimir();
        c2.calcularValor();
        c2.imprimir();
        double valor = c2.alterarValor(5000);
        c2.imprimir();

        if(valor == 1){
            System.out.println("Valor alterado");
        } else if (valor == 0) {
            System.out.println("Valor não alterado");
        }
        c2.imprimir();

    }
}
