package com.xuexiang.xui.widget.button;

import android.os.CountDownTimer;
import java.util.Locale;

/* renamed from: com.xuexiang.xui.widget.button.a */
/* loaded from: classes3.dex */
public final class CountDownTimerC4163a extends CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ CountDownButton f4133a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC4163a(CountDownButton countDownButton, long j7, long j8) {
        super(j7, j8);
        this.f4133a = countDownButton;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        CountDownButton countDownButton = this.f4133a;
        countDownButton.f4081h = false;
        countDownButton.setEnabled(true);
        countDownButton.setText(countDownButton.f4074a);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j7) {
        Locale locale = Locale.CHINA;
        CountDownButton countDownButton = this.f4133a;
        countDownButton.setText(String.format(locale, countDownButton.f4077d, Long.valueOf(j7 / 1000)));
    }
}
