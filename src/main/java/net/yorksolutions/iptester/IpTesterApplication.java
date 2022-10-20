package net.yorksolutions.iptester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
@SpringBootApplication
public class IpTesterApplication {

    public static void main(String[] args) {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(dtf.format(now));
//        InetAddress ip;
//        String hostname;
//        try {
//            ip = InetAddress.getLocalHost();
//            hostname = ip.getHostName();
//            System.out.println("Your current IP address : " + ip);
//            System.out.println("Your current Hostname : " + hostname);
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
//    }
//}
        SpringApplication.run(IpTesterApplication.class, args);
    }

}
