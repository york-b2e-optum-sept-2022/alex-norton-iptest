package net.yorksolutions.iptester;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;


@Service
public class IpTesterService {

    String ipAddress1;
    protected String getRemoteAddress() throws UnknownHostException {
        ipAddress1 = InetAddress.getLocalHost().getHostAddress();
       return "Ip Address: " + this.ipAddress1;

    }
    String hostname;
    protected String getHost() throws UnknownHostException {
        hostname = InetAddress.getLocalHost().getHostName();
        return "Hostname: " + this.hostname;
    }
    String locals;
    protected String anyLocal() throws UnknownHostException {
        locals = String.valueOf(InetAddress.getLocalHost().isAnyLocalAddress());
        return this.locals;
    }


    String dateTime;
    protected String getDate() {
        dateTime = String.valueOf(LocalDateTime.now());
        return this.dateTime;
    }


}
