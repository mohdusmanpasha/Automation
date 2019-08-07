package api.test;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import api.call.ApiCalls;
import api.call.FileReader;

public class MainTest {
	@Test(dataProvider="getData")
  public void ApiTest(String url1, String url2) {
	  ApiCalls apiCall = new ApiCalls(url1, url2);
  }
	
	@DataProvider
    public Object[][] getData() {
       FileReader fReader = new FileReader();
       return fReader.readFileData();
    }
}
