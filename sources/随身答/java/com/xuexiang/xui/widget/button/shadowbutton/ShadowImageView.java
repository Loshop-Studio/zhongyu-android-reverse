package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes4.dex */
public class ShadowImageView extends AppCompatImageView {

    /* renamed from: a */
    public int f7207a;

    /* renamed from: b */
    public int f7208b;

    /* renamed from: c */
    public int f7209c;

    /* renamed from: d */
    public int f7210d;

    /* renamed from: e */
    public Paint f7211e;

    /* renamed from: f */
    public int f7212f;

    /* renamed from: g */
    public int f7213g;

    /* renamed from: h */
    public RectF f7214h;

    public int getPressedColor() {
        return this.f7210d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f7211e;
        if (paint == null) {
            return;
        }
        if (this.f7212f == 0) {
            int i9 = this.f7207a;
            canvas.drawCircle(i9 / 2.0f, this.f7208b / 2.0f, i9 / 2.1038f, paint);
        } else {
            RectF rectF = this.f7214h;
            int i10 = this.f7213g;
            canvas.drawRoundRect(rectF, i10, i10, paint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f7207a = i9;
        this.f7208b = i10;
        this.f7214h = new RectF(0.0f, 0.0f, this.f7207a, this.f7208b);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7211e.setAlpha(this.f7209c);
            invalidate();
        } else if (action == 1 || action == 3) {
            this.f7211e.setAlpha(0);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPressedColor(int i9) {
        this.f7211e.setColor(this.f7210d);
        invalidate();
    }
}
