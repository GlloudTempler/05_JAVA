package chap07.Sec01.exam06;

/**
 * packageName : chap07.Sec01.exam06
 * fileName : Car
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
public class Car {
    public int speed; // 속도 속성

    /*
    * 속도 증가 함수
    * */
    public void speedUp() {
        speed += 1;
    }
    /*
    * final함수
    * */
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
