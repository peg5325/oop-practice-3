package org.example;

import org.junit.jupiter.api.Test;

/**
 * • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계 / 수강신청 총학점 수
 * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
 * • 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    // 학점계산기 도메인 : 이수한 과목, 학점 계산
    // 이수한 과목 : 객체지향 프로그래밍, 자료구조, 중국어회화 --> 과목(코스) 클래스

    // 이수한 과목을 전달하여 평균학점 계산 요청 ----> 학점 계산기 ----> (학점수×교과목 평점)의 합계 ----> 과목(코스)
    //                                               ----> 수강신청 총학점 수        ----> 과목(코스)


    @Test
    void calculateGradeTest() {

    }
}
