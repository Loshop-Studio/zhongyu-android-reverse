package com.xuexiang.xui.widget.button;

import android.graphics.Rect;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes2.dex */
public class CountDownButton extends AppCompatButton {

    /* renamed from: a */
    public String f3244a;

    /* renamed from: b */
    public boolean f3245b;

    /* renamed from: c */
    public View.OnClickListener f3246c;

    /* renamed from: d */
    public CountDownTimer f3247d;

    /* renamed from: e */
    public boolean f3248e;

    /* renamed from: a */
    public boolean m4203a() {
        return this.f3248e;
    }

    /* renamed from: b */
    public final void m4204b() {
        this.f3244a = getText().toString();
        setEnabled(false);
        this.f3247d.start();
        this.f3248e = true;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if (this.f3246c != null && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f3246c.onClick(this);
            }
            if (this.f3245b && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                m4204b();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        if (m4203a()) {
            return;
        }
        super.setEnabled(z3);
        setClickable(z3);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f3246c = onClickListener;
    }
}
