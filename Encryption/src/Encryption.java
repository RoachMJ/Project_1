/**
 * Created by Roach on 9/26/17.

 3. Need to display prompt for message to by encrypted

 4. read message 'M' from file ie inputstream peice by peice of size 1024 bytes
    -calculate the sha256 hash value (ie the digital digest) of the entire message and save to file 'message'.dd
    -display sha256('M') in hexadecimal bytes
 5. caclulate RSA encryption of sha256('M') using Kx^- "how many bytes is the cypher text?"
    -save RSA cyphertext (digital signature of 'M') to file named message.ds-msg
    -display the message in hexadecimal bytes
    -append the message to the the message.ds-msg peice by piece
 6. calculate the aes encryption of (RSA-en _kx - (sha256 ('M')) || 'M') using kxy by reading message.ds-msg piece by piece
    in multiple of 16 bytes if last peice is not 16 bytes long place in byte array the size of last piece.
    -save resulting AES cyphertext into a file named message.eascipher

 Encryption is Done

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedInputStream;




public class Encryption {
    public static void main(String[] args ){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //   String s = br.readLine();



   // public void file_inputStream throws IOException {
   //     File initialFile = new file(src);
   //     InputStream targetStream = new FileInputStream(initialFile);

    }
}
