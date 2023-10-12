package Chap12.Sec01.Verify.exam07;

import java.util.Objects;

/**
 * packageName : Chap12.Sec01.Verify.exam07
 * fileName : Student
 * author : GGG
 * date : 2023-09-26
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class Student {
    int studentNum;
    String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNum == student.studentNum && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum, name);
    }

    public int getStudentNum() {
        return studentNum;
    }

    public String getName() {
        return name;
    }
}
