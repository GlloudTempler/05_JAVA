package chap06.Sec06.exam06;

/**
 * packageName : chap06.Sec06.exam06
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
        Car car = new Car();
        car.setSpeed(-50);

        System.out.println("현재 속도 : " + car.getSpeed());

        car.setSpeed(60);
        if(!car.isStop()) {
            car.setStop(true);
        }
        System.out.println("현재속도 : " + car.getSpeed());

    }
}
