package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes3.dex */
public class ShadowImageView extends AppCompatImageView {

    /* renamed from: a */
    public int f4676a;

    /* renamed from: b */
    public int f4677b;

    /* renamed from: c */
    public int f4678c;

    /* renamed from: d */
    public int f4679d;

    /* renamed from: e */
    public Paint f4680e;

    /* renamed from: f */
    public int f4681f;

    /* renamed from: g */
    public int f4682g;

    /* renamed from: h */
    public RectF f4683h;

    public int getPressedColor() {
        return this.f4679d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f4680e;
        if (paint == null) {
            return;
        }
        if (this.f4681f == 0) {
            int i6 = this.f4676a;
            canvas.drawCircle(i6 / 2.0f, this.f4677b / 2.0f, i6 / 2.1038f, paint);
        } else {
            RectF rectF = this.f4683h;
            int i7 = this.f4682g;
            canvas.drawRoundRect(rectF, i7, i7, paint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        this.f4676a = i6;
        this.f4677b = i7;
        this.f4683h = new RectF(0.0f, 0.0f, this.f4676a, this.f4677b);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f4680e.setAlpha(this.f4678c);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f4680e.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i6) {
        this.f4680e.setColor(this.f4679d);
        invalidate();
    }
}
