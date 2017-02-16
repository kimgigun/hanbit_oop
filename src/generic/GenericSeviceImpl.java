package generic;

public class GenericSeviceImpl<T> implements GenericSevice {

	@Override
	public String print(String param) {
		GenericBean<?> g = new GenericBean<String>(param);
		return (String) g.getVal();
	}
}
