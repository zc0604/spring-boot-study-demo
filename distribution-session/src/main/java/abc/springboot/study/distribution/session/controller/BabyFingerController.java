package abc.springboot.study.distribution.session.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class BabyFingerController {

    @RequestMapping
    @ResponseStatus(HttpStatus.OK)
    public String sayHello(HttpSession httpSession , String greeting){
        String storedName = (String) httpSession.getAttribute("greeting");
        if (storedName == null) {
            httpSession.setAttribute("greeting", greeting);
        }
        return "say: " + greeting ;
    }
}
