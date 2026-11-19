package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes4.dex */
public class BaseShadowButton extends AppCompatButton {

    /* renamed from: a */
    public int f7255a;

    /* renamed from: b */
    public int f7256b;

    /* renamed from: c */
    public Paint f7257c;

    /* renamed from: d */
    public int f7258d;

    /* renamed from: e */
    public int f7259e;

    /* renamed from: f */
    public RectF f7260f;

    /* renamed from: a */
    public void m6654a(int i10) {
        if (i10 != 0) {
            setBackgroundColor(0);
        }
    }

    public int getRadius() {
        return this.f7259e;
    }

    public int getShapeType() {
        return this.f7258d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint = this.f7257c;
        if (paint == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f7258d == 0) {
            int i10 = this.f7255a;
            canvas.drawCircle(i10 / 2.0f, this.f7256b / 2.0f, i10 / 2.0f, paint);
        } else {
            RectF rectF = this.f7260f;
            int i11 = this.f7259e;
            canvas.drawRoundRect(rectF, i11, i11, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f7255a = i10;
        this.f7256b = i11;
        this.f7260f = new RectF(0.0f, 0.0f, this.f7255a, this.f7256b);
    }

    public void setRadius(int i10) {
        this.f7259e = i10;
        invalidate();
    }

    public void setShapeType(int i10) {
        this.f7258d = i10;
        invalidate();
    }

    public void setUnpressedColor(int i10) {
        this.f7257c.setAlpha(Color.alpha(i10));
        this.f7257c.setColor(i10);
        m6654a(i10);
        invalidate();
    }
}
