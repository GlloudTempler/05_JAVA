package chap05;

/**
 * packageName : chap05
 * fileName : Sec0501
 * author : GGG
 * date : 2023-09-19
 * description : 참조 자료형과 참조 변수
 * 요약 :
 *      기본 자료형 : int(4), long(8), float(4), double, boolean 자료형
 *      => 스택 방에 갑싱 그대로 저장
 *      참조 자료형 : string(문자열), 배열, 객체
 *      => 스택 방에 주소 값만 저장, 힙 방에 값 저장
 *      JVM(java virtual machine) : 자바 가상 머신 : jdk
 *      역할 : linux/windows(운영체제) 모든 곳에서 실행할 수 있게 만드는 프로그램
 *      비교연산자(==) : 기본자료형에서는 값을 비교하고
 *                     참조자료형에서는 주소(방번호)를 비교하게됨
 *                     null포인트 에러 : 프로그램을 강제 비정상 중단함
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-19         GGG          최초 생성
 */
public class Sec0501 {
    /*
    * 비교연산자(==)와 equals 함수예제
    * */
    public void stringEqualExam() {
        String strVar1 = new String("신민철");
        String strVar2 = new String("신민철");
//        주소 비교 : 개발자 입장에서 의미없음
        if(strVar1 == strVar2) {
            System.out.println("두개의 주소가 같음");
        }else {
            System.out.println("두개의 주소가 다름");
        }

//        equals() 함수 사용 : 값을 비교하는 함수
        if(strVar1.equals(strVar2)==true){
            System.out.println("두개의 값이 같음");
        }
//         null 포인터 예외(에러)
//         배열
        int[] intArray = null; // 방이 없음(공간 없음)
        intArray[0] = 10; // 0번지 방에 10번을 넣으니 null에러가 발생

//        객체에서 null에러
        String str = null; // String str = "";
//        문자열의 길이를 가쳐오는 함수 : 문자열.length()
        System.out.println("총 문자수 : " + str.length()); // null 에러 발생

    }

}
