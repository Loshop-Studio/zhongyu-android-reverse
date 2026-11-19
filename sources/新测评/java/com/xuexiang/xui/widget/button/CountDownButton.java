package com.xuexiang.xui.widget.button;

import android.graphics.Rect;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes4.dex */
public class CountDownButton extends AppCompatButton {

    /* renamed from: a */
    public String f5904a;

    /* renamed from: b */
    public boolean f5905b;

    /* renamed from: c */
    public View.OnClickListener f5906c;

    /* renamed from: d */
    public CountDownTimer f5907d;

    /* renamed from: e */
    public boolean f5908e;

    /* renamed from: a */
    public boolean m5517a() {
        return this.f5908e;
    }

    /* renamed from: b */
    public final void m5518b() {
        this.f5904a = getText().toString();
        setEnabled(false);
        this.f5907d.start();
        this.f5908e = true;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            getWindowVisibleDisplayFrame(rect);
            if (this.f5906c != null && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f5906c.onClick(this);
            }
            if (this.f5905b && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                m5518b();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        if (m5517a()) {
            return;
        }
        super.setEnabled(z9);
        setClickable(z9);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f5906c = onClickListener;
    }
}
