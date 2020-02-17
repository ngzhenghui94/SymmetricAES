Symmetric AES-256 Encryption Algorithm in CBC mode with PKCS5Padding

# How to use
## To Generate the AES Key:
>SecretKey key = SymmetricEncryptionUtils.createAESKey();
## To Generate the InitializationVector:
>byte[] initializationVector = SymmetricEncryptionUtils.createInitializationVector();
## To Begin Encrypting with your Symmetric AES Key:
>String plaintext = "This is my plain text!";
>byte[] cipherText = SymmetricEncryptionUtils.performAESEncryption(plaintext, key, initializationVector);
## To Begin Decrypting with your Symmetric AES key:
>String decryptedText = SymmetricEncryptionUtils.performAESDecryption(cipherText, key, initializationVector);
## Printing All outputs:
>System.out.println("SecureRandom Generated AES Key: " + DatatypeConverter.printHexBinary(initializationVector));
>System.out.println("SecureRandom Generated InitializationVector: " + DatatypeConverter.printHexBinary(key.getEncoded()));
>System.out.println("PlainText: " + plainText);
>System.out.println("CipherText: " + DatatypeConverter.printHexBinary(cipherText));
>System.out.println("Decrypted Text: " + decryptedText);
## Sample output:
>SecureRandom Generated AES Key: EAF707F6F40B4878D1B2BAE7DD81107E
SecureRandom Generated InitializationVector: DCD5086C455BB1585B4A9C130838B4374DB17550326F652107453779A0533005
PlainText: This is the plaintext we are testing
CipherText: 77928246611D166F8E80B12E913E14FBD3AC885E76796011B0E05710F47BE73B7E200B38D5C3DF6CBD5AEBA1376C429B
Decrypted Text: This is the plaintext we are testing

