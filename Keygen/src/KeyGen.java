import java.io.File;
import java.io.PrintWriter;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.*;
import java.io.*;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class KeyGen {
  public static void main(String[] argv) throws Exception {
	  
	  File file1 = new File("XPrivateKey.key");
	  File file2 = new File("XPublicKey.key");
	  File file3 = new File("YPrivateKey.key");
	  File file4 = new File("YPublicKey.key");
	  File file5 = new File("symmetric.key");
	  
	  System.out.println("Input a 16 character plaintext string: ");
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  String input = reader.readLine();
	
	  
	  PrintWriter printWriter = new PrintWriter(file1);
	  PrintWriter printWriter2 = new PrintWriter(file2);
	  PrintWriter printWriter3 = new PrintWriter(file3);
	  PrintWriter printWriter4 = new PrintWriter(file4);
	  PrintWriter printWriter5 = new PrintWriter(file5);
	  
	printWriter5.println(input);
	printWriter5.close();
	  
    // Generate a 1024-bit Digital Signature Algorithm (DSA) key pair
    KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
    keyGen.initialize(1024);
    KeyPair keypair = keyGen.genKeyPair();
    PrivateKey privateKey = keypair.getPrivate();
    printWriter.println(privateKey);
    printWriter.close();
    PublicKey publicKey = keypair.getPublic();
    printWriter2.println(publicKey);
    printWriter2.close();
	
    KeyPairGenerator keyGen2 = KeyPairGenerator.getInstance("RSA");
    keyGen2.initialize(1024);
    KeyPair keypair2 = keyGen2.genKeyPair();
    PrivateKey privateKey2 = keypair2.getPrivate();
    printWriter3.println(privateKey2);
    printWriter3.close();
    PublicKey publicKey2 = keypair2.getPublic();
    printWriter4.println(publicKey2);
    printWriter4.close();
	
	
  } 
  
  
}
