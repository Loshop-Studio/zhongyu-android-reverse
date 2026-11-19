package com.xuexiang.xui.widget.edittext.verify;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes3.dex */
public class PwdTextView extends AppCompatTextView {

    /* renamed from: b */
    public float f4991b;

    /* renamed from: c */
    public boolean f4992c;

    /* renamed from: d */
    public Paint f4993d;

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f4992c) {
            canvas.drawCircle(getWidth() >> 1, getHeight() >> 1, this.f4991b, this.f4993d);
        } else {
            super.onDraw(canvas);
        }
    }
}
