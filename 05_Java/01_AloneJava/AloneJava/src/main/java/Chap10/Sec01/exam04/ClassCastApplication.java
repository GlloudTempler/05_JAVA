package Chap10.Sec01.exam04;

/**
 * packageName : Chap10.Sec01.exam04
 * fileName : ClassCastApplication
 * author : GGG
 * date : 2023-09-26
 * description : Class Cast 에러[예외]
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class ClassCastApplication {
    public static void main(String[] args) {
//        강아지 객체 생성
        Dog dog = new Dog();
        changedog(dog); //가능(매개변수의 다형성_

//        TODO : Class Cast 에러 발생 코드
//               고양이 객체 생성
        Cat cat = new Cat();
        changedog(cat);//에러
    }
//    공유함수
    public static void changedog(Animal animal) {
        Dog dog = (Dog)animal;
    }


}
//    동물 글래스
class Animal{}
//    강아지
class Dog extends Animal{}
//    고양이
class Cat extends Animal{}