package Chap11.Sec01.exam07;

/**
 * packageName : Chap11.Sec01.exam07
 * fileName : StringCharApplication
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
public class StringCharApplication {
    public static void main(String[] args) {
//        주민번호
        String ssn = "123456-1235467";
//        TODO : 1문자 가져오기
        char gender = ssn.charAt(7);
        if(gender == '1' || gender == '3') {
            System.out.println("남자");
        }else if(gender == '2' || gender == '4') {
            System.out.println("여자");
        }
    }

}
