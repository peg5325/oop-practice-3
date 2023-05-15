package org.example;

import java.util.List;

public class GradeCalculator {
    private final List<Course> courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }

    // • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계 / 수강신청 총학점 수
    public double calculateGrade() {
        // (학점수×교과목 평점)의 합계
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            //객체에게 작업을 위임하기 위해 course 내부에 multiplyCreditAndCourseGrade를 생성
            //응집도를 낮추는 역할, 다른 곳에서도 똑같이 있는 경우 다른 곳도 다 바꿔줄 필요없이 저 부분만 수정할 수 있도록 변경
            //Getter를 통해서 정보를 가지고 와서 처리하는 방식이 아닌 해당 데이터를 가진 객체에게 메세지를 던져 작업을 처리하게 해준다면 변화에 유연한 코드를 만들 수 있음.
            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }

        // 수강신청 총학점 수
        int totalCompletedCredit = courses.stream()
                .mapToInt(Course::getCredit)
                .sum();

        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
