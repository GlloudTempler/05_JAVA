package Chap10.Sec01.exam03;

/**
 * packageName : Chap10.Sec01.exam01
 * fileName : NumberFormatApplication
 * author : GGG
 * date : 2023-09-26
 * description : Number format 에러[예외] (Exception)
 *               문자열 -> 숫자로 변경했는데 그 숫자형태가 잘못되었을 경우
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class NumberFormatApplication {
    public static void main(String[] args) {
//        TODO : 강제로 Number Format 에러 발생 예제
        String data = "100";
        String data2 = "a100";
//        TODO : 문자열을 숫자로 변경 :
        int val1 = Integer.parseInt(data);
        int val2 = Integer.parseInt(data2);
        System.out.println(val1);
        System.out.println(val2);
    }
}
