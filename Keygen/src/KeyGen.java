/**
 * Created by Roach on 9/28/17.
 */

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

        import java.security.KeyPair;
        import java.security.KeyPairGenerator;
        import java.security.PrivateKey;
        import java.security.PublicKey;
        import java.io.PrintWriter;
        import java.io.File;


public class KeyGen {
    public static void main(String[] argv) throws Exception {
        // Generate a 1024-bit Digital Signature Algorithm (DSA) key pair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024);
        KeyPair keypair = keyGen.genKeyPair();
        PrivateKey privateKey = keypair.getPrivate();

        System.out.println("private key " +privateKey);
        PublicKey publicKey = keypair.getPublic();

        System.out.println("public key " + publicKey);
//        todo need to use FileOutputStream here and not printwriter
        File file = new File("pubkey.txt");
        PrintWriter printwriter = new PrintWriter(file);
        printwriter.println(publicKey);
        printwriter.close();

    }
}
