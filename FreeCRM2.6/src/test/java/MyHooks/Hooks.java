package MyHooks;

import java.io.IOException;

import com.crm.TestBase.Testbase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Testbase {
	
	

	@Before
	public void initialization() throws IOException {
		init();
		LaunchApp();
	}
	
//	@After
	public void closebrowser() throws IOException {
		CloseBrowser();
	}

	
	/*
	 * Background
	 * tstop opening everytime
	 */
}
