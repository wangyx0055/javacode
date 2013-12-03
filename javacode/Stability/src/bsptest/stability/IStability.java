package bsptest.stability;

import java.io.IOException;
import org.xml.sax.SAXException;
import android.os.RemoteException;
import com.android.uiautomator.core.UiObjectNotFoundException;

/**
*Interface 接口的具体函数名。
*<p>Interface的各个函数的实现方法可见MI3.java&Protoenesis.java<br>
* @version 1.0, 2013-08-23
* @author 薛敬浩
* @return
*/ 

interface IStability
{
	/**
	 *{@link MI3#CallMotest()}
	*/
	void CallMotest() throws UiObjectNotFoundException, IOException, Exception, SAXException;
	/**
	 *{@link MI3#SmsMoTest()}
	*/
	void SmsMoTest() throws UiObjectNotFoundException, IOException, Exception, SAXException;
	/**
	 *{@link MI3#AirPlane()}
	*/
	void AirPlane() throws UiObjectNotFoundException, IOException, Exception, SAXException;
	/**
	 *{@link MI3#DataChange()}
	*/
	void DataChange() throws UiObjectNotFoundException, IOException, Exception, SAXException;
	/**
	 *{@link MI3#Alarm()}
	*/
	void Alarm() throws UiObjectNotFoundException, IOException, Exception, SAXException;
	/**
	 *{@link MI3#CrashBug()}
	*/
	void CrashBug();
	
	void StartCamera();
	void BackPhotograph()throws UiObjectNotFoundException;
	void AheadPhotograph()throws UiObjectNotFoundException;
	void BackVideo()throws UiObjectNotFoundException;
	void AheadVideo() throws UiObjectNotFoundException;
	void CloseCamera();
	
}
