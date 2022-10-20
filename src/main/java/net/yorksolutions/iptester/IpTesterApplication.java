package net.yorksolutions.iptester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class IpTesterApplication {

//    public static String getMd5(String input)
//    {
//        try {
//
//            // Static getInstance method is called with hashing MD5
//            MessageDigest md = MessageDigest.getInstance("MD5");
//
//            // digest() method is called to calculate message digest
//            // of an input digest() return array of byte
//            byte[] messageDigest = md.digest(input.getBytes());
//
//            // Convert byte array into signum representation
//            BigInteger no = new BigInteger(1, messageDigest);
//
//            // Convert message digest into hex value
//            String hashtext = no.toString(16);
//            while (hashtext.length() < 32) {
//                hashtext = "0" + hashtext;
//            }
//            return hashtext;
//        }
//
//        // For specifying wrong message digest algorithms
//        catch (NoSuchAlgorithmException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    // Driver code
//    public static void main(String args[]) throws NoSuchAlgorithmException
//    {
//        String s = "2";
//        System.out.println("Your HashCode Generated by MD5 is: " + getMd5(s));
//    }
//}

    public static void main(String[] args) {
        SpringApplication.run(IpTesterApplication.class, args);
    }

}
