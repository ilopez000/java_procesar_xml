import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Cargar el archivo HTML
            File input = new File("C:\\Users\\ignac\\Desktop\\web.html"); //poned vuestra ruta
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce el tag que deseas buscar");
            String tag = entrada.nextLine();
            mostrarTag(doc,tag);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarTag(Document doc, String tag) {

        Elements encapçalaments = doc.getElementsByTag(tag);
        for (Element encapçalament : encapçalaments) {
            System.out.println(encapçalament.text());
        }

    }
}
