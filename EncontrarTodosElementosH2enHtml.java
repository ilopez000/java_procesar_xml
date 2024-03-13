import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Cargar el archivo HTML
            File input = new File("C:\\Users\\ignac\\Desktop\\web.html"); //poned vuestra ruta
            Document doc = Jsoup.parse(input, "UTF-8", "");
            mostrarEncapcalamentsh2(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarEncapcalamentsh2(Document doc) {

        Elements encapçalaments = doc.getElementsByTag("h2");
        for (Element encapçalament : encapçalaments) {
            System.out.println("Nivell d'encapçalament: H2 , Contingut: " + encapçalament.text());
        }

    }
}
