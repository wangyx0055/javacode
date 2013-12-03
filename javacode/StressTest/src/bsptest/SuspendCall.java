package bsptest;

import java.io.*;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.util.Date;
import java.text.SimpleDateFormat;
import android.os.RemoteException;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class SuspendCall extends UiAutomatorTestCase {   

	@SuppressWarnings({ "unused", "deprecation" })
	public void test_MOCALL() throws UiObjectNotFoundException, RemoteException, IOException, ParserConfigurationException, SAXException{
		Process mkdir = Runtime.getRuntime().exec("mkdir /sdcard/callMo");
		File resultReport=new File("/sdcard/callMo/Callfail_list.txt");
		resultReport.createNewFile();
		FileOutputStream inputResult=new FileOutputStream(resultReport);
		for(int i = 0 ; i < 300 ; i++){
			String callnumber = "tel:10010";
			Process startCall = Runtime.getRuntime().exec("am start -a android.intent.action.CALL -d " + callnumber);
			sleep((long) 20000.0);
		    UiObject settingsValidation = new UiObject(new UiSelector()
	         .textContains("0:"));
	      if(settingsValidation.exists()){
			System.out.println("call is successfully!" + i);	
			sleep((long) 5000);
			UiObject suspendButton = new UiObject(new UiSelector()
	         .description("等待"));
			suspendButton.click();
			sleep((long) 20000);
			suspendButton.click();
			UiObject endButton = new UiObject(new UiSelector().
		    		   className("android.widget.ImageButton").index(0));

		    if(endButton.exists() && endButton.isEnabled()) 
		    {
		    	endButton.click();
		    }
			sleep((long) 10000.0);
			getUiDevice().pressHome();
			}
	      
			else{
				String str1;
  				sleep((long) 20000);
  				UiObject endButton = new UiObject(new UiSelector().
  		    		   className("android.widget.ImageButton").index(0));
   				if (endButton.exists()) {
   					endButton.click();
   					sleep((long) 2000.0);
   					getUiDevice().pressHome();
   		        } else {
   		        	getUiDevice().pressHome();
   		        }
   				System.out.println("call is fail!" + i);
  				String failnote = "call is fail_"+i;
  				SimpleDateFormat date1 = new SimpleDateFormat("yyyyMMddHH:mm:ss");
				inputResult.write((date1.format(new Date())+"  \n"+failnote+"  \n").getBytes());
  				sleep((long) 1000.0);
  				try {
  					String faill_logcat;
  					File logcatFile1=new File("/sdcard/callMo/log"+i+".txt");
  					logcatFile1.createNewFile();
  					FileOutputStream outputLogcat1=new FileOutputStream(logcatFile1);
  					Process getLogcat1 = Runtime.getRuntime().exec("logcat -b radio -t 2000");
  					DataInputStream inputLogcat1 = new DataInputStream(getLogcat1.getInputStream());
  					while ((faill_logcat = inputLogcat1.readLine()) != null){
  						outputLogcat1.write((faill_logcat+"  \n").getBytes());
  					}
  				} catch (IOException e) {
  					// TODO Auto-generated catch block
  					e.printStackTrace();
  				}
  				sleep((long) 5000.0);
				}    	
			}
		  
			}
		}

		
		
