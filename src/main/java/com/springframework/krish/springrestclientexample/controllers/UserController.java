package com.springframework.krish.springrestclientexample.controllers;

import com.springframework.krish.springrestclientexample.services.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class UserController {

    private ApiService apiService;

    public UserController(ApiService apiService) {
        this.apiService = apiService;
    }

    @RequestMapping("/index")
    @GetMapping
    public String index(){
        return "index";
    }

    //@RequestMapping("/users") //@RequestMapping(value = "/users", method = RequestMethod.POST)
    /*@PostMapping("/users")
    public String formPost(Model model, ServerWebExchange serverWebExchange){
        MultiValueMap<String, String> map = serverWebExchange.getFormData().block();

        Integer limit = new Integer(map.get("limit").get(0));

        if(limit == null || limit == 0){
            limit = 10;
        }
        model.addAttribute("users", apiService.getUsers(limit));

        return "userList";
    }*/

    @PostMapping("/users")
    public String formPost(Model model, @RequestParam Integer limit){
        //MultiValueMap<String, String> map = serverWebExchange.getFormData().block();
        //limit = new Integer(map.get("limit").get(0));

        if(limit == null || limit == 0){
            limit = 10;
        }
        System.out.println(limit);
        model.addAttribute("users", apiService.getUsers(limit));

        return "userList";
    }

    @GetMapping("/users/{id}")
    public String getUserById(Model model, @PathVariable Integer id){
        //MultiValueMap<String, String> map = serverWebExchange.getFormData().block();
        //limit = new Integer(map.get("limit").get(0));

        if(id == null || id == 0){
            id = 10;
        }
        System.out.println(id);
        model.addAttribute("users", apiService.getUsers(id));

        return "userList";
    }
}

