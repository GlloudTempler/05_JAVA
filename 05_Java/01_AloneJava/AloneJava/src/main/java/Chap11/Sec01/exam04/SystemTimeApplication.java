package Chap11.Sec01.exam04;

/**
 * packageName : Chap11.Sec01.exam04
 * fileName : SystemTimeApplication
 * author : GGG
 * date : 2023-09-26
 * description : system객체 : 소요시간 체크 .nanoTime()
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class SystemTimeApplication {
    public static void main(String[] args) {
//        1) 처음 시간 체크 (컴퓨터 설정된 현재시간)
        long time = System.nanoTime(); // 1/10^9 시간
//        2) TODO : 실행문
        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i; //누적합
        }
//        3) 마지막 시간 체크
        long time2 = System.nanoTime(); // 1/10^9 시간
//        4) 마지막 시간 - 처음 시간 = 소요시간
        System.out.println("1~백만까지 합 : " + sum);
        System.out.println("소요시간(ns) : " + (time2 - time));
    }
}
