package com.keyin.hello;

import com.keyin.entities.Person;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GreetingController {

    @GetMapping("hello")
    public String greeting(){
        return "Hello World";
    }

    @GetMapping("person")
    public Person personGreeting(){
        Person jordan  = new Person();
        jordan.setFirstName("Jordan");
        jordan.setLastName("Kelloway");
        jordan.setPhoneNumber("123-123-1233");

        return jordan;

    }
}
