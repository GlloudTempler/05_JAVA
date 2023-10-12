package chap07.Sec02.exam02;

/**
 * packageName : chap07.Sec02.exam02
 * fileName : Bus
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
public class Bus extends Vehicle{
//    run() 오버라이딩

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
