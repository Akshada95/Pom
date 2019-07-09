package mt.mstr.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import mt.mstr.pages.FlightFinderpage;
import mt.mstr.pages.Loginpage;
import mt.mstr.utility.CloseBrowser;

public class Login 
{
	@Parameters({"usernm","passwd"})
	@Test
	public void executeLoginwithValidds(String username,String password)
	{
		Loginpage lg=new Loginpage();
		lg.loadLoginpage();
		lg.enterUserName(username);
		lg.enterPassword(password);
		lg.clickonLogin();
		
		FlightFinderpage ff=new FlightFinderpage();
		ff.loadFlightFinderpage();
		ff.verifyFlightFinder();
		ff.clickonSignoff();
		
		CloseBrowser cb= new CloseBrowser();
		cb.closeBrowser();
		System.out.println("Close Browser");
		
		
		
		
	}
	
	
}
