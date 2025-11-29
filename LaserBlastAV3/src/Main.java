import javax.swing.*;

public class Main {
    public static void main(String[] args) {
      //TESTE DO MENU NA MAIN
        RankingManager ranking = new RankingManager();
        ranking.carregar();

        JFrame janela = new JFrame("Menu do Jogo");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500, 600);
        janela.setLocationRelativeTo(null); // centraliza na tela

        MenuScreen menu = new MenuScreen(ranking);
        janela.add(menu);

        janela.setVisible(true);
    }
}
