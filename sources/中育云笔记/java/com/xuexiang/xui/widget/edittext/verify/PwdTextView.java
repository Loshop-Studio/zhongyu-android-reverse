package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;

/* loaded from: classes5.dex */
public class PwdTextView extends AppCompatTextView {

    /* renamed from: d */
    public float f15920d;

    /* renamed from: e */
    public boolean f15921e;

    /* renamed from: f */
    public Paint f15922f;

    public PwdTextView(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m12607e() {
        Paint paint = new Paint(1);
        this.f15922f = paint;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f15922f.setStyle(Paint.Style.FILL);
    }

    /* renamed from: c */
    public void m12608c() {
        this.f15921e = false;
        invalidate();
    }

    /* renamed from: d */
    public void m12609d(float f10) {
        this.f15921e = true;
        if (f10 == 0.0f) {
            this.f15920d = getWidth() >> 2;
        } else {
            this.f15920d = f10;
        }
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f15921e) {
            canvas.drawCircle(getWidth() >> 1, getHeight() >> 1, this.f15920d, this.f15922f);
        } else {
            super.onDraw(canvas);
        }
    }

    public PwdTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PwdTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12607e();
    }
}
