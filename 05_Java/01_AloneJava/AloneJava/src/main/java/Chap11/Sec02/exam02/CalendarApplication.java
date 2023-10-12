package Chap11.Sec02.exam02;

import java.util.Calendar;

/**
 * packageName : Chap11.Sec02.exam02
 * fileName : CalenderApplication
 * author : GGG
 * date : 2023-09-26
 * description : Calendar
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class CalendarApplication {
    public static void main(String[] args) {
//        TODO : 날짜 연산 객체
        Calendar now = Calendar.getInstance(); // 싱글톤(디자인패턴) : 공유(정적) 객체

//        TODO : Calendar객체변수.get(날짜상수들)
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int week = now.get(Calendar.DAY_OF_WEEK);
        int day = now.get(Calendar.DAY_OF_MONTH);

//        TODO : 현재 날짜 정보
        System.out.println(year + "년");
        System.out.println(month + "월");
        System.out.println(week + "요일");
        System.out.println(day+ "일");
//        TODO : 현재 시간 정보
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(hour + "시");
        System.out.println(minute + "분");
        System.out.println(second + "초");
    }
}
