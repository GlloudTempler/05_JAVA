package chap06.sec03.exam03;

/**
 * packageName : chap06.sec03.exam03
 * fileName : Car
 * author : GGG
 * date : 2023-09-20
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class Car {
//    TODO : 속성(필드), 생성자함수, 함수(메서드)
//    속성
    String company = "현대자동차";   // 제조사
    String model; // 자동차 모델(suv, 세단...)
    String color; // 자동차 색깔
    int maxSpeed; // 최고속도
//    기본 생성자
    public Car() {};

//    매개변수 1개짜리 생성자
    public Car(String model) {
//        TODO : this(객체 자신을 의미하는 객체변수)
        this.model = model;
    }
//    매개변수 2개짜리 생성자
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
//    매개변수 3개짜리 생성자
//    자동화 기능 이용
    public Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}