package com.xuexiang.xui.widget.button;

import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class ButtonView extends AppCompatTextView {

    /* renamed from: b */
    public GradientDrawable f7226b;

    /* renamed from: c */
    public int f7227c;

    /* renamed from: d */
    public int f7228d;

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (this.f7228d != 0 && isEnabled()) {
                this.f7226b.setColor(this.f7228d);
                setBackgroundDrawable(this.f7226b);
                postInvalidate();
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f7228d != 0) {
            this.f7226b.setColor(this.f7227c);
            setBackgroundDrawable(this.f7226b);
        }
        return super.onTouchEvent(motionEvent);
    }
}
