package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.res.Resources;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.xuexiang.xui.R$anim;

/* renamed from: com.xuexiang.xui.widget.progress.ratingbar.b */
/* loaded from: classes3.dex */
public final class RunnableC4208b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4825a;

    /* renamed from: b */
    public final /* synthetic */ int f4826b;

    /* renamed from: c */
    public final /* synthetic */ double f4827c;

    /* renamed from: d */
    public final /* synthetic */ PartialView f4828d;

    /* renamed from: e */
    public final /* synthetic */ float f4829e;

    /* renamed from: f */
    public final /* synthetic */ AnimationRatingBar f4830f;

    public /* synthetic */ RunnableC4208b(AnimationRatingBar animationRatingBar, int i, double d9, PartialView partialView, float f, int i8) {
        this.f4825a = i8;
        this.f4830f = animationRatingBar;
        this.f4826b = i;
        this.f4827c = d9;
        this.f4828d = partialView;
        this.f4829e = f;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        switch (this.f4825a) {
            case 0:
                int i = this.f4826b;
                double d9 = i;
                double d10 = this.f4827c;
                float f = this.f4829e;
                PartialView partialView = this.f4828d;
                if (d9 == d10) {
                    partialView.m3563c(f);
                } else {
                    partialView.f4803a.setImageLevel(10000);
                    partialView.f4804b.setImageLevel(0);
                }
                if (i == f) {
                    partialView.startAnimation(AnimationUtils.loadAnimation(((RotationRatingBar) this.f4830f).getContext(), R$anim.srb_rotation));
                    break;
                }
                break;
            default:
                ScaleRatingBar scaleRatingBar = (ScaleRatingBar) this.f4830f;
                int i8 = this.f4826b;
                double d11 = i8;
                double d12 = this.f4827c;
                float f7 = this.f4829e;
                PartialView partialView2 = this.f4828d;
                if (d11 == d12) {
                    partialView2.m3563c(f7);
                } else {
                    partialView2.f4803a.setImageLevel(10000);
                    partialView2.f4804b.setImageLevel(0);
                }
                if (i8 == f7) {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(scaleRatingBar.getContext(), R$anim.srb_scale_up);
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(scaleRatingBar.getContext(), R$anim.srb_scale_down);
                    partialView2.startAnimation(animationLoadAnimation);
                    partialView2.startAnimation(animationLoadAnimation2);
                    break;
                }
                break;
        }
    }
}
