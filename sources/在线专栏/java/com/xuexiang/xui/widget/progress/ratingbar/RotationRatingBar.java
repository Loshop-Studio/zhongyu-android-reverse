package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class RotationRatingBar extends AnimationRatingBar {
    private static final long ANIMATION_DELAY = 15;

    public RotationRatingBar(Context context) {
        super(context);
    }

    private Runnable getAnimationRunnable(final float f4, final PartialView partialView, final int i4, final double d4) {
        return new Runnable() { // from class: com.xuexiang.xui.widget.progress.ratingbar.RotationRatingBar.2
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                if (i4 == d4) {
                    partialView.setPartialFilled(f4);
                } else {
                    partialView.setFilled();
                }
                if (i4 == f4) {
                    partialView.startAnimation(AnimationUtils.loadAnimation(RotationRatingBar.this.getContext(), C2042R.anim.srb_rotation));
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
            this.mHandler.postDelayed(new Runnable() { // from class: com.xuexiang.xui.widget.progress.ratingbar.RotationRatingBar.1
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

    public RotationRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotationRatingBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
