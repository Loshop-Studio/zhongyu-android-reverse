package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes3.dex */
public class BaseShadowButton extends AppCompatButton {

    /* renamed from: a */
    public int f4654a;

    /* renamed from: b */
    public int f4655b;

    /* renamed from: c */
    public Paint f4656c;

    /* renamed from: d */
    public int f4657d;

    /* renamed from: e */
    public int f4658e;

    /* renamed from: f */
    public RectF f4659f;

    /* renamed from: a */
    public void m4543a(int i6) {
        if (i6 != 0) {
            setBackgroundColor(0);
        }
    }

    public int getRadius() {
        return this.f4658e;
    }

    public int getShapeType() {
        return this.f4657d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint = this.f4656c;
        if (paint == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f4657d == 0) {
            int i6 = this.f4654a;
            canvas.drawCircle(i6 / 2.0f, this.f4655b / 2.0f, i6 / 2.0f, paint);
        } else {
            RectF rectF = this.f4659f;
            int i7 = this.f4658e;
            canvas.drawRoundRect(rectF, i7, i7, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        this.f4654a = i6;
        this.f4655b = i7;
        this.f4659f = new RectF(0.0f, 0.0f, this.f4654a, this.f4655b);
    }

    public void setRadius(int i6) {
        this.f4658e = i6;
        invalidate();
    }

    public void setShapeType(int i6) {
        this.f4657d = i6;
        invalidate();
    }

    public void setUnpressedColor(int i6) {
        this.f4656c.setAlpha(Color.alpha(i6));
        this.f4656c.setColor(i6);
        m4543a(i6);
        invalidate();
    }
}
