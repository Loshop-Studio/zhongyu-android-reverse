package com.xuexiang.xui.widget.button;

import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class ButtonView extends AppCompatTextView {

    /* renamed from: b */
    public GradientDrawable f7156b;

    /* renamed from: c */
    public int f7157c;

    /* renamed from: d */
    public int f7158d;

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (this.f7158d != 0 && isEnabled()) {
                this.f7156b.setColor(this.f7158d);
                setBackgroundDrawable(this.f7156b);
                postInvalidate();
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f7158d != 0) {
            this.f7156b.setColor(this.f7157c);
            setBackgroundDrawable(this.f7156b);
        }
        return super.onTouchEvent(motionEvent);
    }
}
