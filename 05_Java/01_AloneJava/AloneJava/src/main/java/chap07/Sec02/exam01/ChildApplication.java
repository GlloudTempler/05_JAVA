package chap07.Sec02.exam01;

/**
 * packageName : chap07.Sec02.exam01
 * fileName : ChildApplication
 * author : GGG
 * date : 2023-09-22
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-22         GGG          최초 생성
 */
public class ChildApplication {
    public static void main(String[] args) {
//        TODO : 일반적인 경우(단형)
        Child3 child3 = new Child3(); // child3 = 자식3 객체
        child3.method2();
        child3.method3(); // 결과 : 부모 method2 => 고객 요구사항 => 자식 method2
//                                                             => 자식 method3...

//        다형성 코드
//        TODO : 부모 = 자식(다형성 코드) , `상속관계에서만 가능`
//               목적(장점) : 실행시에 사용방법은 동일하지만 다양한 객체를 이용해서
//                           다양한 실행 결과를 나오도록 코딩하고 싶을 때 사용
//                           기존 소스 (As - Is 소스, 레가시 소스), 새로운 소스를 만들어서 갈아끼움
        Parent parent = child3; // 부모 parent = 자식3
        parent.method1();
        parent.method2(); // 부모함수 x / 자식 함수 o : 함수 재정의

        Parent parent2 = new Child2(); // 부모 parent = 자식3
        parent2.method1();
        parent2.method2(); // 부모함수 x / 자식 함수 o : 함수 재정의

//        TODO : 주의점 : 다형성을 이용해서 만든 객체(parent)에서 자식 고유의 함수를 갖지 못함

    }
}
