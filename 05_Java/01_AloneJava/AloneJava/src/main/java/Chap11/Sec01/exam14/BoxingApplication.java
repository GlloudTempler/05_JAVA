package Chap11.Sec01.exam14;

/**
 * packageName : Chap11.Sec01.exam14
 * fileName : BoxingApplication
 * author : GGG
 * date : 2023-09-26
 * description : Wrapper(포장, 싸는것)클래스, Boxing/UnBoxing(박스포장, 박스뜯기)
 * 요약 :
 *      기본자료형 : byte, short, int, long, float, double, char, boolean
 *      Wrapper 클래스 : Byte, Short, Integer, Long, Float, Double, Character, Boolean
 *      과거 코딩 :
 *      int -> Integer 변환 : API 함수를 사용해서 변환했음(Boxing)
 *      Integer -> int 변환 : (UnBoxing)
 *      현대 코딩 :
 *      자동 변환 (함수 사용없이)
 *
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class BoxingApplication {
    public static void main(String[] args) {
//        TODO : 기본자료형 -> Wrapper클래스 변환
//               과거 방식 : Boxing
        Integer obj1 = new Integer(100);
//        현대방식
        Integer obj2 = 100;

//        TODO : UnBoxing
//               과거방식
        int value1 = obj1.intValue(); // 원복 (함수호출)
//        현대방식
        int value2 = obj2;//자동 변환
        System.out.println(value1);
        System.out.println(value2);
    }
}
