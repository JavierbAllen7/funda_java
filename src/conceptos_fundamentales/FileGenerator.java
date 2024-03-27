package conceptos_fundamentales;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileGenerator {

    public static void createSalesManInfoFile(String filePath, int numVendedores) {
        try (FileWriter writer = new FileWriter(filePath)) {
            Random random = new Random();
            for (int i = 1; i <= numVendedores; i++) {
                String tipoDocumento = "CC"; // Example document type
                long numeroDocumento = 1000000 + random.nextInt(9000000); //Random document number
                String nombres = generateRandomName();
                String apellidos = generateRandomName();
                
                String line = tipoDocumento + ";" + numeroDocumento + ";" + nombres + ";" + apellidos + "\n";
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createProductsFile(String filePath, int numProductos) {
        try (FileWriter writer = new FileWriter(filePath)) {
            Random random = new Random();
            for (int i = 1; i <= numProductos; i++) {
                String idProducto = "ID" + i; // Example product ID
                String nombreProducto = generateRandomName();
                double precio = 10 + random.nextDouble() * 90; // Random price between 10 and 100
                
                String line = idProducto + ";" + nombreProducto + ";" + precio + "\n";
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateRandomName() {
        String[] nombres = {"Juan", "Maria", "Pedro", "Luisa", "Carlos", "Laura", "Andres", "Ana"};
        String[] apellidos = {"Perez", "Gomez", "Lopez", "Martinez", "Rodriguez", "Garcia", "Hernandez"};

        Random random = new Random();
        String nombre = nombres[random.nextInt(nombres.length)];
        String apellido = apellidos[random.nextInt(apellidos.length)];

        return nombre + " " + apellido;
    }
}

	