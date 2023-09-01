public class AcampamentoTeste {
    public static void main(String[] args) {

        Acampamento membro1 = new Acampamento();
        membro1.setNome("Taís");
        membro1.setIdade(38);

        membro1.organizarGrupo();
        membro1.imprimir();

        Acampamento membro2 = new Acampamento("Thauã", 19);
        Acampamento membro3 = new Acampamento("Gustavo", 21);
        membro2.imprimir();
        System.out.println(membro2.getEquipe());
        membro2.organizarGrupo();
        System.out.println(membro2.getEquipe());
        membro2.imprimir();

    }
}
