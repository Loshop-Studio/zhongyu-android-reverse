package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import java.util.UUID;

/* loaded from: classes3.dex */
public class AnimationRatingBar extends RatingBar {

    /* renamed from: r */
    public Handler f4800r;

    /* renamed from: s */
    public Runnable f4801s;

    /* renamed from: t */
    public final String f4802t;

    public AnimationRatingBar(Context context) {
        super(context);
        this.f4802t = UUID.randomUUID().toString();
        this.f4800r = new Handler();
    }

    public AnimationRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4802t = UUID.randomUUID().toString();
        this.f4800r = new Handler();
    }

    public AnimationRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4802t = UUID.randomUUID().toString();
        this.f4800r = new Handler();
    }
}
