package com.maven.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：吴鸿.
 * @ Date       ：Created in 9:15 2019/8/20
 * @ Description：这个类是
 * @ Modified By：
 * @Version: v-001
 */
@RestController
@RequestMapping("OrderController")
@Api(tags = {"OrderController", "分类:OrderController"})
public class OrderController {

    @RequestMapping("demo")
    @ApiOperation(value = "demo")
    public String demo(){
        return "demo";
    }
}
