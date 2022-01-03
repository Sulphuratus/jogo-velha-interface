import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TelaJogo extends JPanel{

    JButton botao11;
    JButton botao12;
    JButton botao13;
    JButton botao21;
    JButton botao22;
    JButton botao23;
    JButton botao31;
    JButton botao32;
    JButton botao33;
    Jogador jog1;
    Jogador jog2;
    Tabuleiro tabuleiro;
    Jogador JogadordaVez;
    

    public TelaJogo(){
        this.setLayout(null);
        this.IniciarInterface();;
        this.jog1 = new Jogador("Jogador 1", 'X');
        this.jog2 = new Jogador("Jogador 2", 'O');
        this.jog1.setProximo(true);
        this.jog2.setProximo(false);
        this.tabuleiro = new Tabuleiro(jog1, jog2);
    }

    private void IniciarInterface(){

        botao11 = this.configuraBotao("1,1", 10, 10);
        botao11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Botao L1, C1");
                if(!tabuleiro.isVencedor()){
                    int linha =1;
                    int coluna = 1;
                    JogadordaVez = jogada(linha, coluna);
                    if(JogadordaVez != null){
                        botao11.setText(""+JogadordaVez.getSimbolo());
                    }
                    
                }
            }
        });

        botao12 = this.configuraBotao("1,2", 175, 10);
        botao12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Botao L1, C2");
                if(!tabuleiro.isVencedor()){
                    int linha =1;
                    int coluna = 2;
                    JogadordaVez = jogada(linha, coluna);
                    if(JogadordaVez != null){
                        botao12.setText(""+JogadordaVez.getSimbolo());
                    }
                }
            }
        });

        botao13 = this.configuraBotao("1,3", 339, 10);
        botao13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Botao L1, C3");
                if(!tabuleiro.isVencedor()){
                    int linha =1;
                    int coluna = 3;
                    JogadordaVez = jogada(linha, coluna);
                    if(JogadordaVez != null){
                        botao13.setText(""+JogadordaVez.getSimbolo());
                    }
                }
            }
        });

        botao21 = this.configuraBotao("2,1", 10, 170);
        botao21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Botao L2, C1");
                if(!tabuleiro.isVencedor()){
                    int linha =2;
                    int coluna = 1;
                    JogadordaVez = jogada(linha, coluna);
                    if(JogadordaVez != null){
                        botao21.setText(""+JogadordaVez.getSimbolo());
                    }
                }
            }
        });

        botao22 = this.configuraBotao("2,2", 175, 170);
        botao22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Botao L2, C2");
                if(!tabuleiro.isVencedor()){
                    int linha =2;
                    int coluna = 2;
                    JogadordaVez = jogada(linha, coluna);
                    if(JogadordaVez != null){
                        botao22.setText(""+JogadordaVez.getSimbolo());
                    }
                }
            }
        });

        botao23 = this.configuraBotao("2,3", 339, 170);
        botao23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Botao L2, C3");
                if(!tabuleiro.isVencedor()){
                    int linha =2;
                    int coluna = 3;
                    JogadordaVez = jogada(linha, coluna);
                    if(JogadordaVez != null){
                        botao23.setText(""+JogadordaVez.getSimbolo());
                    }
                }
            }
        });

        botao31 = this.configuraBotao("3,1", 10, 330);
        botao31.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Botao L3, C1");
                if(!tabuleiro.isVencedor()){
                    int linha =3;
                    int coluna = 1;
                    JogadordaVez = jogada(linha, coluna);
                    if(JogadordaVez != null){
                        botao31.setText(""+JogadordaVez.getSimbolo());
                    }
                }
            }
        });

        botao32 = this.configuraBotao("3,2", 175, 330);
        botao32.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Botao L3, C2");
                if(!tabuleiro.isVencedor()){
                    int linha =3;
                    int coluna = 2;
                    JogadordaVez = jogada(linha, coluna);
                    if(JogadordaVez != null){
                        botao32.setText(""+JogadordaVez.getSimbolo());
                    }
                }
            }
        });

        botao33 = this.configuraBotao("3,3", 339, 330);
        botao33.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Botao L3, C3");
                if(!tabuleiro.isVencedor()){
                    int linha =3;
                    int coluna = 3;
                    JogadordaVez = jogada(linha, coluna);
                    if(JogadordaVez != null){
                        botao33.setText(""+JogadordaVez.getSimbolo());
                    }
                }
            }
        });

        /// até botão 33 >> feito!

        this.add(botao11);
        this.add(botao12);
        this.add(botao13);
        this.add(botao21);
        this.add(botao22);
        this.add(botao23);
        this.add(botao31);
        this.add(botao32);
        this.add(botao33);

    }

    private JButton configuraBotao(String legendabotao, int posicaoX, int posicaoY){

        JButton botao = new JButton(legendabotao);
        botao.setBackground(Color.WHITE);
        botao.setBounds(posicaoX, posicaoY, 145, 145);
        return botao;
    }

    private Jogador verificaJogadorRodada(){

        if(this.jog1.isProximo()){
            return this.jog1;
        }else{
            return this.jog2;
        }
    }

    private Jogador jogada(int linha, int coluna){
        String msg = "";
        char simbolo = ' ';
        Jogador JogadorVez = this.verificaJogadorRodada();
        this.tabuleiro.realizaJogada(JogadorVez, linha, coluna);
        simbolo = this.tabuleiro.verificaGanhador(JogadorVez);
        this.jog1 = tabuleiro.getJogador1();
        this.jog2 = tabuleiro.getJogador2();
        if(this.tabuleiro.isVencedor()){
            if (simbolo == jog1.getSimbolo()){
                msg = String.format("O %s de simbolo %c é o ganhador!", 
                jog1.getNome(), jog1.getSimbolo());
            }else{
                msg = String.format("O %s de simbolo %c é o ganhador!", 
                jog2.getNome(), jog2.getSimbolo());
            }
            JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.PLAIN_MESSAGE);
        }
        return JogadorVez;
    }

    
}
