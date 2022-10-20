package net.yorksolutions.iptester;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
public class IpTesterController {

    private IpTesterService ipTesterService;

    public IpTesterController(IpTesterService ipTesterService) {
        this.ipTesterService = ipTesterService;
    }

    @GetMapping("/ip")
    public String generateIp() throws UnknownHostException {
        return this.ipTesterService.getRemoteAddress();
    }

    @GetMapping("/host")
    public String generateHostName() throws UnknownHostException {
        return this.ipTesterService.getHost();
    }

    @GetMapping("/local")
    public String areLocal() throws UnknownHostException {
        return this.ipTesterService.anyLocal();
    }

    @GetMapping("/totals")
    public String totals() throws UnknownHostException {
        return this.ipTesterService.totalHostNames();
    }


}
