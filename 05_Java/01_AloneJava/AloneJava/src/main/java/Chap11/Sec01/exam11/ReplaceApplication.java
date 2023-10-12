package Chap11.Sec01.exam11;

/**
 * packageName : Chap11.Sec01.exam11
 * fileName : ReplaceApplication
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
public class ReplaceApplication {
    public static void main(String[] args) {
//        API : 자바의 유용한 함수 묶음
        String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 API도 지원합니다.";
//        TODO : 문자열 바꾸기 : 문자열.replace(이전문자, 바꿀문자);
        String newstr = oldStr.replace("자바", "JAVA");
        System.out.println(newstr);
    }

}
