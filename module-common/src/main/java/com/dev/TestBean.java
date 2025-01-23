package com.dev;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

    public void dependencyTest() {
        System.out.println("성공적으로 로딩됐습니다.");
    }

    public void dependencyTestCode() {
        System.out.println("테스트 2 실행 문구 입니다.");
    }

}