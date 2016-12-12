package wovilon.simplepaint;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;


public class Draw2D extends View {
    private Paint mPaint=new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;
    public int move=650;
    public Draw2D(Context context){
        super(context);

        Resources res=this.getResources();
        mBitmap=BitmapFactory.decodeResource(res,R.drawable.cat);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(100,30,40,mPaint);

        mPaint.setColor(Color.GREEN);
        canvas.drawRect(20,650,950,680,mPaint);

        int x=150;
        int y=110;

        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(32);
        canvas.drawText("Лужайка только для котов",30,648,mPaint);

        mPaint.setColor(Color.GRAY);
        mPaint.setTextSize(27);
        String str2rotate="Лучик Солнца!";

        canvas.rotate(45, x+mRect.exactCenterX(), y+mRect.exactCenterY());

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(str2rotate, x,y, mPaint);

        canvas.restore();

        int bitY=move-mBitmap.getHeight();


        canvas.drawBitmap(mBitmap,440,bitY,mPaint);

    }

}
