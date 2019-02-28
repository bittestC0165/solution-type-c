package problem02;

public class MyService extends BaseService {

	@Override
	public void service(String state) {
		String result = state.equals("낮") ? state+afternoon() : state+afternoon() ;
		System.out.println(result);
	}
	
	public String afternoon() {
		return "서비스 시작";
	}
}
