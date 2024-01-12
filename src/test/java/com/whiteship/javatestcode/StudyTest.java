package com.whiteship.javatestcode;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// 리플랙션 때문에 public 사용 필요 없음.
class StudyTest {

    @Test
    public void create() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
    @Disabled // test code 사용 안할 때 (테스트 코드이지만 사용 안할 때)
    void create1(){
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }
}