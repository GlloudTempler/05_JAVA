package CodingTest;

import com.sun.jdi.LongValue;
import com.sun.jdi.Value;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * packageName : CodingTest
 * fileName : Solution01
 * author : GGG
 * date : 2023-09-18
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-18         GGG          최초 생성
 */
public class Solution01 {
//    문자열 출력하기
    public void 문자열출력하기() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a);
    }
    public void a와b출력하기() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public void 문자열반복해서출력하기() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int i;
        String result = "";
        for(i = 0; i < n; i++) {
            result += str;
        }
        System.out.println(result);
    }
    public void 대소문자바꿔서출력하기() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        int i;
        for(i = 0; i < str.length(); i++) {
            if((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90) {
                result += str.valueOf(str.charAt(i)).toLowerCase();
            }else if((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122) {
                result += str.valueOf(str.charAt(i)).toUpperCase();
            }else {
                result += str.valueOf(str.charAt(i));
            }
        }
        System.out.println(result);
    }
    public void 특수문자출력하기() {
        System.out.println("!@#$%^&*(\\'\"<>?:;");
    }

    public void 덧셈식출력하기() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
    public void 문자열붙여서출력하기() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a+b);
    }
    public void 문자열돌리기() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i;
        String result = "";
        for(i = 0; i < str.length(); i++) {
            result += str.charAt(i) + "\n";
        }
        System.out.println(result);
    }
    public void 홀짝구분하기() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.println(n + " is even");
        }else {
            System.out.println(n + " is odd");
        }
    }
    public void 문자열겹쳐쓰기(String my_string, String overwrite_string, int s) {
        String answer = "";
        if(s <= my_string.length()) {
            if(overwrite_string.length()+s > my_string.length()) {
                answer = my_string.substring(0,s) + overwrite_string;
            }else if(overwrite_string.length()+s <= my_string.length()){
                answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s+overwrite_string.length());
            }
        }
        System.out.println(answer);
