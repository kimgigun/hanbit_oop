package arry;


public class ArrayServiceImpl implements ArrayService {
	String[] arr;

	public ArrayServiceImpl() {
		arr = new String[5];
	}

	@Override
	public void add() {
		arr[0] = "java";
		arr[1] = "Jsp";
		arr[2] = "Spring";
		arr[3] = "Js";
		arr[4] = "Html";
	}

	@Override
	public String fineOne() {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if ('J' == arr[i].charAt(0)) {
				result += arr[i] + "\t";
			}
		}
		return result;
	}

	@Override
	public String findSome() {
		return null;
	}

	@Override

	public String List() {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i] + "\t";
		}
		return result;
	}

	@Override
	public String update() {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if ("Js".equals(arr[i])) {
				arr[i] = "Javascript";
			}
		}
		result = "";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i] + "\t";
		}
		return result;
	}

	@Override
	public String delete() {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if ("Spring".equals(arr[i])) {
				arr[i] = arr[arr.length - 1];
				arr[arr.length - 1] = null;
			}
		}
		result = "";
		for (int i = 0; i < arr.length - 1; i++) {
			result += arr[i] + "\t";
		}
		return result;
	}
}
