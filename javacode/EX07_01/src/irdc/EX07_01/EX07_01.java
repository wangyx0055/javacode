package irdc.EX07_01;

import android.app.Activity; 
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle; 
import android.util.DisplayMetrics;
import android.view.ContextMenu; 
import android.view.Menu; 
import android.view.MenuItem; 
import android.view.View; 
import android.view.ContextMenu.ContextMenuInfo; 
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView; 
import android.widget.TextView; 

public class EX07_01 extends Activity 
{ 
  private ImageView mImageView01;
  private int screenWidth, screenHeight;
  /* 每n秒置換圖片 */
  private int intSecondsToChange = 5;
  private int intCounter1, intCounter2;
  /* 控制FadeIn與Fade Out的Counter */
  private int intCounter3, intCounter4;
  /* 控制循序替換背景圖ID的Counter  */
  private int intDrawable=0;
  /*宣告Context Menu的選項常數*/
  private static int[] screenDrawable = new int[]
      {
        R.drawable.screen1,
        R.drawable.screen2

      };
  
  @Override 
  public void onCreate(Bundle savedInstanceState) 
  { 
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.main); 
     
    /*透過findViewById建構子建立TextView與ImageView物件*/
    mImageView01= (ImageView)findViewById(R.id.myImageView1);
  /*  mImageView01.setImageDrawable(getResources().
                 getDrawable(R.drawable.screen1));*/
     DisplayMetrics dm=new DisplayMetrics();
     getWindowManager().getDefaultDisplay().getMetrics(dm);
     screenWidth = dm.widthPixels;
     screenHeight = dm.heightPixels;
     Bitmap bmp=BitmapFactory.decodeResource(getResources(), screenDrawable[intDrawable]);
     
     /* Matrix比例 */ 
     float scaleWidth = ((float) screenWidth) / bmp.getWidth();
     float scaleHeight = ((float) screenHeight) / bmp.getHeight() ;
     
     Matrix matrix = new Matrix(); 
     /* 使用Matrix.postScale設定維度ReSize */ 
     matrix.postScale(scaleWidth, scaleHeight);
    /* ReSize圖檔至螢幕解析度 */
    Bitmap resizedBitmap = Bitmap.createBitmap(bmp,0,0,bmp.getWidth(),bmp.getHeight(),matrix,true);
    BitmapDrawable myNewBitmapDrawable = new BitmapDrawable(resizedBitmap); 
    mImageView01.setImageDrawable(myNewBitmapDrawable);
    
    /* 使ImageView可見 */
    mImageView01.setVisibility(View.VISIBLE);
    
    /* 每間隔設定秒數置換圖片ID，於下一個runnable2才會生效 */
    if(intCounter2%intSecondsToChange==0)
    {
      intDrawable++;
    }
    /*設定OnCreateContextMenuListener給TextView
     * 讓圖片上可以使用ContextMenu*/
  }
 
} 
