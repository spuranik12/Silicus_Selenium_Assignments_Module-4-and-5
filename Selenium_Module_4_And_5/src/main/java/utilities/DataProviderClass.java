package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "Invalid Login Detials")
	public static Object[][] loginWithInvalidCredentials(){
		return new Object[][]{
				{"Admin", "admin001"},  
		}; 
	}
	
	@DataProvider(name = "Valid Login Detials")
	public static Object[][] loginWithValidCredentials(){
		return new Object[][]{ 
				{"Admin", "admin"},
		}; 
	}
}
