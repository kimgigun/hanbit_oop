package generic;

public class GenericController {
	public static void main(String[] args) {
		GenericSevice service = new GenericSeviceImpl<String>();
		System.out.println(service.print("Hello Gereric !!"));
	}
}
