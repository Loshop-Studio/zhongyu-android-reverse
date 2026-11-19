package com.xuexiang.xui.widget.button;

import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes3.dex */
public class ButtonView extends AppCompatTextView {

    /* renamed from: b */
    public GradientDrawable f4625b;

    /* renamed from: c */
    public int f4626c;

    /* renamed from: d */
    public int f4627d;

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (this.f4627d != 0 && isEnabled()) {
                this.f4625b.setColor(this.f4627d);
                setBackgroundDrawable(this.f4625b);
                postInvalidate();
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f4627d != 0) {
            this.f4625b.setColor(this.f4626c);
            setBackgroundDrawable(this.f4625b);
        }
        return super.onTouchEvent(motionEvent);
    }
}
