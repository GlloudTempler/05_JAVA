package CodingTest;

//import java.util.ArrayList;
//import java.util.List;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.sql.Struct;
import java.util.*;
import java.util.stream.Stream;

/**
 * packageName : CodingTest
 * fileName : Solution02
 * author : GGG
 * date : 2023-09-26
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class Solution02 {
    public void 배열만들기5(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        String str1 = "";
        List<String> result = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++) {

            str1 = intStrs[i].substring(s,s+l);
            System.out.println(str1);
            if(Integer.parseInt(str1.toString()) > k) {
                result.add(str1);
            }
        }
        answer = new int[result.size()];
        for(int j = 0; j < result.size(); j++) {
            answer[j] = Integer.parseInt(result.get(j));
        }
        System.out.println(result);
    }

    public void 부분문자열이어붙여문자열만들기(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0; i < parts.length; i++){
            answer += my_strings[i].substring(parts[i][0], parts[i][1]+1);
        }
        System.out.println(answer);

    }
    public void 문자열뒤의n글자(String my_string, int n) {
        String answer = "";
        answer = my_string.substring((my_string.length()-n));
        System.out.println(answer);
    }
    public void 접미사배열(String my_string) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        Collections.sort(list);
        answer = new String[list.size()];
        for(int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        System.out.println(answer);
    }
    public void 접미사인지확인하기(String my_string, String is_suffix) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        for(int j = 0; j < list.size(); j++) {
            if(list.get(j).equals(is_suffix)){
                answer = 1;
            }
        }
    }
    public void 문자열의앞의n글자(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(0,n);
        System.out.println(answer);
    }
    public void 접두사인지확인하기(String my_string, String is_prefix) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(0,i));
        }
        for(int j = 0; j < list.size(); j++) {
            if(list.get(j).equals(is_prefix)){
                answer = 1;
            }
        }
        System.out.println(answer);
    }
    public void 문자열뒤집기(String my_string, int s, int e) {
        String answer = "";
        String str1 = my_string.substring(s,(e+1));
        StringBuffer str2 = new StringBuffer(str1);
        String rev = str2.reverse().toString();
        answer = my_string.replace(str1, rev);
        System.out.println(answer);
    }
    public void 세로읽기(String my_string, int m, int c) {
        String answer = "";
        for(int i = c-1; i < my_string.length(); i = i+m ){
            answer += String.valueOf(my_string.charAt(i));
        }
        System.out.println(answer);
    }
    public void qrcode(int q, int r, String code) {
        String answer = "";
        for(int i = 0; i < code.length(); i++) {
            if(i%q == r) {
                answer += String.valueOf(code.charAt(i));
            }
        }
        System.out.println(code);
    }
    public void 문자개수세기(String my_string) {
        int[] answer = {};
        answer = new int[52];
        char[] str = new char[52];
        int n = 65;
        for(int j = 0; j < 26; j++){
            str[j] = (char)(n);
            n++;
        }
        n = 97;
        for(int b = 26; b < 52; b++) {
            str[b] = (char)(n);
            n++;
        }
        for(int i = 0; i < 52; i++) {
            answer[i] = 0;
        }
        for(int a = 0; a < my_string.length(); a++) {
            for(int q = 0; q < 52; q++){
                if(my_string.charAt(a) == str[q]){
                    answer[q] += 1;
                }
            }

        }
        System.out.println(Arrays.toString(answer));
    }
    public void 배열만들기1(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        // k의 배수만 넣기 : add()
        for (int i = 1; i <= n; i++) {
            if(i % k == 0) {
                answer.add(i);
            }
        }
        System.out.println(answer);
    }
    public void 글자지우기(String my_string, int[] indices) {
        String answer = "";
        String change = my_string;

        System.out.println(change);
        for(int i = 0; i < indices.length; i++) {
            change = change.substring(0,(indices[i])) + " " + change.substring(indices[i] + 1);
            System.out.println(change);
        }

        answer = change.replace(" ", "");

        System.out.println(answer);
    }
    public void 카운트다운(int start, int end_num) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = start; i >= end_num ; i--) {
            result.add(i);
        }
        answer = new int[result.size()];
        for(int l = 0; l < result.size(); l++) {
            answer[l] = result.get(l);
        }
        System.out.println(answer);
    }
    public void 가까운1찾기(int[] arr, int idx) {
        int answer = 0;
        ArrayList<Integer> result = new ArrayList<>();
        Loop1 :
        for (int i = idx; i < arr.length; i++) {
            result.add(arr[i]);
            for(int k = 0; k < result.size(); k++) {
                if(result.get(k) == 1) {
                    answer = i;
                    break Loop1;
                }else{
                    answer = -1;
                }
            }
        }
        System.out.println(answer);
    }
    public void 리스트자르기(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        if(n == 1) {
            for (int i = 0; i <= slicer[1]; i++) {
                result.add(num_list[i]);
            }
        }else if(n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                result.add(num_list[i]);
            }
        }else if(n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                result.add(num_list[i]);
            }
        }else if(n == 4) {
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                result.add(num_list[i]);
            }
        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public void 첫번째로나오는음수(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) {
                answer = i;
                break;
            }else {
                answer = -1;
            }
        }
        System.out.println(answer);
    }
    public void 배열만들기3(int[] arr, int[][] intervals) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                result.add(arr[j]);
            }
        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public void a2의영역(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> find = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                find.add(i);
            }
        }

        if(!find.isEmpty()) {
            answer = new int[(find.get(find.size()-1) - find.get(0) + 1)];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[find.get(0) + i];
            }
        }else{
            answer = new int[1];
            answer[0] = -1;
        }

        System.out.println(Arrays.toString(answer));
    }
    public void 배열조각하기(int[] arr, int[] query) {
        int[] answer = {};
        ArrayList<Integer> str = new ArrayList<>();
        for(int n = 0; n < arr.length; n++) {
            str.add(arr[n]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int j = 0; j < query.length; j++) {
            if(result.isEmpty()){
                if(j % 2 == 0) {
                    for (int i = 0; i <= query[j]; i++) {
                        result.add(str.get(i));
                    }
                }else{
                    for(int i = query[j]; i < str.size(); i++){
                        result.add(str.get(i));
                    }
                }
            }else {
                if(j % 2 == 0) {
                    for (int i = 0; i <= query[j]; i++) {
                        result.add(result.get(i));
                    }
                    System.out.println(result);
                }else{
                    for(int i = query[j]; i < result.size(); i++){
                        result.add(result.get(i));
                    }
                }
            }

        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public void n번째원소부터(int[] num_list, int n) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = n-1; i < num_list.length ; i++) {
            result.add(num_list[i]);
        }

        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(result);
    }

    public void 순서바꾸기(int[] num_list, int n) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = n; i < num_list.length; i++) {
            result.add(num_list[i]);
        }
        for(int i = 0; i < n; i++) {
            result.add(num_list[i]);
        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public void 왼쪽오른쪽(String[] str_list) {
        String[] answer = {};
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                for(int k = 0; k < i; k++){
                    result.add(str_list[k]);
                }
                break;
            }else if(str_list[i].equals("r")) {
                for(int k = i+1; k < str_list.length; k++){
                    result.add(str_list[k]);
                }
                break;
            }
        }

        if(!result.isEmpty()){
            answer = new String[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
        }
        System.out.println(Arrays.toString(answer));

    }

    public void n번째원소까지(int[] num_list, int n) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(num_list[i]);
        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public void n개간격의원소들(int[] num_list, int n) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < num_list.length; i = i + n) {
            result.add(num_list[i]);
        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public void 홀수vs짝수(int[] num_list) {
        int answer = 0;
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < num_list.length; i++) {
            if((i+1) % 2 == 0) {
                result1 += num_list[i];
            }else {
                result2 += num_list[i];
            }
        }
        if(result1 == result2) {
            answer += result1;
        }else {
            answer = Math.max(result1, result2);
        }
        System.out.println(answer);
    }
    public void a5명씩(String[] names) {
        String[] answer = {};
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            if(i % 5 == 0) {
                result.add(names[i]);
            }
        }
        answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public void 할일목록(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if(finished[i] == false) {
                result.add(todo_list[i]);
            }
        }
        answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public void n보다커질때까지더하기(int[] numbers, int n) {
        int answer = 0;
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(result <= n) {
                result += numbers[i];
            }else {
                break;
            }
        }
        answer = result;
        System.out.println(answer);
    }
    public void 수열과구간쿼리1(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int i = 0; i < queries.length; i++) {
            for(int l = queries[i][0]; l <= queries[i][1]; l++){
                arr[l] = arr[l] + 1;
            }
        }
        answer = new int[arr.length];
        for (int i = 0; i <= arr.length; i++) {
            answer[i] = arr[i];
        }
        System.out.println(Arrays.toString(answer));
    }

    public void 조건에맞게수열변환하기1(int[] arr) {
        int[] answer = {};
        answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50) {
                if(arr[i] % 2 ==0) {
                    answer[i] = arr[i] / 2;
                }else {
                    answer[i] = arr[i];
                }
            }else {
                if(arr[i] % 2 == 0) {
                    answer[i] = arr[i];
                }else{
                    answer[i] = arr[i]*2;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
    public void 조건에맞게수열변환하기2(int[] arr) {
        int answer = 0;
        int result = 0;
        int[] arr2 = new int[arr.length];
        boolean tf = true;
        while (tf){
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                }else if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = arr[i] * 2 + 1;
                }else {
                    arr[i] = arr[i];
                }
            }

            if(Arrays.toString(arr2).equals(Arrays.toString(arr))){
                tf = false;
            }else {
                for (int i = 0; i < arr.length; i++) {
                    arr2[i] = arr[i];
                }
                result++;
            }
        }
        answer = result;
        System.out.println(answer);
    }
    public void a1로만들기(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) {
                if(num_list[i] % 2 == 0) {
                    num_list[i] = num_list[i] / 2;
                    answer++;
                }else {
                    num_list[i] = (num_list[i] - 1) / 2;
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
    public void 길이에따른연산(int[] num_list) {
        int answer = 0;

        if(num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        }else {
            answer = 1;
            for (int i = 0; i < num_list.length; i++) {
                answer = answer * num_list[i];
            }
        }
        System.out.println(answer);
    }
    public void 원하는문자열찾기(String myString, String pat) {
        int answer = 0;
        if(myString.toUpperCase().contains(pat.toUpperCase())) {
            answer = 1;
        }else {
            answer = 0;
        }
        System.out.println(answer);
    }
    public void 대문자로바꾸기(String myString) {
        String answer = myString.toUpperCase();
    }
    public void 소문자로바꾸기(String myString) {
        String answer = myString.toLowerCase();
    }
    public void 배열에서문자열대소문자변환하기(String[] strArr) {
        String[] answer = {};
        for (int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            }else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        answer = strArr;
        System.out.println(Arrays.toString(answer));
    }
    public void A강조하기(String myString) {
        String answer = "";
        String result = myString.toLowerCase();
        answer = result.replace("a", "A");
        System.out.println(answer);
    }
    public void 특정한문자를대문자로바꾸기(String my_string, String alp) {
        String answer = "";
        if(my_string.contains(alp)) {
            answer = my_string.replace(alp, alp.toUpperCase());
        }else {
            answer = my_string;
        }
        System.out.println(answer);
    }
    public void 특정문자열로끝나는가장긴부분문자열찾기(String myString, String pat) {
        String answer = "";
        int k;
        k = myString.lastIndexOf(pat) + pat.length();
        answer = myString.substring(0,k);
        System.out.println(answer);
    }
    public void 문자열이몇번등장하는지세기(String myString, String pat) {
        int answer = 0;
        ArrayList<String> count = new ArrayList<>();
        for (int i = 0; i <= (myString.length() - pat.length()); i++) {
            count.add(myString.substring(i, i+pat.length()));
        }
        for (int i = 0; i < count.size(); i++) {
            if(count.get(i).equals(pat)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
    public void ad제거하기(String[] strArr) {
        String[] answer = {};
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                str.add(strArr[i]);
            }
        }
        answer = new String[str.size()];
        for (int i = 0; i < str.size(); i++) {
            answer[i] = str.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public void 공백으로구분하기1(String my_string) {
        String[] answer = {};
        answer = my_string.split(" ");
        System.out.println(Arrays.toString(answer));
    }
    public void 공백으로구분하기2(String my_string) {
        String[] answer = {};
        String result = my_string.trim();
        String result2 = result.replaceAll( "\\s+", " ");
        answer = result2.split(" ");
        System.out.println(Arrays.toString(answer));
    }

    public void x사이의개수(String myString) {
        int[] answer = {};
        String[] str = myString.split("x");
        System.out.println(Arrays.toString(str));
        if(myString.lastIndexOf("x") == myString.length()-1) {
            answer = new int[str.length+1];
            for (int i = 0; i < str.length; i++) {
                answer[i] = str[i].length();
            }
            answer[str.length] = 0;
        }else {
            answer = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                answer[i] = str[i].length();
            }
        }

        System.out.println(Arrays.toString(answer));
    }
    public void 문자열잘라서정렬하기(String myString) {
        String[] answer = {};
        String[] result = myString.split("x");
        Arrays.sort(result);
        List<String> result2 = new ArrayList<>(Arrays.asList(result));
        result2.removeAll(Collections.singleton(""));
        answer = result2.toArray(new String[0]);
        System.out.println(Arrays.toString(answer));
    }
    public void 간단한식계산하기(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        if(str[1].equals("+")) {
            answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
        }else if(str[1].equals("*")){
            answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
        }else if(str[1].equals("-")) {
            answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
        }
        System.out.println(answer);
    }
    public void 문자열바꿔서찾기(String myString, String pat) {
        int answer = 0;
        String str = "";
        for (int i = 0; i < pat.length(); i++) {
            if(pat.charAt(i) == 'A'){
                str += "B";
            }else if(pat.charAt(i) == 'B') {
                str += "A";
            }
        }
        if(myString.contains(str)) {
            answer = 1;
        }else {
            answer = 0;
        }

        System.out.println(answer);
    }
    public void mystring(String rny_string) {
        String answer = "";
        for (int i = 0; i < rny_string.length(); i++) {
            if(rny_string.charAt(i) == 'm') {
                answer += "rn";
            }else {
                answer += rny_string.charAt(i);
            }
        }
        System.out.println(answer);
    }
    public void 세개의구분자(String myStr) {
        String[] answer = {};
//        String result = "";
//        for (int i = 0; i < myStr.length(); i++) {
//            if (myStr.charAt(i) == 'a') {
//                result += " ";
//            } else if (myStr.charAt(i) == 'b') {
//                result += " ";
//            }else if (myStr.charAt(i) == 'c') {
//                result += " ";
//            }else {
//                result += myStr.charAt(i);
//            }
//        }
//        result = result.trim();
//        result = result.replaceAll("\\s+", " ");
//        if(result.equals("")){
//            answer = new String[1];
//            answer[0] = "EMPTY";
//        }else {
//            answer = result.split(" ");
//        }
        String result = myStr.replaceAll("[abc]", " ").trim();

        if (result.isEmpty()) {
            answer = new String[]{"EMPTY"};
        } else {
            answer = result.split("\\s+");
        }

        System.out.println(Arrays.toString(answer));
    }
    public void 배열의원소만큼추가하기(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> art = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                art.add(arr[i]);
            }
        }
        answer = new int[art.size()];
        for (int i = 0; i < art.size(); i++) {
            answer[i] = art.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public void 빈배열에추가삭제하기(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                for (int j = 0; j < arr[i]*2; j++) {
                    result.add(arr[i]);
                }
            }else if(!result.isEmpty() && arr[i] > 0){
                int elementsToRemove = Math.min(arr[i], result.size());
                for (int j = 0; j < elementsToRemove ; j++) {
                    result.remove((result.size()-1));
                }
            }
        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public void 배열만들기6(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            if(stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            }else if(stk.get(stk.size()-1) == arr[i]){
                stk.remove(stk.size()-1);
                i++;
            }else {
                stk.add(arr[i]);
                i++;
            }
        }
        if(stk.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[stk.size()];
            for (int j = 0; j < stk.size(); j++) {
                answer[j] = stk.get(j);
            }
        }
        System.out.println(Arrays.toString(answer));
    }
    public void 무작위로K개의수뽑기(int[] arr, int k) {
        int[] answer = {};
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else if(!stk.contains(arr[i])){
                stk.add(arr[i]);
                i++;
            }else {
                i++;
            }
        }

        if(stk.size() > k) {
            for (int j = 0; j < stk.size() - k; j++) {
                stk.remove(stk.size()-1);
            }
            answer = new int[stk.size()];
            for (int j = 0; j < stk.size(); j++) {
                answer[j] = stk.get(j);
            }
        }else if(stk.size() < k){
            answer = new int[k];
            for (int j = 0; j < stk.size(); j++) {
                answer[j] = stk.get(j);
            }
            for (int j = stk.size(); j < k; j++) {
                answer[j] = -1;
            }
        }
        System.out.println(Arrays.toString(answer));
    }

    public void 배열의길이를2의거듭제곱으로만들기(int[] arr) {
        int[] answer = {};

        if(arr.length != 1) {
            int k = 1;
            while(k < arr.length) {
                k = k*2;
            }
            answer = new int[k];
            ArrayList<Integer> arrl = new ArrayList<>();
            if(k > arr.length) {
                for (int i = 0; i < arr.length; i++) {
                    arrl.add(arr[i]);
                }
                for (int i = arr.length; i <k ; i++) {
                    arrl.add(0);
                }
                for (int i = 0; i < arrl.size(); i++) {
                    answer[i] = arrl.get(i);
                }
            }else{
                answer = arr;
            }

        }else {
            answer = arr;
        }

        System.out.println(Arrays.toString(answer));
    }

    public void 배열비교하기(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        if(arr1.length != arr2.length) {
            if(arr1.length > arr2.length) {
                answer = 1;
            }else {
                answer = -1;
            }
        }else {
            if(sum1 == sum2) {
                answer = 0;
            }else if (sum1 > sum2){
                answer = 1;
            }else {
                answer = -1;
            }
        }
        System.out.println(answer);
    }
    public void 문자열묶기(String[] strArr) {
        int answer = 0;
        // 길이별 그룹을 저장하는 Map
        Map<Integer, Integer> lengthToCount = new HashMap<>();

        // 문자열 배열을 순회하며 길이를 세어 Map에 저장
        for (String str : strArr) {
            int length = str.length();
            lengthToCount.put(length, lengthToCount.getOrDefault(length, 0) + 1);
        }

        int maxCount = 0; // 가장 많은 그룹의 개수
        // Map을 순회하면서 가장 많은 그룹의 개수를 찾음
        for (int count : lengthToCount.values()) {
            maxCount = Math.max(maxCount, count);
        }

        answer = maxCount; // 가장 많은 그룹의 크기 반환
        System.out.println(answer);
    }

    public void 배열의길이에따라다른연산하기(int[] arr, int n) {
        int[] answer = {};
        if(arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if(i % 2 != 0) {
                    arr[i] = arr[i] + n;
                }
            }
        }else{
            for (int i = 0; i < arr.length; i++) {
                if(i % 2 == 0){
                    arr[i] = arr[i] + n;
                }
            }
        }
        answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        System.out.println(Arrays.toString(answer));
    }

    public void 뒤에서5등까지(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);

        // 결과를 저장할 배열을 생성합니다.
        int[] result = new int[5];

        // 정렬된 배열에서 처음 5개의 원소를 추출하여 결과 배열에 복사합니다.
        for (int i = 0; i < 5; i++) {
            result[i] = num_list[i];
        }
        answer = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            answer[i] = result[i];
        }
        System.out.println(Arrays.toString(answer));
    }

    public void 뒤에서5등위로(int[] num_list) {
        int[] answer = {};
        // 배열을 오름차순으로 정렬합니다.
        Arrays.sort(num_list);

        int[] result = new int[num_list.length - 5];

        // 가장 작은 5개의 수를 제외한 나머지 수를 결과 배열에 복사합니다.
        for (int i = 5; i < num_list.length; i++) {
            result[i - 5] = num_list[i];
        }
        answer = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            answer[i] = result[i];
        }
        System.out.println(Arrays.toString(answer));
    }
    public void 전국대회선발고사(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> selectRank = new ArrayList<>();
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                selectRank.add(rank[i]);
            }
        }
        Collections.sort(selectRank);
        System.out.println(selectRank); // 7254 // 1234

        ArrayList<Integer> selectedRank = new ArrayList<>();
        for (int i = 0; i < selectRank.size(); i++) {
            for (int j = 0; j < rank.length; j++) {
                if(selectRank.get(i) == rank[j]){
                    selectedRank.add(j);
                }
            }
        }

        answer = 10000 * selectedRank.get(0) + 100*selectedRank.get(1) + selectedRank.get(2);
        System.out.println(answer);
    }
    public void 정수부분(double flo) {
        int answer = 0;
        answer = (int) Math.floor(flo);
        System.out.println(answer);
    }

    public void 문자열정수의합(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }
        System.out.println(answer);
    }
    public void 문자열을정수로변환하기(String n_str) {
        int answer = 0;
        answer = Integer.parseInt(n_str);
        System.out.println(answer);
    }
    public void a0빼기(String n_str) {
        String answer = "";
        answer = String.valueOf(Integer.parseInt(n_str));
        System.out.println(answer);
    }
    public void 두수의합(String a, String b) {
        String answer = "";
        BigInteger bignum1 = new BigInteger(a);
        BigInteger bignum2 = new BigInteger(b);
        answer = String.valueOf(bignum1.add(bignum2));
        System.out.println(answer);
    }
    public void 문자열로변환(int n) {
        String answer = "";
        answer = String.valueOf(n);
        System.out.println(answer);
    }
    public void 배열의원소삭제하기(int[] arr, int[] delete_list) {
        int[] answer = {};
        // 삭제할 원소를 Set 또는 HashSet으로 저장하면 효율적일 수 있음
        List<Integer> deleteSet = new ArrayList<>();
        for (int item : delete_list) {
            deleteSet.add(item);
        }

        List<Integer> result = new ArrayList<>();
        for (int item : arr) {
            // 삭제할 원소가 아닌 경우 결과 리스트에 추가
            if (!deleteSet.contains(item)) {
                result.add(item);
            }
        }

        // 결과 리스트를 배열로 변환
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        answer = new int[resultArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            answer[i] = resultArray[i];
        }

        System.out.println(Arrays.toString(answer));
    }

    public void 부분문자열인지확인하기(String my_string, String target) {
        int answer = 0;
        if(my_string.contains(target)){
            answer = 1;
        }
        System.out.println(answer);
    }
    public void 부분문자열(String str1, String str2) {
        int answer = 0;
        if (str2.contains(str1)){
            answer = 1;
        }
        System.out.println(answer);
    }
    public void 꼬리문자열(String[] str_list, String ex) {
        String answer = "";
        for (int i = 0; i < str_list.length; i++) {
            if(!str_list[i].contains(ex)) {
                answer += str_list[i];
            }
        }
        System.out.println(answer);
    }
    public void 정수찾기(int[] num_list, int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] == n) {
                answer = 1;
                break;
            }
        }
        System.out.println(answer);
    }
    public void 주사위게임1(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) {
            answer = a*a + b*b;
        }else if (a % 2 == 0 && b % 2 == 0) {
            if(a >= b) {
                answer = a-b;
            }else {
                answer = b -a;
            }
        }else {
            answer = 2*(a+b);
        }
        System.out.println(answer);
    }

    public void 날짜비교하기(int[] date1, int[] date2) {
        int answer = 0;
        if(date1[0] == date2[0] && date1[1] == date2[1] && date1[2] < date2[2]) {
            answer = 1;
        } else if (date1[0] == date2[0] && date1[1] < date2[1]) {
            answer = 1;
        }else if (date1[0] < date2[0]) {
            answer = 1;
        }
        System.out.println(answer);
    }
    public void 커피심부름(String[] order) {
        int answer = 0;
        ArrayList<String> orderList = new ArrayList<>();
        for (int i = 0; i < order.length; i++) {
            if (order[i].equals("anything")) {
                orderList.add("iceamericano");
            }else {
                orderList.add(order[i]);
            }
        }
        for (int i = 0; i < orderList.size(); i++) {
            if(orderList.get(i).contains("americano")) {
                answer += 4500;
            }else {
                answer += 5000;
            }
        }
        System.out.println(answer);
    }
    public void 그림확대(String[] picture, int k) {
        String[] answer = {};
        ArrayList<String> pictureList = new ArrayList<>();

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length(); j++) {
                StringBuilder str = new StringBuilder();
                for (int l = 0; l < k; l++) {
                    str.append(picture[i].charAt(l));
                }
                for (int l = 0; l < k; l++) {
                    pictureList.add(String.valueOf(str));
                }
            }
        }

        answer = new String[pictureList.size()];
        for (int i = 0; i < pictureList.size(); i++) {
            answer[i] = pictureList.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }

    public void 조건에맞게수열변환하기(int[] arr, int k) {
        int[] answer = new int[arr.length];
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        }else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i]*k;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
    public void l로만들기(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) < 'l') {
                answer += "l";
            }else {
                answer += myString.charAt(i);
            }
        }
        System.out.println(answer);
    }

    public void 특별한이차원배열1(int n) {
        int[][] answer = {};

    }


}
