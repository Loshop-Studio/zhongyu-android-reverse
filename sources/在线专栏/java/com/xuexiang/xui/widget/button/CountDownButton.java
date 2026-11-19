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
import com.xuexiang.xui.C2042R;
import java.util.Locale;

/* loaded from: classes.dex */
public class CountDownButton extends AppCompatButton {
    private static final int DEFAULT_COUNTDOWN_TIME = 60000;
    private static final String DEFAULT_COUNT_FORMAT = "%ds";
    private static final int DEFAULT_INTERVAL = 1000;
    private boolean isCountDownNow;
    private String mCountDownFormat;
    private long mCountDownTime;
    private CountDownTimer mCountDownTimer;
    private String mDefaultText;
    private boolean mEnableCountDown;
    private long mInterval;
    private View.OnClickListener mOnClickListener;

    public CountDownButton(Context context) {
        this(context, null);
    }

    private void init(Context context, AttributeSet attributeSet, int i4) {
        initAttr(context, attributeSet, i4);
        if (this.mCountDownTimer == null) {
            this.mCountDownTimer = new CountDownTimer(this.mCountDownTime, this.mInterval) { // from class: com.xuexiang.xui.widget.button.CountDownButton.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    CountDownButton.this.isCountDownNow = false;
                    CountDownButton.this.setEnabled(true);
                    CountDownButton countDownButton = CountDownButton.this;
                    countDownButton.setText(countDownButton.mDefaultText);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j4) {
                    CountDownButton countDownButton = CountDownButton.this;
                    countDownButton.setText(String.format(Locale.CHINA, countDownButton.mCountDownFormat, Long.valueOf(j4 / 1000)));
                }
            };
        }
    }

    private void initAttr(Context context, AttributeSet attributeSet, int i4) {
        boolean z3 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.CountDownButton, i4, 0);
        String string = typedArrayObtainStyledAttributes.getString(C2042R.styleable.CountDownButton_cdbt_countDownFormat);
        this.mCountDownFormat = string;
        if (TextUtils.isEmpty(string)) {
            this.mCountDownFormat = DEFAULT_COUNT_FORMAT;
        }
        this.mCountDownTime = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.CountDownButton_cdbt_countDown, DEFAULT_COUNTDOWN_TIME);
        long integer = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.CountDownButton_cdbt_countDownInterval, 1000);
        this.mInterval = integer;
        if (this.mCountDownTime > integer && typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CountDownButton_cdbt_enableCountDown, true)) {
            z3 = true;
        }
        this.mEnableCountDown = z3;
        typedArrayObtainStyledAttributes.recycle();
    }

    private void startCountDown() {
        this.mDefaultText = getText().toString();
        setEnabled(false);
        this.mCountDownTimer.start();
        this.isCountDownNow = true;
    }

    public void cancelCountDown() {
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.isCountDownNow = false;
        setText(this.mDefaultText);
        setEnabled(true);
    }

    public boolean isCountDownNow() {
        return this.isCountDownNow;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if (this.mOnClickListener != null && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.mOnClickListener.onClick(this);
            }
            if (this.mEnableCountDown && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                startCountDown();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public CountDownButton setCountDown(long j4, long j5, String str) {
        this.mCountDownTime = j4;
        this.mCountDownFormat = str;
        this.mInterval = j5;
        setEnableCountDown(true);
        return this;
    }

    public CountDownButton setCountDownFormat(String str) {
        this.mCountDownFormat = str;
        return this;
    }

    public CountDownButton setCountDownTime(long j4) {
        this.mCountDownTime = j4;
        return this;
    }

    public CountDownButton setEnableCountDown(boolean z3) {
        this.mEnableCountDown = this.mCountDownTime > this.mInterval && z3;
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        if (isCountDownNow()) {
            return;
        }
        super.setEnabled(z3);
        setClickable(z3);
    }

    public CountDownButton setInterval(long j4) {
        this.mInterval = j4;
        return this;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.mOnClickListener = onClickListener;
    }

    public CountDownButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.CountDownButtonStyle);
    }

    public CountDownButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mEnableCountDown = true;
        init(context, attributeSet, i4);
    }
}
