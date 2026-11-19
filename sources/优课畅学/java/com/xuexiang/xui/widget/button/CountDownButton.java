package com.xuexiang.xui.widget.button;

import android.graphics.Rect;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes4.dex */
public class CountDownButton extends AppCompatButton {

    /* renamed from: a */
    public String f7229a;

    /* renamed from: b */
    public boolean f7230b;

    /* renamed from: c */
    public View.OnClickListener f7231c;

    /* renamed from: d */
    public CountDownTimer f7232d;

    /* renamed from: e */
    public boolean f7233e;

    /* renamed from: a */
    public boolean m6638a() {
        return this.f7233e;
    }

    /* renamed from: b */
    public final void m6639b() {
        this.f7229a = getText().toString();
        setEnabled(false);
        this.f7232d.start();
        this.f7233e = true;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            getWindowVisibleDisplayFrame(rect);
            if (this.f7231c != null && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f7231c.onClick(this);
            }
            if (this.f7230b && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                m6639b();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        if (m6638a()) {
            return;
        }
        super.setEnabled(z10);
        setClickable(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f7231c = onClickListener;
    }
}
