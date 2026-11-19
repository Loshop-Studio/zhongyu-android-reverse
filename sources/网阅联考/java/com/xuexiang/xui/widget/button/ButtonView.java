package com.xuexiang.xui.widget.button;

import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public class ButtonView extends AppCompatTextView {

    /* renamed from: b */
    public GradientDrawable f3241b;

    /* renamed from: c */
    public int f3242c;

    /* renamed from: d */
    public int f3243d;

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (this.f3243d != 0 && isEnabled()) {
                this.f3241b.setColor(this.f3243d);
                setBackgroundDrawable(this.f3241b);
                postInvalidate();
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f3243d != 0) {
            this.f3241b.setColor(this.f3242c);
            setBackgroundDrawable(this.f3241b);
        }
        return super.onTouchEvent(motionEvent);
    }
}
