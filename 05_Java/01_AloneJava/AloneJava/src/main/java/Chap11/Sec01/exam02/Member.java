package Chap11.Sec01.exam02;

import java.util.Objects;

/**
 * packageName : Chap11.Sec01.exam02
 * fileName : Member
 * author : GGG
 * date : 2023-09-25
 * description : 객체를 동등 비교 (.hashCode())
 * 요약 :
 *       해쉬코드(hashCode) : 객체를 식별하는 유일한 정수값(번호 중복 없음)
 *       1) 방번호(주소) : 메모리의 랜덤하고 유일한 방번호 만들 때 사용
 *       2) HashMap, HashSet 자료구조에서 내부적으로 해쉬코드를 사용함(객체들을 비교할 때)
 *       TODO => 기본 hashCode는 객체간 비교에서 오류를 일으키므로 재정의 해야함
 *            => .equals(), .hashCode() 재정의 해야함(추천 : 자동 코딩 기능 이용)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-25         GGG          최초 생성
 */
public class Member {
//    속성
    public String id;
//    생성자
    public Member(String id) {
        this.id = id;
    }
//    equals90, hashCode() 재정의 함수 :

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // 객체의 비교(속성을 비교)
    }
}
