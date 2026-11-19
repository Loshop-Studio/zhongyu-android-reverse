package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import java.util.UUID;

/* loaded from: classes5.dex */
public class AnimationRatingBar extends RatingBar {

    /* renamed from: t */
    public Handler f16864t;

    /* renamed from: u */
    public Runnable f16865u;

    /* renamed from: v */
    public String f16866v;

    public AnimationRatingBar(Context context) {
        super(context);
        this.f16866v = UUID.randomUUID().toString();
        m13153k();
    }

    /* renamed from: k */
    public final void m13153k() {
        this.f16864t = new Handler();
    }

    /* renamed from: l */
    public void m13154l(Runnable runnable, long j10) {
        if (this.f16864t == null) {
            this.f16864t = new Handler();
        }
        this.f16864t.postAtTime(runnable, this.f16866v, SystemClock.uptimeMillis() + j10);
    }

    public AnimationRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16866v = UUID.randomUUID().toString();
        m13153k();
    }

    public AnimationRatingBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16866v = UUID.randomUUID().toString();
        m13153k();
    }
}
