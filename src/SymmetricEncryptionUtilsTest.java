import javax.crypto.SecretKey;
import javax.xml.bind.DatatypeConverter;
import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricEncryptionUtilsTest {

//    @org.junit.jupiter.api.Test
//    void createAESKey() throws Exception {
//        SecretKey key = SymmetricEncryptionUtils.createAESKey();
//        assertNotNull(key);
//        System.out.println("Generated AES Key: " + DatatypeConverter.printHexBinary(key.getEncoded()));
//    }

    @org.junit.jupiter.api.Test
    void testAESCryptoRoutine() throws Exception{
        SecretKey key = SymmetricEncryptionUtils.createAESKey();
        assertNotNull(key);
        byte[] initializationVector = SymmetricEncryptionUtils.createInitializationVector();
        assertNotNull(initializationVector);
        String plainText = "This is the plaintext we are testing";
        byte[] cipherText = SymmetricEncryptionUtils.performAESEncryption(plainText, key, initializationVector);
        assertNotNull(cipherText);
        String decryptedText = SymmetricEncryptionUtils.performAESDecryption(cipherText, key, initializationVector);
        assertEquals(plainText, decryptedText);
        System.out.println("SecureRandom Generated AES Key: " + DatatypeConverter.printHexBinary(initializationVector));
        System.out.println("SecureRandom Generated InitializationVector: " + DatatypeConverter.printHexBinary(key.getEncoded()));
        System.out.println("PlainText: " + plainText);
        System.out.println("CipherText: " + DatatypeConverter.printHexBinary(cipherText));
        System.out.println("Decrypted Text: " + decryptedText);
    }
}