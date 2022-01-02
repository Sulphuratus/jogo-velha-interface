import java.awt.Color;
//import java.awt.Component;

import javax.swing.JFrame;

public class TelaPrincipal {
    
    private JFrame janela;
    private TelaJogo telaJogo;

    public TelaPrincipal(){

        this.janela = new JFrame("Jogo da Velha");
        this.janela.setBackground(Color.BLACK);
        this.janela.setBounds(100, 100, 501, 515);
        this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.telaJogo = new TelaJogo();
        this.janela.add(telaJogo);
        this.janela.setVisible(true);
    }

    public static void main(String[] args) {
        
        TelaPrincipal tela = new TelaPrincipal();
    }



}
