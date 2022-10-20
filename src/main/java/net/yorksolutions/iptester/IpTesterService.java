package net.yorksolutions.iptester;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.net.InetAddress;
import java.net.UnknownHostException;


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

    String hosts;
    protected String totalHostNames() throws UnknownHostException {
        hosts = InetAddress.getLocalHost().getCanonicalHostName();
        return this.locals;
    }






}
