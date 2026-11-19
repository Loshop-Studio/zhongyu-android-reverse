package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes4.dex */
public class BaseShadowButton extends AppCompatButton {

    /* renamed from: a */
    public int f7185a;

    /* renamed from: b */
    public int f7186b;

    /* renamed from: c */
    public Paint f7187c;

    /* renamed from: d */
    public int f7188d;

    /* renamed from: e */
    public int f7189e;

    /* renamed from: f */
    public RectF f7190f;

    /* renamed from: a */
    public void m6629a(int i9) {
        if (i9 != 0) {
            setBackgroundColor(0);
        }
    }

    public int getRadius() {
        return this.f7189e;
    }

    public int getShapeType() {
        return this.f7188d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint = this.f7187c;
        if (paint == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f7188d == 0) {
            int i9 = this.f7185a;
            canvas.drawCircle(i9 / 2.0f, this.f7186b / 2.0f, i9 / 2.0f, paint);
        } else {
            RectF rectF = this.f7190f;
            int i10 = this.f7189e;
            canvas.drawRoundRect(rectF, i10, i10, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f7185a = i9;
        this.f7186b = i10;
        this.f7190f = new RectF(0.0f, 0.0f, this.f7185a, this.f7186b);
    }

    public void setRadius(int i9) {
        this.f7189e = i9;
        invalidate();
    }

    public void setShapeType(int i9) {
        this.f7188d = i9;
        invalidate();
    }

    public void setUnpressedColor(int i9) {
        this.f7187c.setAlpha(Color.alpha(i9));
        this.f7187c.setColor(i9);
        m6629a(i9);
        invalidate();
    }
}
