package hashset;
import java.util.*;
public class HashSetController {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[]arr= {"Java","Jsp","Spring","Js","html"};
		HashSet<String>set=new HashSet<String>();
		for(String i:arr){
			set.add(i); //"Java","Jsp","Spring","Js" 중복값을 제외하고 담고있다.
		}
		System.out.println("set:"+set.toString());
		System.out.println("삭제를 원하는 값을 입력하세요.");
		String del=scan.next();
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


