package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import androidx.annotation.Nullable;
import com.xuexiang.xui.R$anim;

/* loaded from: classes5.dex */
public class RotationRatingBar extends AnimationRatingBar {

    /* renamed from: com.xuexiang.xui.widget.progress.ratingbar.RotationRatingBar$a */
    public class RunnableC8235a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f16888c;

        /* renamed from: d */
        public final /* synthetic */ double f16889d;

        /* renamed from: e */
        public final /* synthetic */ PartialView f16890e;

        /* renamed from: f */
        public final /* synthetic */ float f16891f;

        public RunnableC8235a(int i10, double d10, PartialView partialView, float f10) {
            this.f16888c = i10;
            this.f16889d = d10;
            this.f16890e = partialView;
            this.f16891f = f10;
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            if (this.f16888c == this.f16889d) {
                this.f16890e.m13160f(this.f16891f);
            } else {
                this.f16890e.m13158d();
            }
            if (this.f16888c == this.f16891f) {
                this.f16890e.startAnimation(AnimationUtils.loadAnimation(RotationRatingBar.this.getContext(), R$anim.srb_rotation));
            }
        }
    }

    public RotationRatingBar(Context context) {
        super(context);
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
                Runnable runnableM13173m = m13173m(f11, partialView, iIntValue, dCeil);
                this.f16865u = runnableM13173m;
                m13154l(runnableM13173m, 15L);
                f10 = f11;
            }
        }
    }

    /* renamed from: m */
    public final Runnable m13173m(float f10, PartialView partialView, int i10, double d10) {
        return new RunnableC8235a(i10, d10, partialView, f10);
    }

    public RotationRatingBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotationRatingBar(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
