package main.java.com.epam.service;

public interface DecryptService {

    String decrypt(String cipher, int step);
    String decrypt(String cipher);
    void printDecrypted(String cipher, int step);
    void printDecrypted(String cipher);
}
