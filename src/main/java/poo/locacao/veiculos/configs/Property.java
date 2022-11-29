package poo.locacao.veiculos.configs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {
    private static final String PATH = "files\\credentials.properties";
    private static Properties properties;

    public static void loadProperties() {
        properties = new Properties();

        try (var input = new FileInputStream(PATH)) {
            properties.load(input);
        } catch (IOException ioe) {
            System.err.println("Erro ao ler o arquivo.");
        }
    }

    public static void setProperties(String username, String password, SaveData save) {
        try (var output = new FileOutputStream(PATH)) {
            properties.setProperty("username", username);
            properties.setProperty("password", password);
            properties.setProperty("savedata", save.toString().toLowerCase());
            properties.store(output, null);
        } catch (IOException ioe) {
            System.err.println("Erro: " + ioe.getMessage());
        }
    }

    public static String getProperty(Value key) {
        return properties.getProperty(key.toString().toLowerCase());
    }

    public static String getProperty(SaveData key) {
        return properties.getProperty(key.toString().toLowerCase());
    }
}
