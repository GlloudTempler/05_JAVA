package chap06.Sec05.exam01;

/**
 * packageName : chap06.Sec05.exam01
 * fileName : CarApplication
 * author : GGG
 * date : 2023-09-21
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-21         GGG          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
//        객체 생성
        Car car = new Car("포르쉐");
        Car car2 = new Car("벤츠");

        car.run();
        car2.run();
    }
}
