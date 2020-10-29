package awayoffice.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAwayOffice {
    
    @GetMapping(path = "/hello")
    public HelloWorldBean getHelloAway(){
        return new HelloWorldBean("Welcome to Away Office");
    }



}