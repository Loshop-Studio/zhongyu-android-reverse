package p070b.p074b.p075a.p076a.p081d;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;
import p070b.p074b.p075a.p076a.p101w.C0675g;

/* renamed from: b.b.a.a.d.a */
/* loaded from: classes.dex */
public class C0580a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0675g f3554a;

    public C0580a(AppBarLayout appBarLayout, C0675g c0675g) {
        this.f3554a = c0675g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3554a.m2295o(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
