import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class RankingManager {

    ArrayList<PlayerScore> ranking = new ArrayList<>();

    String arquivo = "C:\\Users\\jotav\\IdeaProjects\\LaserBlastAV3\\src\\ranking.txt";

    void adicionar(String nome, int pontos) {
        ranking.add(new PlayerScore(nome.toUpperCase(), pontos));
        Collections.sort(ranking);
        if (ranking.size() > 10) ranking.remove(10);
    }

    void salvar() {
        try (FileOutputStream fos = new FileOutputStream(arquivo);
             PrintWriter w = new PrintWriter(fos)) {

            for (PlayerScore p : ranking) {
                w.println(p.name + ";" + p.score);
            }

        } catch (IOException e) {
            System.err.println("Erro ao salvar ranking: " + e.getMessage());
        }
    }

    void carregar() {
        try (FileInputStream fis = new FileInputStream(arquivo);
             BufferedReader r = new BufferedReader(new InputStreamReader(fis))) {

            String linha;
            while ((linha = r.readLine()) != null) {
                String[] dados = linha.split(";");
                ranking.add(new PlayerScore(dados[0], Integer.parseInt(dados[1])));
                //integer.parseint p converter a String que seria os pontos em int :)
                // se quiser mudar pode ficar a vontade 
            }

        } catch (IOException e) {
            System.err.println("Erro ao carregar ranking: " + e.getMessage());
        }
    }
}

