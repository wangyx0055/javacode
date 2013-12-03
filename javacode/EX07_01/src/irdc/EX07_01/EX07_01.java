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
  /* �Cn���m���Ϥ� */
  private int intSecondsToChange = 5;
  private int intCounter1, intCounter2;
  /* ����FadeIn�PFade Out��Counter */
  private int intCounter3, intCounter4;
  /* ����`�Ǵ����I����ID��Counter  */
  private int intDrawable=0;
  /*�ŧiContext Menu���ﶵ�`��*/
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
     
    /*�z�LfindViewById�غc�l�إ�TextView�PImageView����*/
    mImageView01= (ImageView)findViewById(R.id.myImageView1);
  /*  mImageView01.setImageDrawable(getResources().
                 getDrawable(R.drawable.screen1));*/
     DisplayMetrics dm=new DisplayMetrics();
     getWindowManager().getDefaultDisplay().getMetrics(dm);
     screenWidth = dm.widthPixels;
     screenHeight = dm.heightPixels;
     Bitmap bmp=BitmapFactory.decodeResource(getResources(), screenDrawable[intDrawable]);
     
     /* Matrix��� */ 
     float scaleWidth = ((float) screenWidth) / bmp.getWidth();
     float scaleHeight = ((float) screenHeight) / bmp.getHeight() ;
     
     Matrix matrix = new Matrix(); 
     /* �ϥ�Matrix.postScale�]�w����ReSize */ 
     matrix.postScale(scaleWidth, scaleHeight);
    /* ReSize���ɦܿù��ѪR�� */
    Bitmap resizedBitmap = Bitmap.createBitmap(bmp,0,0,bmp.getWidth(),bmp.getHeight(),matrix,true);
    BitmapDrawable myNewBitmapDrawable = new BitmapDrawable(resizedBitmap); 
    mImageView01.setImageDrawable(myNewBitmapDrawable);
    
    /* ��ImageView�i�� */
    mImageView01.setVisibility(View.VISIBLE);
    
    /* �C���j�]�w���Ƹm���Ϥ�ID�A��U�@��runnable2�~�|�ͮ� */
    if(intCounter2%intSecondsToChange==0)
    {
      intDrawable++;
    }
    /*�]�wOnCreateContextMenuListener��TextView
     * ���Ϥ��W�i�H�ϥ�ContextMenu*/
  }
 
} 