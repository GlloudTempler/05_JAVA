package chap07.Verify.exam02;

/**
 * packageName : chap07.Verify.exam02
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
    int colorpoint1;
    int colorpoint2;
    void set(int a, int b) {
        colorpoint1 = a;
        colorpoint2 = b;
    }
    void showPoint() {
        System.out.println("(" + colorpoint1 + "," + colorpoint2 + ")");
    }
}
