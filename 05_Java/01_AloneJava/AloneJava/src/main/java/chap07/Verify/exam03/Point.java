package chap07.Verify.exam03;

/**
 * packageName : chap07.Verify.exam03
 * fileName : Point
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
public class Point {
    int point1;
    int point2;

    public Point() {
        point1 = 0;
        point2 = 0;
    }
    public Point(int point1, int point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public void showPoint() {
        System.out.println("(" + point1 + "," + point2 + ")");
    }
}

