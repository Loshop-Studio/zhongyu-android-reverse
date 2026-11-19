package com.xuexiang.xui.widget.edittext.verify;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class PwdTextView extends AppCompatTextView {

    /* renamed from: b */
    public float f6266b;

    /* renamed from: c */
    public boolean f6267c;

    /* renamed from: d */
    public Paint f6268d;

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f6267c) {
            canvas.drawCircle(getWidth() >> 1, getHeight() >> 1, this.f6266b, this.f6268d);
        } else {
            super.onDraw(canvas);
        }
    }
}
