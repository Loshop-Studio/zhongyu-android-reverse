package com.xuexiang.xui.widget.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes3.dex */
public class CountDownButton extends AppCompatButton {

    /* renamed from: a */
    public String f4074a;

    /* renamed from: b */
    public final long f4075b;

    /* renamed from: c */
    public final long f4076c;

    /* renamed from: d */
    public final String f4077d;

    /* renamed from: e */
    public final boolean f4078e;

    /* renamed from: f */
    public View.OnClickListener f4079f;

    /* renamed from: g */
    public final CountDownTimerC4163a f4080g;

    /* renamed from: h */
    public boolean f4081h;

    public CountDownButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if (this.f4079f != null && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f4079f.onClick(this);
            }
            if (this.f4078e && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f4074a = getText().toString();
                setEnabled(false);
                this.f4080g.start();
                this.f4081h = true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z8) {
        if (this.f4081h) {
            return;
        }
        super.setEnabled(z8);
        setClickable(z8);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f4079f = onClickListener;
    }

    public CountDownButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.CountDownButtonStyle);
    }

    public CountDownButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4078e = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CountDownButton, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.CountDownButton_cdbt_countDownFormat);
        this.f4077d = string;
        if (TextUtils.isEmpty(string)) {
            this.f4077d = "%ds";
        }
        this.f4075b = typedArrayObtainStyledAttributes.getInteger(R$styleable.CountDownButton_cdbt_countDown, 60000);
        long integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.CountDownButton_cdbt_countDownInterval, 1000);
        this.f4076c = integer;
        this.f4078e = this.f4075b > integer && typedArrayObtainStyledAttributes.getBoolean(R$styleable.CountDownButton_cdbt_enableCountDown, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f4080g == null) {
            this.f4080g = new CountDownTimerC4163a(this, this.f4075b, this.f4076c);
        }
    }
}
