/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author DELL
 */
@Controller
@RequestMapping(value = "/khaosat")
public class KhaosatController {
    @RequestMapping(value = "/taokhaosat", method = RequestMethod.GET)
    public String xinchao()
    {
        return "newjsp";
    }
    @RequestMapping(value = "/xemkhaosat", method = RequestMethod.GET)
    public String xinchao1()
    {
        return "xinchao";
    }
    
}
