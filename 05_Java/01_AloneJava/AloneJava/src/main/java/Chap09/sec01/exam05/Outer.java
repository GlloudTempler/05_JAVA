package Chap09.sec01.exam05;

/**
 * packageName : Chap09.sec01.exam05
 * fileName : Outer
 * author : GGG
 * date : 2023-10-02
 * description : 내부 클래스 안에서 외부 클래스(this) 참조
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-02         GGG          최초 생성
 */
public class Outer {
    String field = "Outer-field"; // 외부 속성
    void method() {
        System.out.println("Outer-method"); // 외부 함수
    }
    //    TODO : 일반 내부 클래스
    class Nested {
        String field = "Nested-field"; // 내부 속성

        void method() {
            System.out.println("Nested-method");
        } // 내부 함수
        void print() {
            System.out.println(this.field); // 중첩 클래스의 속성 접근
            this.method(); // 중첩 클래스의 함수 호출

//          TODO: 여기 코딩
//                외부 클래스의 속성/함수 접근 : 외부클래스명.this.속성/함수
            System.out.println(Outer.this.field);
        }
    }
}
