package pac2.copy;

import org.testng.annotations.Test;

public class orgTest {
	
	@Test
	public void createOrgTest() {
		
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		String userName = System.getProperty("username");
		String password = System.getProperty("password");
		
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(userName);
		System.out.println(password);
		
		
		
		System.out.println("execute createOrgTest");
	}
     @Test
	public void modifyOrgTest() {
		System.out.println("execute modifyOrgTest");
	}

}
