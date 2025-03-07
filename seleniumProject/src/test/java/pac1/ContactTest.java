package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createContactTest() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		String userName = System.getProperty("username");
		String password = System.getProperty("password");
		
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(userName);
		System.out.println(password);
		
		System.out.println("execute createContactTest");
	}
     @Test
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}
     
     @Test
 	public void deleteyContactTest() {
 		System.out.println("execute deleteContactTest");
 	}


}
