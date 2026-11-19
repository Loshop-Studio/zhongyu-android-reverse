package com.xuexiang.xui.utils;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.umeng.analytics.pro.C1851ai;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class CountDownButtonHelper {
    private TextView mButton;
    private int mCountDownTime;
    private CountDownTimer mCountDownTimer;
    private int mInterval;
    private OnCountDownListener mListener;

    public interface OnCountDownListener {
        void onCountDown(int i4);

        void onFinished();
    }

    public CountDownButtonHelper(TextView textView, int i4) {
        this(textView, i4, 1);
    }

    private void initCountDownTimer() {
        if (this.mCountDownTimer == null) {
            this.mCountDownTimer = new CountDownTimer(this.mCountDownTime * 1000, (this.mInterval * 1000) - 10) { // from class: com.xuexiang.xui.utils.CountDownButtonHelper.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    CountDownButtonHelper.this.mButton.setEnabled(true);
                    if (CountDownButtonHelper.this.mListener != null) {
                        CountDownButtonHelper.this.mListener.onFinished();
                    } else {
                        CountDownButtonHelper.this.mButton.setText(CountDownButtonHelper.this.mButton.getResources().getString(C2042R.string.xui_count_down_finish));
                    }
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j4) {
                    int i4 = (int) ((j4 + 15) / 1000);
                    if (CountDownButtonHelper.this.mListener != null) {
                        CountDownButtonHelper.this.mListener.onCountDown(i4);
                        return;
                    }
                    CountDownButtonHelper.this.mButton.setText(i4 + C1851ai.f8303az);
                }
            };
        }
    }

    public void cancel() {
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mCountDownTimer = null;
        }
    }

    public void recycle() {
        cancel();
        this.mListener = null;
        this.mButton = null;
    }

    public CountDownButtonHelper setOnCountDownListener(OnCountDownListener onCountDownListener) {
        this.mListener = onCountDownListener;
        return this;
    }

    public void start() {
        initCountDownTimer();
        this.mButton.setEnabled(false);
        this.mCountDownTimer.start();
    }

    public CountDownButtonHelper(TextView textView, int i4, int i5) {
        this.mButton = textView;
        this.mCountDownTime = i4;
        this.mInterval = i5;
        initCountDownTimer();
    }
}
