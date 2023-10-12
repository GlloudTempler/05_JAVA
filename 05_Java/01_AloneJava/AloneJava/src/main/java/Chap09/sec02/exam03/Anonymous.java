package Chap09.sec02.exam03;

/**
 * packageName : Chap09.sec02.exam03
 * fileName : Anonymous
 * author : GGG
 * date : 2023-10-02
 * description : 익명 객체안에서의
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-02         GGG          최초 생성
 */
public class Anonymous {
//    TODO : 지역변수 / 매개변수 -> 상수(final)
    private int field; // 속성
    public void method(int arg) {
        int var1 = 0; // 지역 변수
//        var1 = 1; // 수정 불가
//        arg = 2; // 수정 불가
//        TODO : 익명 객체 생성
        Calculator calculator = new Calculator() {
            @Override
            public int sum() {
                int result = arg + var1;
                return result;
            }
        };
    }
}
