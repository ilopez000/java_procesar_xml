import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public static String getHtml(String url) throws IOException {
    // Obrir una connexió a la pàgina web
    BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));

    // StringBuilder per a guardar el codi HTML
    StringBuilder builder = new StringBuilder();

    // Llegir el codi HTML línia per línia
    String line;
    while ((line = reader.readLine()) != null) {
        builder.append(line).append("\n");
    }

    // Tancar el lector
    reader.close();

    // Retornar el codi HTML
    return builder.toString();
}
