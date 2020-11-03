package awayoffice.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAwayOffice {
    
    @GetMapping(path = "/hello")
    public HelloWorldBean getHelloAway(){
        return new HelloWorldBean("Welcome to Away Office");
    }

    @GetMapping(path = "/pv/{name}")
    public HelloWorldBean getHelloAwayName(@PathVariable String name){

        return new HelloWorldBean(String.format("Welcome  to Away Office %s",name));
    }


}