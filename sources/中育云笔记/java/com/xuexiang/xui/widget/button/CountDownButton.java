package com.xuexiang.xui.widget.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.blankj.utilcode.constant.TimeConstants;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import java.util.Locale;

/* loaded from: classes5.dex */
public class CountDownButton extends AppCompatButton {

    /* renamed from: c */
    public String f15540c;

    /* renamed from: d */
    public long f15541d;

    /* renamed from: e */
    public long f15542e;

    /* renamed from: f */
    public String f15543f;

    /* renamed from: g */
    public boolean f15544g;

    /* renamed from: h */
    public View.OnClickListener f15545h;

    /* renamed from: i */
    public CountDownTimer f15546i;

    /* renamed from: j */
    public boolean f15547j;

    /* renamed from: com.xuexiang.xui.widget.button.CountDownButton$a */
    public class CountDownTimerC8069a extends CountDownTimer {
        public CountDownTimerC8069a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CountDownButton.this.f15547j = false;
            CountDownButton.this.setEnabled(true);
            CountDownButton countDownButton = CountDownButton.this;
            countDownButton.setText(countDownButton.f15540c);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            CountDownButton countDownButton = CountDownButton.this;
            countDownButton.setText(String.format(Locale.CHINA, countDownButton.f15543f, Long.valueOf(j10 / 1000)));
        }
    }

    public CountDownButton(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private void m12428d(Context context, AttributeSet attributeSet, int i10) {
        m12429e(context, attributeSet, i10);
        if (this.f15546i == null) {
            this.f15546i = new CountDownTimerC8069a(this.f15541d, this.f15542e);
        }
    }

    /* renamed from: e */
    public final void m12429e(Context context, AttributeSet attributeSet, int i10) {
        boolean z10 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CountDownButton, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.CountDownButton_cdbt_countDownFormat);
        this.f15543f = string;
        if (TextUtils.isEmpty(string)) {
            this.f15543f = "%ds";
        }
        this.f15541d = typedArrayObtainStyledAttributes.getInteger(R$styleable.CountDownButton_cdbt_countDown, TimeConstants.MIN);
        long integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.CountDownButton_cdbt_countDownInterval, 1000);
        this.f15542e = integer;
        if (this.f15541d > integer && typedArrayObtainStyledAttributes.getBoolean(R$styleable.CountDownButton_cdbt_enableCountDown, true)) {
            z10 = true;
        }
        this.f15544g = z10;
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public boolean m12430f() {
        return this.f15547j;
    }

    /* renamed from: g */
    public final void m12431g() {
        this.f15540c = getText().toString();
        setEnabled(false);
        this.f15546i.start();
        this.f15547j = true;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if (this.f15545h != null && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f15545h.onClick(this);
            }
            if (this.f15544g && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                m12431g();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        if (m12430f()) {
            return;
        }
        super.setEnabled(z10);
        setClickable(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f15545h = onClickListener;
    }

    public CountDownButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.CountDownButtonStyle);
    }

    public CountDownButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15544g = true;
        m12428d(context, attributeSet, i10);
    }
}
