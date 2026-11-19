package com.xuexiang.xui.widget.button;

import android.graphics.Rect;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes4.dex */
public class CountDownButton extends AppCompatButton {

    /* renamed from: a */
    public String f7159a;

    /* renamed from: b */
    public boolean f7160b;

    /* renamed from: c */
    public View.OnClickListener f7161c;

    /* renamed from: d */
    public CountDownTimer f7162d;

    /* renamed from: e */
    public boolean f7163e;

    /* renamed from: a */
    public boolean m6613a() {
        return this.f7163e;
    }

    /* renamed from: b */
    public final void m6614b() {
        this.f7159a = getText().toString();
        setEnabled(false);
        this.f7162d.start();
        this.f7163e = true;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if (this.f7161c != null && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f7161c.onClick(this);
            }
            if (this.f7160b && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                m6614b();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        if (m6613a()) {
            return;
        }
        super.setEnabled(z9);
        setClickable(z9);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f7161c = onClickListener;
    }
}
