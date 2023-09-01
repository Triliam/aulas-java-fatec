public class Acampamento {

    private String nome;
    private char equipe;
    private int idade;

    public Acampamento() {

    }
    public Acampamento(String nome, int idade) {
        this.nome = nome;
       // this.equipe = organizarGrupo(); ************
        this.idade = idade;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getEquipe() {
        return this.equipe;
    }

   // public void setEquipe(char equipe) {
   //     this.equipe = equipe;
   // }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("nome = " + nome);
        System.out.println("equipe = " + this.equipe);
        System.out.println("idade = " + idade);
    }

    public char organizarGrupo(){

        if(this.getIdade() >= 6 & this.getIdade() <=10) {
            //this.setEquipe('A');
            this.equipe = 'A';
        } else if (this.idade >=11 & this.idade <= 17) {
            this.equipe = 'B';
        } else if (this.idade >=18) {
            this.equipe = 'C';
        }

        return this.equipe;
    }

}
