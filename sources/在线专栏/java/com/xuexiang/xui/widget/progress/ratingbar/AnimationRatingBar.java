package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import java.util.UUID;

/* loaded from: classes.dex */
public class AnimationRatingBar extends RatingBar {
    protected Handler mHandler;
    protected Runnable mRunnable;
    protected String mRunnableToken;

    protected AnimationRatingBar(Context context) {
        super(context);
        this.mRunnableToken = UUID.randomUUID().toString();
        init();
    }

    private void init() {
        this.mHandler = new Handler();
    }

    protected void postRunnable(Runnable runnable, long j4) {
        if (this.mHandler == null) {
            this.mHandler = new Handler();
        }
        this.mHandler.postAtTime(runnable, this.mRunnableToken, SystemClock.uptimeMillis() + j4);
    }

    protected AnimationRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRunnableToken = UUID.randomUUID().toString();
        init();
    }

    protected AnimationRatingBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mRunnableToken = UUID.randomUUID().toString();
        init();
    }
}
