package co.develhope.deploy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Value("${myCustomEnvs.devName}")
    String myName;
    @Autowired
    Environment env;


    @GetMapping("/1")
    public String devName1(){
        return myName;
    }

    @GetMapping("/2")
    public String devName2(){
        return env.getProperty("myCustomEnvs.devName");
    }


}