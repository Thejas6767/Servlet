package com.xworkz.student.dto;


import lombok.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StudentDTO {

    private int studentId;
    private String studentName;
    private String course;
    private String email;
    private int age;

    public StudentDTO(int studentId, String studentName, String course, String email, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", course='" + course + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDTO)) return false;
        StudentDTO that = (StudentDTO) o;
        return studentId == that.studentId && age == that.age &&
                Objects.equals(studentName, that.studentName) &&
                Objects.equals(course, that.course) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, course, email, age);
    }
}
