package com.beyondh.three.controller;

import com.beyondh.three.service.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.lang.String;


@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private RandomService randomService;

    @RequestMapping(value = "/random/{count}",method = RequestMethod.GET)
    @ResponseBody
    public String RandomNumber(@PathVariable int count) {
        long start = System.nanoTime();
        int[] numbers = randomService.generateRandomNumber(count);
        long end = System.nanoTime();

        return new StringBuilder().append("运行时间:" + (end - start) + "ns").append("运行结果：" + Arrays.toString(numbers)).toString();
    }
}
