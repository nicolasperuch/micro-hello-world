package hello.world.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HomeController {

    @Get()
    public String home(){
        return "Home";
    }
}
