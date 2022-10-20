package net.yorksolutions.iptester;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.UnknownHostException;
import java.util.HashMap;

@RestController
public class IpTesterController {

    private final IpTesterService ipTesterService;

    public IpTesterController(IpTesterService ipTesterService) {
        this.ipTesterService = ipTesterService;
    }

    @GetMapping("/ip")
    public HashMap ip(HttpServletRequest request) {
        return this.ipTesterService.ip(request);
    }

    @GetMapping("/host")
    public HashMap generateHostName() throws UnknownHostException {
        { return this.ipTesterService.getHost();}
    }

    @GetMapping("/local")
    public HashMap areLocal() throws UnknownHostException {
        { return this.ipTesterService.anyLocal();}
    }


    @GetMapping("/date")
    public HashMap date() {
        {return this.ipTesterService.getDate();}
    }

    @GetMapping("/cookies")
    public HashMap cookies(HttpServletRequest request) {
        return this.ipTesterService.cookies(request);
    }

    @GetMapping("/path")
    public HashMap path(HttpServletRequest request) {
        return this.ipTesterService.path(request);
    }

    @GetMapping("/method")
    public HashMap method(HttpServletRequest request) {
        return this.ipTesterService.method(request);
    }





}
