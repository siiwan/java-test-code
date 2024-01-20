package com.whiteship.javatestcode;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

// under bar remove
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
// 리플랙션 때문에 public 사용 필요 없음.
class StudyTest {

    @FastTest
    @DisplayName("스터디 만들기 \uD83D\uDE31")
    public void create_new_study() {

        Study actual = new Study(100);
        assertThat(actual.getLimit()).isGreaterThan(0);

        //IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Study(-10));
        //assertEquals("limit은 0보다 커야 한다.", exception.getMessage());
        //Study study = new Study( -10);

        // 테스트코드를 한번에 실행시켜 한번에 알 수 있음.
//        assertAll(
//                () -> assertNotNull(study),
//                () -> assertEquals(StudyStatus.ENDED, study.getStatus(), () -> "스터디를 처음 만들면 상태값이 DRAFT여야 한다."),
//                () -> assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0보다 커야 한다.")
//        );

    }

    @Test
    @Disabled // test code 사용 안할 때 (테스트 코드이지만 사용 안할 때)
    @DisplayName("스터디 만들기 🤣")
    void create_new_study_again(){
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