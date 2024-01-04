package com.brainqy.swaggerdemo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@Api(tags = "Base Api")
@Slf4j
public class HelloController {
    @GetMapping("/ui/{user}")
    @ApiOperation(value = "Get a Greeting message", response = String.class)
    public String getHello(@PathVariable String user) {
        log.info("I am in Hello controller");
        return "Hello " + user;
    }

}