//        return answer;
    }
    public void 문자열섞기(String str1, String str2){
        String result = "";
        for(int i = 0; i < str1.length(); i++) {
            result += (str1.valueOf(str1.charAt(i)) + str2.valueOf(str2.charAt(i)));
        }
        System.out.println(result);
    }
    public void 문자리스트를문자열로변환하기(String[] arr) {
        String answer = "";
        for(int i =0; i < arr.length; i++) {
            answer += arr[i];
        }
        System.out.println(answer);
    }
    public void 문자열곱하기(String my_string, int k) {
        String answer = "";
        for(int i = 1; i <= k; i++) {
            answer += my_string;
        }
        System.out.println(answer);
    }
    public void 더크게합치기(int a, int b) {
        int answer = 0;
        String result1 = "" + a + b;
        String result2 = "" + b + a;
        if(Integer.parseInt(result1) > Integer.parseInt(result2)) {
            answer = Integer.parseInt(result1);
        }else {
            answer = Integer.parseInt(result2);
        }
        System.out.println(answer);
    }

    public void 두수의연산값비교하기(int a, int b) {
        int answer = 0;
        String result1 = "" + a + b;
        int result2 = 2 * a * b;
        if(Integer.parseInt(result1) == result2) {
            answer = Integer.parseInt(result1);
        }else if (Integer.parseInt(result1) > result2) {
            answer = Integer.parseInt(result1);
        } else {
            answer = result2;
        }
    }
    public void n의배수(int num, int n) {
        int answer = 0;
        if(num % n == 0) {
            answer = 1;
        }else if(num % n != 0) {
            answer = 0;
        }
        System.out.println(answer);
    }
    public void 공배수(int number, int n, int m) {
        int answer = 0;
        if(number % n == 0 && number % m ==0) {
            answer = 1;
        }else {
            answer = 0;
        }
        System.out.println(answer);
    }
    public void 홀짝에따라다른값반환하기(int n) {
        int answer = 0;
        if(n % 2 != 0){
            for(int i = 1; i <= n; i++) {
                if(i % 2 != 0) {
                    answer += i;
                }
            }
        }else if(n % 2 == 0) {
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0) {
                    answer += (i*i);
                }
            }
        }
        System.out.println(answer);
    }
    public void 조건문자열(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(eq.equals("!")) {
            if(ineq.equals(">")){
                if(n > m) {
                    answer = 1;
                }else if(n < m) {
                    answer = 0;
                }
            }else if(ineq.equals("<")){
                if(n > m) {
                    answer = 0;
                }else if(n < m) {
                    answer = 1;
                }
            }
        }else if(eq.equals("=")) {
            if(ineq.equals(">")) {
                if(n >= m) {
                    answer = 1;
                }else {
                    answer = 0;
                }
            }else if(ineq.equals("<")){
                if(n <= m) {
                    answer = 1;
                }else {
                    answer = 0;
                }
            }

        }
        System.out.println(answer);

    }
    public void flag에따라다른값반환하기(int a, int b, boolean flag) {
        int answer = 0;
        if(flag == true) {
            answer = a + b;
        }else if(flag == false) {
            answer = a - b;
        }
        System.out.println(answer);
    }

    public void 코드처리하기(String code) {
        String answer = "";
        int idx = 0;
        int mode = 0;
        String ret = "";
        while(idx != code.length()) {
            if(mode == 0) {
                if(code.valueOf(code.charAt(idx)).equals("1")) {
                    mode = 1;
                }else {
                    if(idx % 2 == 0) {
                        ret += code.valueOf(code.charAt(idx));
                    }
                }
            }else if (mode == 1) {
                if(code.valueOf(code.charAt(idx)).equals("1")) {
                    mode = 0;
                }else{
                    if(idx % 2 != 0) {
                        ret += code.valueOf(code.charAt(idx));
                    }
                }
            }

            idx++;
        }
        if(ret.equals("")) {
            answer = "EMPTY";
        }else {
            answer = ret;
        }
        System.out.println(answer);

    }
    public void 등차수열의특정항항만더하기(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i < included.length; i++) {
            if(included[i] == true) {
                answer += a + d*i;
            }
        }
        System.out.println(answer);
    }

    public void 주사위게임2(int a, int b, int c) {
        int answer = 0;
        if(a != b && a != c && b != c) {
            answer = a + b + c;
        }else if((a == b && a != c) || (a == c && a != b) || (b == c && a != b)) {
            answer = (a + b + c) * (a*a + b*b + c*c);
        }else if(a == b && b == c) {
            answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        System.out.println(answer);
    }
    public void 원소들의곱과합(int[] num_list) {
        int answer = 0;
        int max = 0;
        int sum = 0;
        int multiple = 1;
        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
        }
        max = sum*sum;
        for(int l = 0; l < num_list.length; l++) {
            multiple *= num_list[l];
        }
        if(max > multiple) {
            answer = 1;
        }else if (max < multiple) {
            answer = 0;
        }
        System.out.println(answer);
    }
    public void 이어붙인수(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 != 0) {
                odd += num_list[i];
            }else{
                even += num_list[i];
            }
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        System.out.println(answer);

    }

    public void 마지막두원소(int[] num_list) {
        int[] answer = {};
        int a = 0;
        int b= 0;

        if (num_list.length < 2) {
            // num_list 배열의 길이가 2 미만이면 예외 처리
            num_list =  new int[0]; // 빈 배열 반환
        }

        if(num_list[num_list.length - 2] < num_list[num_list.length - 1]) {
           a = num_list[num_list.length - 1] - num_list[num_list.length - 2];
           answer = new int[num_list.length + 1];
            for(int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[i];
            }
            answer[num_list.length] = a;

        }else if(num_list[num_list.length - 2] >= num_list[num_list.length - 1]) {
            b = num_list[num_list.length - 1]*2;
            answer = new int[num_list.length + 1];
            for(int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[i];
            }
            answer[num_list.length] = b;

        }
        System.out.println(answer[num_list.length]);
    }
    public void 수조작하기1(int n, String control) {
        int answer = 0;
        answer = n;
        for(int i = 0; i < control.length(); i++) {
            if(control.valueOf(control.charAt(i)).equals("w")) {
                answer = answer + 1;
            }else if(control.valueOf(control.charAt(i)).equals("s")) {
                answer = answer -1;
            }else if(control.valueOf(control.charAt(i)).equals("d")) {
                answer = answer + 10;
            }else if(control.valueOf(control.charAt(i)).equals("a")) {
                answer = answer - 10;
            }
        }
        System.out.println(answer);
    }
    public void 수조작하기2(int[] numLog) {
        String answer = "";

        for(int i = 0; i < (numLog.length -1); i++) {
            if((numLog[i+1] - numLog[i])  == 1) {
                answer = answer + "w";
            }else if((numLog[i+1] - numLog[i])  == -1) {
                answer = answer + "s";
            }else if((numLog[i+1] - numLog[i])  == 10) {
                answer = answer + "d";
            }else if((numLog[i+1] - numLog[i])  == -10) {
                answer = answer + "a";
            }
        }
        System.out.println(answer);
    }
    public void 수열과구간쿼리3(int[] arr, int[][] queries) {
       int[] answer = {};
       int[] arr2 = {};
       for(int i = 0; i < queries.length; i++) {
               arr2 = new int[] {arr[queries[i][0]]};
               arr[queries[i][0]] = arr[queries[i][1]];
               arr[queries[i][1]] = arr2[0];
       }
       answer = arr;
        System.out.println(answer[0] + answer[1]);
    }
    public void 수열과구간쿼리2(int[] arr, int[][] queries) {
        int[] answer = {};
        int[] arr3 = new int[queries.length];
        int n = 0;
        int k = 0;
        for (int i = 0; i < queries.length; i++) {
            int [] arr2 = new int[arr.length];
            for(int l =  queries[i][0]; l <= queries[i][1]; l++){
                if(arr[l] > queries[i][2]) {
                    arr2[n] = arr[l];
                    n++;
                }
            }
            if(n > 0) {
                int[] tArr = Arrays.copyOf(arr2, n);
                Arrays.sort(tArr);
                arr3[k] = tArr[0];
                k++;
            }else {
                arr3[k] = -1;
                k++;
            }
            n = 0;

        }
        answer = arr3;
        System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
    }
    public void 수열과구간쿼리4(int[] arr, int[][] queries) {
        int[] answer = {};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        for(int i = 0; i < queries.length; i++) {
            for(int l = queries[i][0]; l <= queries[i][1]; l++) {
                if(l % queries[i][queries[i].length-1] == 0){
                    arr[l] = (arr[l] + 1);
                }
            }
        }
        arr2 = arr;
        answer = arr2;
        System.out.println(Arrays.toString(answer));

    }
    public void 배열만들기2(int l, int r) {
        int[] answer = {};
        StringBuilder arr3 = new StringBuilder();
        for(int i = l; i <= r; i++) {
            String k = "";
            k += i;
            int p = 0;
            String[] arr = new String[k.length()];
            for(int u = 0; u < k.length(); u++) {
                arr[u] = k.valueOf(k.charAt(u));
            }
            for(int j = 0; j < k.length(); j++){
                if((Integer.parseInt(arr[j]) % 5 == 0)) {
                    p++;
                }else{
                    p = p - r;
                }
            }
            if(p > 0) {
                arr3.append(i).append(",");
            }
        }
//        int[] arr2 = new int[arr3.length()];
        if(arr3.length() == 0) {
            answer = new int[]{-1};
        }else {
            String[] tokens = arr3.toString().split(",");
            int[] arr2 = new int[tokens.length];
            int answerLength = 0;
            for (int a = 0; a < tokens.length; a++) {
                if(Integer.parseInt((tokens[a])) != 0 ) {
                    //새 배열 정의. 배열의 값이 0이면 answer에 미포함
                    arr2[a] = Integer.parseInt(tokens[a]);
                    answerLength++;
                }
            }
            int b = 0;
            answer = new int[answerLength];
            while(b < answerLength){
                for(int c = 0; c < arr2.length; c++) {
                    if(arr2[c] != 0) {
                        answer[b] = arr2[c];
                        b++;
                    }
                }
            }

        }

        System.out.println(Arrays.toString(answer));
    }
    public void 카운트업(int start_num, int end_num) {
        int[] answer = {};
        int answerLength = end_num - start_num + 1;
        answer = new int[answerLength];
        for(int i = start_num; i <= end_num; i++) {
            answer[i - start_num] = i;
        }
    }

    public void 콜라츠함수만들기(int n) {
        int[] answer = {};
        int result = n;
        StringBuilder rArr = new StringBuilder();
        rArr.append(result).append(",");
        int answerLength = 1;
        while(result != 1){
            if(result % 2 ==0) {
                result = result/2;
            }else {
                result = result * 3 + 1;
            }
            rArr.append(result).append(",");
            answerLength++;
        }
        rArr.append(result).append(",");
        if (rArr.charAt(rArr.length() - 1) == ',') {
            rArr.deleteCharAt(rArr.length() - 1);
        }
        answer = new int[answerLength];
        String[] tokens = rArr.toString().split(",");
        for(int i = 0; i < answerLength; i++) {
            answer[i] = Integer.parseInt(tokens[i]);
        }
        System.out.println(Arrays.toString(answer));

    }
    public void 배열만들기4(int[] arr) {
        int[] stk = {};
        ArrayList<Integer> stkArr = new ArrayList<Integer>();
        int i = 0;
        while(i < arr.length) {
            if(stkArr.isEmpty()) {
                stkArr.add(arr[i]);
                i++;
            }else if(stkArr.get(stkArr.size() -1) > arr[i]) {
                stkArr.remove(stkArr.size() -1);
                stkArr.trimToSize();
            }else if(stkArr.get(stkArr.size() -1) < arr[i]) {
                stkArr.add(arr[i]);
                i++;
            }else {
                i++;
            }
        }
        stk = new int[stkArr.size()];
        for(int k = 0; k < stkArr.size(); k++) {
            stk[k] = stkArr.get(k);
        }
        System.out.println(Arrays.toString(stk));
    }
    public void 간단한논리연산(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        if((x1 == true || x2 == true) && (x3 == true || x4 == true)){
           answer = true;
        }else {
            answer = false;
        }
        System.out.println(answer);
    }

    public void 주사위게임3(int a, int b, int c, int d) {
        int answer = 0;
        if(a == b && b == c && c== d) {
            answer = 1111 * a;
        }else if(a == b && b == c || a == c && a == d || b == c && b == d || a == d && d == b) {
            if(a == b && b == c){
                answer = (10 * a + d)*(10 * a + d);
            }else if(a == c && c == d) {
                answer = (10 * a + b)*(10 * a + b);
            }else if(b == c && c == d) {
                answer = (10 * b + a)*(10 * b + a);
            }else if(a == b && b == d) {
                answer = (10 * a + c)*(10 * a + c);
            }
        }else if(a == b && c ==d || a == c && b == d || a == d && b == c) {
            if(a == b) {
                answer = (a+c) * Math.abs(a-c);
            }else if(a == c) {
                answer = (a+b) * Math.abs(a-b);
            }else{
                answer = (a+b) * Math.abs(a-b);
            }
        }else if(a == b || a == c || a == d || b == c || b == d || c == d) {
            if(a == b) {
                answer = c*d;
            }else if(a == c){
                answer = b*d;
            }else if(a == d){
                answer = b*c;
            }else if(b == c){
                answer = a*d;
            }else if(b == d){
                answer = a*c;
            }else{
                answer = a * b;
            }
        }else{
            int result1 = Math.min(a,b);
            int result2 = Math.min(c,d);
            answer = Math.min(result1,result2);
        }
        System.out.println(answer);
    }
    public void 글자이어붙여문자열만들기(String my_string, int[] index_list) {
        String answer = "";
        ArrayList result = new ArrayList<>();
        for (int i = 0; i < index_list.length; i++) {
            result.add(my_string.charAt(index_list[i]));
        }
        for (int l = 0; l < result.size(); l++) {
            answer += result.get(l);
        }
        System.out.println(answer);
    }
    public void 숫자9로나눈나머지(String number){
        int answer = 0;
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        answer = result % 9;
        System.out.println(answer);
    }
    public void 문자열여러번뒤집기(String my_string, int[][] queries) {
        String answer = "";
            StringBuilder str = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            // 문자열을 뒤집음
            StringBuilder reversed = new StringBuilder(str.substring(start, end + 1)).reverse();

            // 원래 문자열에 덮어씀
            str.replace(start, end + 1, reversed.toString());
        }

        answer = str.toString();
        System.out.println(answer);
    }







}
