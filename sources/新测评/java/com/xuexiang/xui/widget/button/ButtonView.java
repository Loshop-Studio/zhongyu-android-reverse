package com.xuexiang.xui.widget.button;

import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class ButtonView extends AppCompatTextView {

    /* renamed from: b */
    public GradientDrawable f5901b;

    /* renamed from: c */
    public int f5902c;

    /* renamed from: d */
    public int f5903d;

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (this.f5903d != 0 && isEnabled()) {
                this.f5901b.setColor(this.f5903d);
                setBackgroundDrawable(this.f5901b);
                postInvalidate();
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f5903d != 0) {
            this.f5901b.setColor(this.f5902c);
            setBackgroundDrawable(this.f5901b);
        }
        return super.onTouchEvent(motionEvent);
    }
}
