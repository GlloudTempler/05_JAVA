package Chap11.Sec01.exam01;

import chap11.sec01.exam01.Member;

/**
 * packageName : Chap11.Sec01.exam01
 * fileName : MemberApplication
 * author : GGG
 * date : 2023-09-25
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-25         GGG          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
        Member member = new Member("blue");
        Member member2 = new Member("blue");

        if(member.equals(member2)) {
            System.out.println("같습니다.");
        }else {
            System.out.println("다릅니다.");
        }
    }
}
