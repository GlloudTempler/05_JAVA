package Chap12.Sec01.Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : Chap12.Sec01.Solution
 * fileName : Solution
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
public class Solution {
    /*
    * 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를
    * 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    * */
    public List<Integer> solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
// k의 배수만 넣기 : add()
        for (int i = 1; i <= n; i++) {
            if(i % k == 0) {
//                i값 추적 : logging(디버깅의 기초)
                System.out.println(i); // i의 값 추적
                answer.add(i); // i k의 배수임
            }
        }
        return answer;
    }
}
