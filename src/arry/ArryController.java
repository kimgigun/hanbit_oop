package arry;
import java.util.*;

public class ArryController {
	public static void main(String[] args) {
		ArrayServiceImpl service = new ArrayServiceImpl();
		service.add();
		String temp="";
		temp=String.format(" %s\n %s\n %s\n %s\n ",
				service.fineOne(),
				service.List(),
				service.update(),
				service.delete());
		System.out.println(temp);
	}

}