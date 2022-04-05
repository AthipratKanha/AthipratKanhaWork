package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Service
{
    public static void main(String[] data)
    {
        ApplicationContext context;
        context = SpringApplication.run(Builder.class);
    }
}

@SpringBootApplication
class Builder { }

@RestController
class Test
{
    @RequestMapping("/test")
    int m() { return 1234; }
}