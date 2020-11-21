package EntradaSaida;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {
        //Recebe dados do teclado e insere no arquivo lorem3
        //Pode substituit linha 14 pelo FileInputStream para copiar do lorem2 para o lorem3

        Socket s = new Socket();

        InputStream fis = s.getInputStream();
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("C:\\Users\\AnaCarolinaCortezAlv\\IdeaProjects\\Alura\\src\\EntradaSaida\\lorem3.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();

        while(line != null && !line.isEmpty()) {

            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }

        br.close();
        bw.close();

    }
}
