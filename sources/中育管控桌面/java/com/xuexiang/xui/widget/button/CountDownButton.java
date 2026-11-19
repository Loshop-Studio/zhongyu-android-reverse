package com.xuexiang.xui.widget.button;

import android.graphics.Rect;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes3.dex */
public class CountDownButton extends AppCompatButton {

    /* renamed from: a */
    public String f4628a;

    /* renamed from: b */
    public boolean f4629b;

    /* renamed from: c */
    public View.OnClickListener f4630c;

    /* renamed from: d */
    public CountDownTimer f4631d;

    /* renamed from: e */
    public boolean f4632e;

    /* renamed from: a */
    public boolean m4527a() {
        return this.f4632e;
    }

    /* renamed from: b */
    public final void m4528b() {
        this.f4628a = getText().toString();
        setEnabled(false);
        this.f4631d.start();
        this.f4632e = true;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            getWindowVisibleDisplayFrame(rect);
            if (this.f4630c != null && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f4630c.onClick(this);
            }
            if (this.f4629b && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                m4528b();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z6) {
        if (m4527a()) {
            return;
        }
        super.setEnabled(z6);
        setClickable(z6);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f4630c = onClickListener;
    }
}
