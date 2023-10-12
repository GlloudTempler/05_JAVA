package chap08.Sec01.exam02;

/**
 * packageName : chap08.Sec01.exam02
 * fileName : SoudableApplication
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
public class SoudableApplication {
    static void printSound(Soundable soundable) {
//        TODO : 매개변수에 자식객체를 넣으면 자식객체의 함수가 호출됨(sound())
        System.out.println(soundable.sound()); //부모 인터페이스의 함수 호출
    }

    public static void main(String[] args) {
//        TODO : 함수의 매개변수 다형성
        printSound(new Cat()); // 야옹
        printSound(new Dog()); // 멍멍
    }
}
