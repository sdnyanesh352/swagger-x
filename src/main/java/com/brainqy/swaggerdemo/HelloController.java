package com.brainqy.swaggerdemo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@Api(tags = "Base Api")
public class HelloController {
    @GetMapping("/ui/{user}")
    @ApiOperation(value = "Get a Greeting message",response = String.class)
    public String getHello(@PathVariable String user){

        return "Hello " + user ;
    }

}
