package bsptest;

import java.io.*;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

import android.os.RemoteException;	
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Browser extends UiAutomatorTestCase{
		
		/*@SuppressWarnings("unused")
		protected void setUp() throws UiObjectNotFoundException, RemoteException, IOException {
			getUiDevice().sleep();
		    sleep((long) 2000.0);
		    getUiDevice().wakeUp();
		    sleep((long) 1000.0);
		    Process r1 = Runtime.getRuntime().exec("sendevent /dev/input/event5 1 115 1");
		    Process r2 = Runtime.getRuntime().exec("sendevent /dev/input/event5 0 0 0");
		    Process r3 = Runtime.getRuntime().exec("sendevent /dev/input/event0 1 158 1");
		    Process r4 = Runtime.getRuntime().exec("sendevent /dev/input/event0 0 0 0");
		    Process r5 = Runtime.getRuntime().exec("sendevent /dev/input/event5 1 115 0");
		    Process r6 = Runtime.getRuntime().exec("sendevent /dev/input/event5 0 0 0");
		    Process r7 = Runtime.getRuntime().exec("sendevent /dev/input/event0 1 158 0");
		    Process r8 = Runtime.getRuntime().exec("sendevent /dev/input/event0 0 0 0");
		    sleep((long) 2000.0);		
			}
		
		protected void tearDown() throws UiObjectNotFoundException, RemoteException, IOException { 
			getUiDevice().sleep();
		    sleep((long) 2000.0);
			}*/
		
		@SuppressWarnings("unused")
		public void test() throws UiObjectNotFoundException, RemoteException, IOException, ParserConfigurationException, SAXException{
			/*DocumentBuilderFactory factory1 = DocumentBuilderFactory
		    	     .newInstance();
		    DocumentBuilder builder1 = factory1.newDocumentBuilder();
		    Document document1 = builder1.parse(new File("/sdcard/MIUI/string.xml"));
		    Element rootElement1 = document1.getDocumentElement();
		    NodeList list2 = rootElement1.getElementsByTagName("loopnum");
		    Element element2 = (Element) list2.item(0);
		    String str6;
		    str6 = element2.getChildNodes().item(0).getNodeValue();
		    int aa = Integer.parseInt(str6, 10);*/
			for(int i = 0 ; i < 700 ; i++){
				Process p1 = Runtime.getRuntime().exec("am start -a android.intent.action.VIEW -d " +
						"http://3g.sina.com.cn -n com.android.browser/.BrowserActivity -f 0x13800000");
				sleep((long) 10000.0);
				getUiDevice().click(300,600);
				sleep((long) 5000.0);
				Process p2 = Runtime.getRuntime().exec("am start -a android.intent.action.VIEW -d " +
						"http://3g.qq.com -n com.android.browser/.BrowserActivity -f 0x13800000");
				sleep((long) 10000.0);
				getUiDevice().click(300,600);
				sleep((long) 5000.0);
				Process p3 = Runtime.getRuntime().exec("screencap -p /sdcard/" + i/2 + ".png");
				sleep((long) 2000.0);
				}
			}
		
		
		
}
