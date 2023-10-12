package chap02;

/**
 * packageName : chap02
 * fileName : Sec0201
 * author : GGG
 * date : 2023-09-18
 * description :
 * 요약 :
 *       변수 : 값을 저장할 수 있는 메모리 공간
 *       변수 사용 범위 : {}안에서만 사용가능
 *                      만약 {}안에 {}있다면 변수는 안에 {}도 사용 가능
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-18         GGG          최초 생성
 */
public class Sec0201 {
    public void exam01() {
        int value = 20;
        int result = value + 10;
        System.out.println(result);

//        변수 연산
//        예제2) 변수 value에 값을 10 더하는 연산을 한 후 화면에 출력
    }

    public void exam02() {
//        예제 3) x=3, y=5 / x와 y값을 바꾸어서 출력하세요
//        출력 시 아래와 같이 출력
//        결과 : x = 5, y = 3
//        swap 코딩 : 임시 변수 필요
        int x = 5;
        int y = 3;

        int temp = x; // x의 값을 임시 변수에 넣어둠
        x = y;
        y = temp;
        System.out.println("x = " + x + ", " + "y = " + y);
    }
    /*
    * 변수의 허용범위 예제
    */
    public void exam04() {
        int v1 = 15;
        if(v1> 10) {
            int v2;
            v2 = v1 - 10;
        }
//        int v3 = v1 + v2 +5; // v2면수 사용 불가
    }
}
