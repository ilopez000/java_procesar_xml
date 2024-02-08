    /**
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.Vector;

     * Exporta los datos de un Vector a un archivo CSV.
     *
     * @param data los datos a exportar.
     * @param csvFile el nombre del archivo CSV a crear.
     */
    public static void exportToCSV(Vector<String> data, String csvFile) {
        try {
            // Crear FileWriter para escribir en el archivo
            FileWriter writer = new FileWriter(csvFile);

            // Escribir cada elemento del Vector en el archivo
            for (String item : data) {
                writer.append(item);
                writer.append("\n"); // Nueva línea después de cada elemento
            }

            // Cerrar el FileWriter
            writer.flush();
            writer.close();

            System.out.println("Datos exportados a CSV exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
