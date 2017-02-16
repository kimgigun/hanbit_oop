package arry;

import java.util.HashSet;

import java.util.*;

public class ArryController2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = { "Java", "Jsp", "Spring", "Js", "Html" };
		HashSet<String> set = new HashSet<String>();
		// 2.검색(1)..첫 글자가 H 로 시작 하는 단어를 출력
		char ch =  s.next().charAt(0);
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (ch == arr[i].charAt(0)) {
				result = arr[i];
				break;
			} else {
				result = "입력값이 올바르지 않습니다.";
			}
		}
		System.out.println(result);
		// 3.검색(some) 첫 글자가 J로 시작 하는 단어를 출력
		System.out.println();
		result="";
		char ch2=s.next().charAt(0);
		for (int i = 0; i < arr.length; i++) {
			if (ch2==arr[i].charAt(0)) {
				result+=arr[i]+"\t";
			}
		}
		if(result.equals(null)){
			result="값이 없습니다.";
		}
		System.out.println(result);
		// 4.전체출력
		result="";
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%s ", arr[i]);
		}
		System.out.println();
		// 5.수정 (JS를 Javascript)로 변경
		// 수정이 끝나면 배열 arr을 프린트 하기
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("Js")) {
				arr[i] = "Javascript";
			}
			System.out.printf("%s ", arr[i]);
		}
		System.out.println();

		// 6.삭제 (Spring을 삭제)
		// 삭제가 끝나면 배열 arr을 프린트하기.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("Spring")) {
				arr[i] = arr[arr.length - 1];
				arr[arr.length - 1] = null;
				break;
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.printf("%s ", arr[i]);
		}

	}
}
