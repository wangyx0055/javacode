package bsptest;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import android.os.RemoteException;
import android.view.KeyEvent;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class WakeUp extends UiAutomatorTestCase {   
	private int light = -1;
public void test1() throws UiObjectNotFoundException, RemoteException, IOException, ParserConfigurationException, SAXException{
		for(int i = 0 ; i < 300 ; i++){
			getUiDevice().pressKeyCode(KeyEvent.KEYCODE_POWER);
			if(i%2 !=0){
				sleep((long) 1000.0);
				if(getLight() == 0)System.out.println(getLight()+"fail ---- " + i);
				System.out.println(getLight());
				sleep((long) 10000.0);
			}else{
				sleep((long) 1000.0);
				if(getLight() != 0)System.out.println(getLight()+"--fail ---- " + i);
				sleep((long) 10000.0);
			}
		}
	} 

	public int getLight() throws IOException
	{
		//米3w电量查询Url
		Process p = Runtime.getRuntime().exec("cat /sys/class/leds/lcd-backlight/brightness");
		InputStream is = p.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String line = reader.readLine();
		is.close();
		reader.close();
		p.destroy();
		light = Integer.parseInt(line, 10); 
		return light;
	}

}