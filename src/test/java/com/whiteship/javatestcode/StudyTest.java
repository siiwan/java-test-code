package com.whiteship.javatestcode;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
    }

    @Test
    @Disabled // test code 사용 안할 때 (테스트 코드이지만 사용 안할 때)
    @DisplayName("스터디 만들기 🤣")
    void create_new_study_again(){
        System.out.println("create1");
    }

    @DisplayName("반복테스트")
    @RepeatedTest(value = 10, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
    void repeatTest(RepetitionInfo repetitionInfo){
        System.out.println("test" + repetitionInfo.getCurrentRepetition() + "/" + repetitionInfo.getTotalRepetitions());
    }

    @DisplayName("스터디 만들기")
    @ParameterizedTest(name = "{index} {displayName} message={0}")
    @ValueSource(strings = {"날씨가", "많이", "추워지고", "있어요."})
    void parameterizedTest (String message){
        System.out.println("message = " + message);
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