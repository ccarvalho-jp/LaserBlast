import javax.swing.*;
import java.awt.*;

class MenuScreen extends JPanel {
    static final Color ORANGE = new Color(240, 85, 36);
    static final Color BEGE = new Color(236, 240, 213);
    static final Color YELLOW = new Color(255, 242, 18);
    static final Color BLACK = new Color(55, 52, 53);

    RankingManager ranking;
    JButton playButton;

    MenuScreen(RankingManager ranking) {
        this.ranking = ranking;
        setBackground(ORANGE);
        setLayout(null);

        playButton = new JButton("PLAY");
        playButton.setBounds(150, 450, 200, 50);
        playButton.setBackground(YELLOW);
        playButton.setForeground(BLACK);
        playButton.setFont(new Font("Monospaced", Font.BOLD, 24));
        playButton.setBorder(BorderFactory.createLineBorder(BLACK, 3));
        playButton.setFocusPainted(false);
        add(playButton);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(BEGE);
        g.setFont(new Font("Monospaced", Font.BOLD, 20));
        g.drawString("ACTIVISION", 170, 50);
        g.setFont(new Font("Monospaced", Font.PLAIN, 12));
        g.drawString("presents", 210, 70);

        g.setFont(new Font("Monospaced", Font.BOLD, 48));
        g.drawString("LASER BLAST", 60, 130);
        g.setFont(new Font("Monospaced", Font.PLAIN, 14));
        g.drawString("VIDEO GAME SIMULATOR", 120, 160);

        g.setColor(BLACK);
        g.fillRoundRect(50, 200, 400, 230, 10, 10);
        g.setColor(YELLOW);
        ((Graphics2D)g).setStroke(new BasicStroke(3));
        g.drawRoundRect(50, 200, 400, 230, 10, 10);

        g.setColor(BEGE);
        g.setFont(new Font("Monospaced", Font.BOLD, 18));
        int y = 230;
        for (PlayerScore p : ranking.ranking) {
            g.drawString(p.name, 80, y);
            g.drawString(String.valueOf(p.score), 330, y);
            y += 22;
        }
    }
}