package com.dev;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {

    /**
     *  의존성 확인을 위한 코드 - 시작
     */
    private final TestBean testBean;

    @Autowired
    public RestApplication(TestBean testBean) {
        this.testBean = testBean;
    }

    @PostConstruct // 의존성 주입 후 실행되게하는 ANNOTATION
    public void dependencyTest() {
        testBean.dependencyTest();
    }

    @PostConstruct // 의존성 주입 후 실행되게하는 ANNOTATION
    public void dependencyTestCode() {
        testBean.dependencyTestCode();
    }
    /**
     *  의존성 확인을 위한 코드 - 끝
     */

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

}