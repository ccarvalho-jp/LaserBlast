import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class PlayerScore implements Comparable<PlayerScore> {
    String name;
    int score;

    PlayerScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(PlayerScore other) {
        return other.score - this.score;
        // Decrescente pois o primeiro tem que ser o maior valor de pontos
    }
}
