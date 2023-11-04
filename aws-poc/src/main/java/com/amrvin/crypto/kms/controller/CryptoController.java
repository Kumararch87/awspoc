package com.amrvin.crypto.kms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crypto")
public class CryptoController {

    @RequestMapping(method = RequestMethod.GET , path = "/encrypt")
    String encrypt() {
        return "amrvin";
    }

}