package com.xuexiang.xui.widget.edittext.verify;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class PwdTextView extends AppCompatTextView {

    /* renamed from: b */
    public float f7524b;

    /* renamed from: c */
    public boolean f7525c;

    /* renamed from: d */
    public Paint f7526d;

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f7525c) {
            canvas.drawCircle(getWidth() >> 1, getHeight() >> 1, this.f7524b, this.f7526d);
        } else {
            super.onDraw(canvas);
        }
    }
}
