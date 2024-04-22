package me.hosung;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Main {
    public static void main(String[] args) {
        log.debug("디버그 로그입니다.");
        log.info("시스템이 작동했습니다.");
        log.warn("경고 로그 입니다.");
        log.error("에러 로그 입니다.");
        SpringApplication.run(Main.class, args);
    }
}