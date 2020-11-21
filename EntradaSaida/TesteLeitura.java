package EntradaSaida;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("C:\\Users\\AnaCarolinaCortezAlv\\IdeaProjects\\Alura\\src\\EntradaSaida\\lorem.txt");
        InputStreamReader readFile = new InputStreamReader(file);
        BufferedReader brFile = new BufferedReader(readFile);

        String line = brFile.readLine();

        while (line != null){
            System.out.println(line);
            line = brFile.readLine();
        }

        brFile.close();
    }
}
