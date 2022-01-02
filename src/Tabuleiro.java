import java.util.Arrays;

import javax.swing.JOptionPane;

public class Tabuleiro {
    private Jogador jogador1;
    private Jogador jogador2;
    char[][] tabuleiro;
    private boolean vencedor;
    private int cont = 0;

    public Tabuleiro(Jogador jogador1, Jogador jogador2){
        this.tabuleiro = new char[3][3];
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        boolean vencedor = false;
    }

    public void realizaJogada(Jogador j, int linha, int coluna){

        //char simbolo = j.getSimbolo();
        if (this.tabuleiro[linha-1][coluna -1] == 'X' || this.tabuleiro[linha-1][coluna -1] == 'O'){
            JOptionPane.showMessageDialog(null, "Posição ocupada, tente outra!", "Atenção!",
            JOptionPane.ERROR_MESSAGE);
        }else{
            char simbolo = j.getSimbolo();
            if(j.getSimbolo() == jogador1.getSimbolo()){
                jogador1.setProximo(false);
                jogador2.setProximo(true);
            }else{
                jogador1.setProximo(true);
                jogador2.setProximo(false);
            }
            this.tabuleiro[linha-1][coluna -1] = simbolo;
        }
        // Fazer verificação para evitar que dois jogadores
        // joguem na mesma posição

        //this.tabuleiro[linha-1][coluna -1] = simbolo;
    }

    public char verificaGanhador(Jogador j){
        char simbolo = j.getSimbolo();
        
        if(tabuleiro[0][0] == simbolo &&
        tabuleiro[0][1] == simbolo &&
        tabuleiro[0][2] == simbolo){
            this.vencedor = true;
            return simbolo;

        }else if(tabuleiro[1][0] == simbolo &&
            tabuleiro[1][1] == simbolo &&
            tabuleiro[1][2] == simbolo){
                this.vencedor = true;
                return simbolo;

        }else if(tabuleiro[2][0] == simbolo &&
        tabuleiro[2][1] == simbolo &&
        tabuleiro[2][2] == simbolo){
            this.vencedor = true;
            return simbolo;

        }else if(tabuleiro[0][0] == simbolo &&
        tabuleiro[1][0] == simbolo &&
        tabuleiro[2][0] == simbolo){
            this.vencedor = true;
            return simbolo;

        }else if(tabuleiro[0][1] == simbolo &&
        tabuleiro[1][1] == simbolo &&
        tabuleiro[2][1] == simbolo){
            this.vencedor = true;
            return simbolo;

        }else if(tabuleiro[0][2] == simbolo &&
        tabuleiro[1][2] == simbolo &&
        tabuleiro[2][2] == simbolo){
            this.vencedor = true;
            return simbolo;
        
        }else if(tabuleiro[0][0] == simbolo &&
        tabuleiro[1][1] == simbolo &&
        tabuleiro[2][2] == simbolo){
            this.vencedor = true;
            return simbolo;
        
        }else if(tabuleiro[0][2] == simbolo &&
        tabuleiro[1][1] == simbolo &&
        tabuleiro[2][0] == simbolo){
            this.vencedor = true;
            return simbolo;

        }else if((tabuleiro[0][0] == 'X' ||  tabuleiro[0][0] == 'O') && (tabuleiro[1][0] == 'X' || tabuleiro[1][0] == 'O') &&
        (tabuleiro[2][0] == 'X' || tabuleiro[2][0] == 'O') && (tabuleiro[0][1] == 'X' || tabuleiro[0][1] == 'O') &&
        (tabuleiro[0][2] == 'X' || tabuleiro[0][2] == 'O') && (tabuleiro[1][1] == 'X' || tabuleiro[1][1] == 'O') &&
        (tabuleiro[2][2] == 'X' || tabuleiro[2][2] == 'O') && this.vencedor == false){

            JOptionPane.showMessageDialog(null, "Jogo EMPATADO!", "Fim de Jogo!", JOptionPane.PLAIN_MESSAGE); 
        }

        return ' ';
        // FALTA VERIFICAR PARA AS OUTRAS LINHAS, COLUNAS E DIAGONAIS ==> feito
    }


    public Jogador getJogador1() {
        return this.jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return this.jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public char[][] getTabuleiro() {
        return this.tabuleiro;
    }

    public void setTabuleiro(char[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public boolean isVencedor() {
        return this.vencedor;
    }

    public boolean getVencedor() {
        return this.vencedor;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;
    }

    @Override
    public String toString(){
        return "Tabuleiro[jogador1=" + jogador1 + ", jogador2=" + jogador2 + ", tabuleiro="
        + Arrays.toString(tabuleiro) + "]";
    }

}
