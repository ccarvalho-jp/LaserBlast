import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Criar o ranking e carregá-lo do ficheiro
        RankingManager ranking = new RankingManager();
        ranking.carregar();

        // Criar a janela
        JFrame janela = new JFrame("Menu do Jogo");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500, 600);
        janela.setLocationRelativeTo(null); // centraliza na tela

        // Criar a tela de menu e adicioná-la à janela
        MenuScreen menu = new MenuScreen(ranking);
        janela.add(menu);

        // Mostrar a janela
        janela.setVisible(true);
    }
}