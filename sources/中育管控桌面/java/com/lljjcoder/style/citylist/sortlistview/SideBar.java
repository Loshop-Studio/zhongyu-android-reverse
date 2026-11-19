package com.lljjcoder.style.citylist.sortlistview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.lljjcoder.style.citypickerview.C5752R;

/* loaded from: classes3.dex */
public class SideBar extends View {

    /* renamed from: b */
    public static String[] f3679b = {ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "#"};
    private int choose;
    private TextView mTextDialog;
    private OnTouchingLetterChangedListener onTouchingLetterChangedListener;
    private Paint paint;

    public interface OnTouchingLetterChangedListener {
        void onTouchingLetterChanged(String str);
    }

    public SideBar(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.choose = -1;
        this.paint = new Paint();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float y6 = motionEvent.getY();
        int i6 = this.choose;
        OnTouchingLetterChangedListener onTouchingLetterChangedListener = this.onTouchingLetterChangedListener;
        int height = (int) ((y6 / getHeight()) * f3679b.length);
        if (action != 1) {
            setBackgroundResource(C5752R.drawable.sidebar_background);
            if (i6 != height && height >= 0) {
                String[] strArr = f3679b;
                if (height < strArr.length) {
                    if (onTouchingLetterChangedListener != null) {
                        onTouchingLetterChangedListener.onTouchingLetterChanged(strArr[height]);
                    }
                    TextView textView = this.mTextDialog;
                    if (textView != null) {
                        textView.setText(f3679b[height]);
                        this.mTextDialog.setVisibility(0);
                    }
                    this.choose = height;
                    invalidate();
                }
            }
        } else {
            setBackgroundDrawable(new ColorDrawable(0));
            this.choose = -1;
            invalidate();
            TextView textView2 = this.mTextDialog;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        int length = height / f3679b.length;
        for (int i6 = 0; i6 < f3679b.length; i6++) {
            this.paint.setColor(Color.rgb(33, 65, 98));
            this.paint.setTypeface(Typeface.DEFAULT_BOLD);
            this.paint.setAntiAlias(true);
            this.paint.setTextSize(20.0f);
            if (i6 == this.choose) {
                this.paint.setColor(Color.parseColor("#000000"));
                this.paint.setFakeBoldText(true);
            }
            canvas.drawText(f3679b[i6], (width / 2) - (this.paint.measureText(f3679b[i6]) / 2.0f), (length * i6) + length, this.paint);
            this.paint.reset();
        }
    }

    public void setOnTouchingLetterChangedListener(OnTouchingLetterChangedListener onTouchingLetterChangedListener) {
        this.onTouchingLetterChangedListener = onTouchingLetterChangedListener;
    }

    public void setTextView(TextView textView) {
        this.mTextDialog = textView;
    }

    public SideBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.choose = -1;
        this.paint = new Paint();
    }

    public SideBar(Context context) {
        super(context);
        this.choose = -1;
        this.paint = new Paint();
    }
}
