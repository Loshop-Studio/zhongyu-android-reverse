package com.xuexiang.xui.widget.button.shadowbutton;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes4.dex */
public class BaseShadowButton extends AppCompatButton {

    /* renamed from: a */
    public int f5930a;

    /* renamed from: b */
    public int f5931b;

    /* renamed from: c */
    public Paint f5932c;

    /* renamed from: d */
    public int f5933d;

    /* renamed from: e */
    public int f5934e;

    /* renamed from: f */
    public RectF f5935f;

    /* renamed from: a */
    public void m5533a(int i10) {
        if (i10 != 0) {
            setBackgroundColor(0);
        }
    }

    public int getRadius() {
        return this.f5934e;
    }

    public int getShapeType() {
        return this.f5933d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint = this.f5932c;
        if (paint == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f5933d == 0) {
            int i10 = this.f5930a;
            canvas.drawCircle(i10 / 2.0f, this.f5931b / 2.0f, i10 / 2.0f, paint);
        } else {
            RectF rectF = this.f5935f;
            int i11 = this.f5934e;
            canvas.drawRoundRect(rectF, i11, i11, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5930a = i10;
        this.f5931b = i11;
        this.f5935f = new RectF(0.0f, 0.0f, this.f5930a, this.f5931b);
    }

    public void setRadius(int i10) {
        this.f5934e = i10;
        invalidate();
    }

    public void setShapeType(int i10) {
        this.f5933d = i10;
        invalidate();
    }

    public void setUnpressedColor(int i10) {
        this.f5932c.setAlpha(Color.alpha(i10));
        this.f5932c.setColor(i10);
        m5533a(i10);
        invalidate();
    }
}
