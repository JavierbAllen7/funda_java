package conceptos_fundamentales;

public class GenerateInfoFiles {

    public static void generateFiles() {
        // Generar archivos de vendedores y productos
        FileGenerator.createSalesManInfoFile("input/info_vendedores.txt", 10); // Generar 10 vendedores
        FileGenerator.createProductsFile("input/info_productos.txt", 20); // Generar 20 productos
    }

}
