package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public class PwdTextView extends AppCompatTextView {

    /* renamed from: b */
    public float f4303b;

    /* renamed from: c */
    public boolean f4304c;

    /* renamed from: d */
    public final Paint f4305d;

    public PwdTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f4304c) {
            canvas.drawCircle(getWidth() >> 1, getHeight() >> 1, this.f4303b, this.f4305d);
        } else {
            super.onDraw(canvas);
        }
    }

    public PwdTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PwdTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f4305d = paint;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f4305d.setStyle(Paint.Style.FILL);
    }
}
