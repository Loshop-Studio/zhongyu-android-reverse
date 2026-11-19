package com.xuexiang.xui.widget.edittext.verify;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public class PwdTextView extends AppCompatTextView {

    /* renamed from: b */
    public float f3470b;

    /* renamed from: c */
    public boolean f3471c;

    /* renamed from: d */
    public Paint f3472d;

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f3471c) {
            canvas.drawCircle(getWidth() >> 1, getHeight() >> 1, this.f3470b, this.f3472d);
        } else {
            super.onDraw(canvas);
        }
    }
}
