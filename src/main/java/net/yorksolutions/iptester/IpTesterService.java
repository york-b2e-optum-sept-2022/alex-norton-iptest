package net.yorksolutions.iptester;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.HashMap;


@Service
public class IpTesterService {

    String ipAddress1;
    public HashMap getRemoteAddress() throws UnknownHostException {
        ipAddress1 = InetAddress.getLocalHost().getHostAddress();
        HashMap ip = new HashMap();
        ip.put("IP Address", this.ipAddress1);
       return ip;

    }
    String hostName;
    public HashMap getHost() throws UnknownHostException {
        hostName = InetAddress.getLocalHost().getHostName();
        HashMap host = new HashMap();
        host.put("Hostname:", this.hostName);
        return host;
    }
    String locals;
    public HashMap anyLocal() throws UnknownHostException {
        locals = String.valueOf(InetAddress.getLocalHost().isAnyLocalAddress());
       HashMap local = new HashMap();
       local.put("Local?", this.locals);
       return local;
    }


    String dateTime;
    public HashMap getDate() {
        dateTime = String.valueOf(LocalDateTime.now());
        HashMap dT = new HashMap();
        dT.put("Date and Time:", this.dateTime);
        return dT;
    }

    String headers;
    public HashMap httpHeaders(){
        headers = String.valueOf("hellooo");
        HashMap head = new HashMap();
        head.put("Headers:", this.headers);
        return head;
    }

}








