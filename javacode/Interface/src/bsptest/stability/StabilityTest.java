package bsptest.stability;

import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import android.os.RemoteException;
import android.util.Log;
import bsptest.stability.MI3.cameraTest;
import bsptest.stability.MI3.wifiCheck;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
* 调用接口的具体函数。<br>
* For example:<br>
* IStability interface1 = new MI3();<br>
* interface1.CallMotest();<br>
* @see bsptest.stability.IStability
* @version 1.0, 2013-08-23
* @author 薛敬浩
* @return
*/ 

public class StabilityTest extends UiAutomatorTestCase 
{
	/**给全局变量赋值，值为{@value}*/
	private int k = 1;
	/**给接口确定具体的实现方法，值为{@value}*/
	public static IStability interface1 = new MI3();
	// 在XML中读取字符串
		private static String getParameterStr(String packageName,String voidName,String parameterName) throws ParserConfigurationException, SAXException, IOException
		{
			String parameter = "";
			File f = new File("/sdcard/settings.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(f);
			Element allList = doc.getDocumentElement();
			//获取一级目录的参数名
			NodeList nodeList = doc.getElementsByTagName("package");
			for (int i = 0;i < nodeList.getLength();i++){
				Node node = nodeList.item(i);
				Node dataXml = node.getAttributes().getNamedItem("name");
				String data = dataXml.getTextContent();
				if(data.equals(packageName)){
					//获取二级目录的参数名
					Element element = (Element)node;
					NodeList nodeList1 =  element.getElementsByTagName("method");
					for (int j = 0;j < nodeList1.getLength();j++){
						Node node2 = nodeList1.item(j);
						Node dataXml1 = node2.getAttributes().getNamedItem("name");
						String data1 = dataXml1.getTextContent();
						if(data1.equals(voidName)){
							//获取具体的参数
							Element element1 = (Element)node2;
							NodeList nodeList2=element1.getElementsByTagName(parameterName);
							parameter = nodeList2.item(0).getTextContent();
						}
					}
				}
			}
			
			return parameter ;
		}
		/**
		*在XML配置文件中读取int类型的整型
		* @return true if successful else false
		*/ 
		private static int getParameterInt(String packageName,String voidName,String parameterName) throws ParserConfigurationException, SAXException, IOException
		{
			int parameter = 0;
			return parameter = Integer.parseInt(getParameterStr(packageName,voidName,parameterName), 10); 
		}
	
	@SuppressWarnings("unused")
	public void setUp() throws UiObjectNotFoundException, RemoteException, IOException 
	{
		UiDevice.getInstance().pressHome();
		sleep((long) 1000.0); 
	}
	
	
	@SuppressWarnings("unused")
	public void tearDown() throws UiObjectNotFoundException, RemoteException, IOException 
	{ 
		UiDevice.getInstance().pressHome();
		sleep((long) 1000.0);
		Process SendEvent1 = Runtime.getRuntime().exec(" am Kill all background processes.");
		sleep((long) 1000.0);  		
		Log.v("Mi3 stability test", "case --------------"+k);
		k++;
	}
	
	/**
	 *ReadXmlInt(string) 可以读取XML中的int型数据。<br> 
	 *ReadXmlString(string)可以读取XML中的string型字符串。<br> 
	 * *UiObject waitApp = new UiObject(new UiSelector().textContains("暂停通话"))
	 *的存在与否可以判断通话是否成功。<br> 
	 *Log.v(MI3.ACTIVITY_TAG, "Modemtest CallMo fail ------------"+i)
	 *会将运行fail的结果输入到logcat中<br>
	 *@param ReadXmlInt("loop") 为循环的Loop次数<br> 
	 *@param ReadXmlString("callNum") 为拨打电话的号码<br> 
	 *@return true if the device has a phone else false
	*/
	public void test01Calltest() throws Exception 
	{
		interface1.CallMotest();
	}
	
	public void test02SmsMoTest()throws Exception 
	{
		interface1.SmsMoTest();
	}
	
	public void test03AirPlane()
	{
		interface1.AirPlane();
	}
	
	public void test04DataChange() throws Exception 
	{
		interface1.DataChange();
	}
	
	public void test05Wifi() throws Exception 
	{
		//getParameterInt("Stability","Airplane","loop")*2
		for(int i = 1 ; i <=1000 ; i++){
			System.out.println("1");
			MI3.wifiCheck.openWifi();
			String[] cmd = new String[]{"/system/bin/sh","-c","dumpsys wifi | grep -i Wi-Fi"};
			String matchesString1 = "Wi-Fi is enabled";
			int time = 60;
			if(interface1.logCheck(cmd, matchesString1, time) == true){
				System.out.println("OK");
			}else{
				Process mkdir = Runtime.getRuntime().exec("mkdir /sdcard/Wifi");
				UiDevice.getInstance().takeScreenshot(new File("/sdcard/Wifi/"+interface1.getTime("HH_mm_ss")+".png"));
			}
			sleep((long) 1000.0);
			System.out.println("2");
			MI3.wifiCheck.closeWifi();
			String matchesString2 = "Wi-Fi is disabled";
			if(interface1.logCheck(cmd, matchesString2, time) == true){
				System.out.println("OK");
			}else{
				Process mkdir = Runtime.getRuntime().exec("mkdir /sdcard/Wifi");
				UiDevice.getInstance().takeScreenshot(new File("/sdcard/Wifi/"+interface1.getTime("HH_mm_ss")+".png"));
			}
		}
	}
}
