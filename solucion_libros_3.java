import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class SimpleXMLParser {
    public static void main(String[] args) {
        try {
            // Cargar y parsear el archivo XML
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse("C:\\\\Users\\\\ignac\\\\Desktop\\\\libros.xml");

            // Normalizar el documento XML
            doc.getDocumentElement().normalize();

            // Obtener la lista de elementos 'libro'
            NodeList listaLibros = doc.getElementsByTagName("libro");

            double total_facturado=0;
            // Imprimir la información de cada libro
            for (int i = 0; i < listaLibros.getLength(); i++) {
                Element libro = (Element) listaLibros.item(i);

                String titulo = libro.getElementsByTagName("titulo").item(0).getTextContent();
                String autor = libro.getElementsByTagName("autor").item(0).getTextContent();
                String precio = libro.getElementsByTagName("precio").item(0).getTextContent();
                String ventas = libro.getElementsByTagName("ventas").item(0).getTextContent();
                
                double precio_en_numeros=Double.parseDouble(precio);
                double ventas_en_numero=Double.parseDouble(ventas);
                double total=precio_en_numeros*ventas_en_numero;

                System.out.println(titulo +" "+ total);
                total_facturado+=total;
            }
            System.out.println("TOTAL FACTURADO: "+total_facturado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
