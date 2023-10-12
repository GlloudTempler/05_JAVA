package CodingTest;
import java.util.*;
/**
 * packageName : CodingTest
 * fileName : Solution03
 * author : GGG
 * date : 2023-10-10
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-10         GGG          최초 생성
 */
public class Solution03 {
    public void 정수를나선형으로배치하기() {

    }

    public void 특별한이차원배열2(int[][] arr) {
        int answer = 0;
        int result = 0;
        int aresult = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == arr[j][i]) {
                    result += 1;
                }
                aresult += 1;
            }
        }
        if(result == aresult) {
            answer = 1;
        }

        System.out.println(answer);
    }

    public void 정사각형으로만들기(int[][] arr) {
        int[][] answer = {};
        if(arr.length > arr[0].length) {
            answer = new int[arr.length][arr.length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }else if(arr.length < arr[0].length){
            answer = new int[arr[0].length][arr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }else{
            answer = new int[arr.length][arr.length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }

        System.out.println(Arrays.toString(answer));
    }

    public void 이차원배열대각선순회하기(int[][] board, int k) {
        int answer = 0;
        int i = 0;
        while (i <= k) {
            for (int j = 0; j < board[i].length; j++) {
                if(i + j <= k) {
                    answer += board[i][j];
                }
            }
            i++;
        }
        System.out.println(answer);
    }

    public void 옹알이1(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            if(babbling[i].equals("aya") || babbling[i].equals("ye") || babbling[i].equals("woo") || babbling[i].equals("ma")) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
