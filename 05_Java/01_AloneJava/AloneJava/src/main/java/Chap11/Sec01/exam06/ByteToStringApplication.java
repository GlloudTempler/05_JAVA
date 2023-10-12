package Chap11.Sec01.exam06;

/**
 * packageName : Chap11.Sec01.exam06
 * fileName : ByteToStringApplication
 * author : GGG
 * date : 2023-09-26
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class ByteToStringApplication {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
//        TODO : byte배열 -> 문자열 반환
        String str1 = new String(bytes);
        System.out.println(str1);
    }
}
