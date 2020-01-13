package Test_CIandT.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {
	
	String APP_BASE_URL = "https://fakerestapi.azurewebsites.net/api/Users";
	Integer APP_PORT = 443; //80 for http or 443 for https;
	String APP_BASE_PATH = "";		
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIME_OUT = 7000L;
	

}
