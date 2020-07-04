package main.java.com.epam;

import main.java.com.epam.service.DecryptServiceImpl;
import main.java.com.epam.service.FileServiceImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println(new DecryptServiceImpl().decrypt(
                new FileServiceImpl().readTextFromFile("./src/main/resources/cipher.txt")));
    }
}
