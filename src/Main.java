import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;

public class Main {

    public static void main(String[] args) {

        callApi();
    }


    //documentation is available at
    //http://unirest.io/java.html
    static void callApi() {
        try {
            HttpResponse<JsonNode> jsonResponse = Unirest.get("https://jsonplaceholder.typicode.com/posts")
                    .asJson();
            JSONArray jsObject = jsonResponse.getBody().getArray();
            System.out.println("");
        } catch (UnirestException e) {
            e.printStackTrace();
        }

    }

}
