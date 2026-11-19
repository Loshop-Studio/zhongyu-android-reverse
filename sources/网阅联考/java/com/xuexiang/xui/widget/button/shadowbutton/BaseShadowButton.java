package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes2.dex */
public class BaseShadowButton extends AppCompatButton {

    /* renamed from: a */
    public int f3270a;

    /* renamed from: b */
    public int f3271b;

    /* renamed from: c */
    public Paint f3272c;

    /* renamed from: d */
    public int f3273d;

    /* renamed from: e */
    public int f3274e;

    /* renamed from: f */
    public RectF f3275f;

    /* renamed from: a */
    public void m4219a(int i4) {
        if (i4 != 0) {
            setBackgroundColor(0);
        }
    }

    public int getRadius() {
        return this.f3274e;
    }

    public int getShapeType() {
        return this.f3273d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint = this.f3272c;
        if (paint == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f3273d == 0) {
            int i4 = this.f3270a;
            canvas.drawCircle(i4 / 2.0f, this.f3271b / 2.0f, i4 / 2.0f, paint);
        } else {
            RectF rectF = this.f3275f;
            int i5 = this.f3274e;
            canvas.drawRoundRect(rectF, i5, i5, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f3270a = i4;
        this.f3271b = i5;
        this.f3275f = new RectF(0.0f, 0.0f, this.f3270a, this.f3271b);
    }

    public void setRadius(int i4) {
        this.f3274e = i4;
        invalidate();
    }

    public void setShapeType(int i4) {
        this.f3273d = i4;
        invalidate();
    }

    public void setUnpressedColor(int i4) {
        this.f3272c.setAlpha(Color.alpha(i4));
        this.f3272c.setColor(i4);
        m4219a(i4);
        invalidate();
    }
}
