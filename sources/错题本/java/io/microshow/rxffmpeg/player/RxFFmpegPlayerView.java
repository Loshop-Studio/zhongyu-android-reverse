package io.microshow.rxffmpeg.player;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import kotlinx.serialization.json.internal.C6043x;
import p107l5.InterfaceC6063a;

/* loaded from: classes3.dex */
public class RxFFmpegPlayerView extends FrameLayout {

    /* renamed from: a */
    public final Context f8878a;

    /* renamed from: b */
    public final C6043x f8879b;

    /* renamed from: c */
    public final FrameLayout f8880c;

    /* renamed from: d */
    public int f8881d;

    public RxFFmpegPlayerView(Context context) {
        this(context, null);
    }

    public FrameLayout getContainerView() {
        return this.f8880c;
    }

    public int getMuteSolo() {
        return 0;
    }

    public TextureView getTextureView() {
        return null;
    }

    public int getVolume() {
        return 100;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C6043x c6043x = this.f8879b;
        if (c6043x != null) {
            c6043x.getClass();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        C6043x c6043x = this.f8879b;
        MeasureHelper$FitModel measureHelper$FitModel = (MeasureHelper$FitModel) c6043x.f9600e;
        if (measureHelper$FitModel == MeasureHelper$FitModel.FM_DEFAULT || measureHelper$FitModel == MeasureHelper$FitModel.FM_FULL_SCREEN_HEIGHT) {
            measuredHeight = c6043x.f9597b;
        }
        int[] iArr = {measuredWidth, measuredHeight};
        setMeasuredDimension(iArr[0], iArr[1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setFitModel(io.microshow.rxffmpeg.player.MeasureHelper$FitModel r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.microshow.rxffmpeg.player.RxFFmpegPlayerView.setFitModel(io.microshow.rxffmpeg.player.MeasureHelper$FitModel):void");
    }

    public void setMuteSolo(int i) {
    }

    public void setPlayerBackgroundColor(int i) {
        FrameLayout frameLayout = this.f8880c;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(i);
        }
    }

    public void setTextureViewEnabledTouch(boolean z8) {
    }

    public void setVolume(int i) {
    }

    public RxFFmpegPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8881d = 0;
        this.f8878a = context;
        this.f8879b = new C6043x(this, this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8880c = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        addView(this.f8880c, new FrameLayout.LayoutParams(-1, -1));
        setKeepScreenOn(true);
    }

    public void setOnCompleteListener(InterfaceC6063a interfaceC6063a) {
    }
}
