package me.hosung.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RequestHandler {

    @RequestMapping("/pointToAddress")
    public String pointToAddress(@RequestParam("lat")String lat, @RequestParam("lon")String lon){


        if(ObjectUtils.isEmpty(lat)||ObjectUtils.isEmpty(lon)){
            log.warn("빈 값의 파라미터가 들어옴");
            return "API 규격을 준수해주시기 바랍니다.";
        }

        try{
            Double.parseDouble(lat);
            Double.parseDouble(lon);
        }catch(Exception e){
            log.error("유효 하지 않은 파라미터 값이 인입됨. lat:{}, lon: {}",lat, lon);
        }

        log.info("requested lat: {}, lon: {}", lat, lon);
        String result = "서울특별시 강남구 역삼동";
        return result;
    }

    @RequestMapping("/")
    public String defaultRequest(){
        return "Hello World";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/gildong")
    public String gildong(){
        return "Hello this is gildong.";
    }


}
