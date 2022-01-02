public class Jogador {

    private String nome;
    private char simbolo;
    private boolean proximo;

    public Jogador(String nome, char simbolo){
        this.nome = nome;
        this.simbolo = simbolo;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSimbolo() {
        return this.simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public boolean isProximo() {
        return this.proximo;
    }

    public boolean getProximo() {
        return this.proximo;
    }

    public void setProximo(boolean proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString(){
        return "Jogador {nome=" + nome +", simbolo=" + simbolo + "]";
    }
    
}
