package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class ScaleRatingBar extends AnimationRatingBar {
    private static final long ANIMATION_DELAY = 15;

    public ScaleRatingBar(Context context) {
        super(context);
    }

    private Runnable getAnimationRunnable(final float f4, final PartialView partialView, final int i4, final double d4) {
        return new Runnable() { // from class: com.xuexiang.xui.widget.progress.ratingbar.ScaleRatingBar.2
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                if (i4 == d4) {
                    partialView.setPartialFilled(f4);
                } else {
                    partialView.setFilled();
                }
                if (i4 == f4) {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(ScaleRatingBar.this.getContext(), C2042R.anim.srb_scale_up);
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(ScaleRatingBar.this.getContext(), C2042R.anim.srb_scale_down);
                    partialView.startAnimation(animationLoadAnimation);
                    partialView.startAnimation(animationLoadAnimation2);
                }
            }
        };
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.RatingBar
    protected void emptyRatingBar() {
        if (this.mRunnable != null) {
            this.mHandler.removeCallbacksAndMessages(this.mRunnableToken);
        }
        long j4 = 0;
        for (final PartialView partialView : this.mPartialViews) {
            j4 += 5;
            this.mHandler.postDelayed(new Runnable() { // from class: com.xuexiang.xui.widget.progress.ratingbar.ScaleRatingBar.1
                @Override // java.lang.Runnable
                public void run() {
                    partialView.setEmpty();
                }
            }, j4);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.RatingBar
    protected void fillRatingBar(float f4) {
        if (this.mRunnable != null) {
            this.mHandler.removeCallbacksAndMessages(this.mRunnableToken);
        }
        for (PartialView partialView : this.mPartialViews) {
            int iIntValue = ((Integer) partialView.getTag()).intValue();
            double dCeil = Math.ceil(f4);
            if (iIntValue > dCeil) {
                partialView.setEmpty();
            } else {
                Runnable animationRunnable = getAnimationRunnable(f4, partialView, iIntValue, dCeil);
                this.mRunnable = animationRunnable;
                postRunnable(animationRunnable, ANIMATION_DELAY);
            }
        }
    }

    public ScaleRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScaleRatingBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
