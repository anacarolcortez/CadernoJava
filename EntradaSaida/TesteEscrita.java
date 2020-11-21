package EntradaSaida;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        OutputStream file = new FileOutputStream("C:\\Users\\AnaCarolinaCortezAlv\\IdeaProjects\\Alura\\src\\EntradaSaida\\lorem2.txt");
        Writer writeFile = new OutputStreamWriter(file);
        BufferedWriter brFile = new BufferedWriter(writeFile);

        brFile.write("Hello. It's me. I was wondering if after all these years you'd like to meet");
        brFile.newLine();
        brFile.write("Hello from the server siiiiiiiiide");
        brFile.close();

    }
}
