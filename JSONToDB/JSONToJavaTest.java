package mavenweb;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonToJavaTest {
	public static void main(String[] args) {
		String jsonText = "{\"isMarried\":false,\"address\":null,\"name\":\"kim\",\"age\"19}";
		
		JSONParser parser = new JSONParser();
		
		JSONObject obj = null;
		
		try {
			obj = (JSONObject)parser.parse(jsonText);
		}catch(ParseException e) {
			System.out.println("변환에 실패");
			e.printStackTrace();
		}
		
		System.out.println(obj);
		System.out.println(obj.get("name"));
		System.out.println(obj.get("isMarried"));
	}
}
