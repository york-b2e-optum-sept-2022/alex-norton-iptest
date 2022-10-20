package net.yorksolutions.iptester;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.HashMap;


@Service
public class IpTesterService {

    String ipAddress1;


    public HashMap ip(HttpServletRequest request) {
        HashMap map = new HashMap();
        map.put("ip", request.getRemoteAddr());
        return map;
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

    public HashMap cookies(HttpServletRequest request) {
        HashMap map = new HashMap();
        map.put("cookies", request.getCookies());
        return map;

    }

    public HashMap path(HttpServletRequest request) {
        HashMap map = new HashMap();
        map.put("path", request.getPathInfo());
        return map;
    }

    public HashMap method(HttpServletRequest request) {
        HashMap map = new HashMap();
        map.put("Method", request.getMethod());
        return map;
    }

    

}








