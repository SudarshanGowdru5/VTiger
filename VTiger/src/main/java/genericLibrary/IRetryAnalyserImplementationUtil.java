package genericLibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
/***
 * 
 * @author Sudarshan
 *
 */
public class IRetryAnalyserImplementationUtil implements IRetryAnalyzer{
	/**
	 * This Method is used to retry when the testCase failed
	 */
	 int count=0;
	  int retry=3;
	public boolean retry(ITestResult result) {
		if(count<retry) {
			  System.out.println("retry count is"+count+"times");
			  count++;
			  return true;
		  }
		return false;
	}
	

}
