package com.example.frontend;

import com.example.frontend.SharedDataTypes.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontEndController {

    MethodCaller name = new MethodCaller();
    View view = new View();

    @GetMapping("/login")
    public String login(String username, String password, Model model){
        name.sendUserforAuthority(username, password);
        name.getUser();

        return null;
    }
}
