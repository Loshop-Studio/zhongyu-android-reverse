package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.Nullable;
import com.xuexiang.xui.R$anim;

/* loaded from: classes5.dex */
public class ScaleRatingBar extends AnimationRatingBar {

    /* renamed from: com.xuexiang.xui.widget.progress.ratingbar.ScaleRatingBar$a */
    public class RunnableC8237a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f16894c;

        /* renamed from: d */
        public final /* synthetic */ double f16895d;

        /* renamed from: e */
        public final /* synthetic */ PartialView f16896e;

        /* renamed from: f */
        public final /* synthetic */ float f16897f;

        public RunnableC8237a(int i10, double d10, PartialView partialView, float f10) {
            this.f16894c = i10;
            this.f16895d = d10;
            this.f16896e = partialView;
            this.f16897f = f10;
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            if (this.f16894c == this.f16895d) {
                this.f16896e.m13160f(this.f16897f);
            } else {
                this.f16896e.m13158d();
            }
            if (this.f16894c == this.f16897f) {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(ScaleRatingBar.this.getContext(), R$anim.srb_scale_up);
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(ScaleRatingBar.this.getContext(), R$anim.srb_scale_down);
                this.f16896e.startAnimation(animationLoadAnimation);
                this.f16896e.startAnimation(animationLoadAnimation2);
            }
        }
    }

    public ScaleRatingBar(Context context) {
        super(context);
    }

    /* renamed from: m */
    private Runnable m13178m(float f10, PartialView partialView, int i10, double d10) {
        return new RunnableC8237a(i10, d10, partialView, f10);
    }

    @Override // com.xuexiang.xui.widget.progress.ratingbar.RatingBar
    /* renamed from: a */
    public void mo13163a(float f10) {
        if (this.f16865u != null) {
            this.f16864t.removeCallbacksAndMessages(this.f16866v);
        }
        for (PartialView partialView : this.f16887s) {
            int iIntValue = ((Integer) partialView.getTag()).intValue();
            double dCeil = Math.ceil(f10);
            if (iIntValue > dCeil) {
                partialView.m13156b();
            } else {
                float f11 = f10;
                Runnable runnableM13178m = m13178m(f11, partialView, iIntValue, dCeil);
                this.f16865u = runnableM13178m;
                m13154l(runnableM13178m, 15L);
                f10 = f11;
            }
        }
    }

    public ScaleRatingBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScaleRatingBar(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
