package Chap12.Sec01.exam05;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * packageName : Chap12.Sec01.exam05
 * fileName : HappySetApplication
 * author : GGG
 * date : 2023-09-25
 * description : 회원객체
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-25         GGG          최초 생성
 */
public class HappySetApplication {
    public static void main(String[] args) {
//        객체 : 다형성
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
//        TODO 중복제거 되었는지 확인
        System.out.println(set);
    }

}