package main.java.com.epam.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileServiceImpl implements FileService {

    @Override
    public String readTextFromFile(String filePath) {

        String textFromFile = "";

        try (FileReader fileReader = new FileReader(filePath)) {

            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                textFromFile += scanner.nextLine();
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return textFromFile;
    }
}
