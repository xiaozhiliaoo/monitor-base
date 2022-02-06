package org.lili.monitor;

/**
 * @author lili
 * @description ${DESCRIPTION}
 * @create 2019-03-09 12:59
 * @since
 **/

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@SpringBootConfiguration
@EnableAutoConfiguration
@Log4j2
public class Application {
    public static void main(String[] args) {
        try {
            SpringApplication.run(Application.class, args);
        } catch (Throwable e) {
            log.error("", e);
        }
    }
}
