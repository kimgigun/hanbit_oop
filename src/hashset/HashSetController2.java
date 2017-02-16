package hashset;
import java.util.*;
public class HashSetController2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]arr= {"Java","Jsp","Spring","Js","html"};
		//1.추가.. 위에 주어진 배열 arr를 set에 추가하기		
		HashSet<String>set=new HashSet<String>();
		for(String i:arr){
			set.add(i); //"Java","Jsp","Spring","Js" 중복값을 제외하고 담고있다.
		}
		
		//2.검색(1)..첫글자가 H로 시작 되는 단어를 출력
		
		System.out.println("set:"+set.toString());
		System.out.println("삭제를 원하는 값을 입력하세요.");
		String del=s.next();
		//aaa는 없는 값입니다.
		String result="";
		int len=arr.length;
		for(int i=0;i<len;i++){
			if(del.equals(arr[i])){
				arr[i]=arr[len-1];
				arr[len-1]=null;
				result=del+"을 삭제 하였습니다";
				break;
			}
			else {result=del+"은 없는 값 입니다.";}
		}
		System.out.println(result);
		for(int i=0;i<len-1;i++){
			System.out.println(arr[i]);
		}
	}
}


