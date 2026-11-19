package p070b.p074b.p075a.p076a.p084g;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p070b.p074b.p075a.p076a.p101w.C0675g;

/* renamed from: b.b.a.a.g.a */
/* loaded from: classes.dex */
public class C0595a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f3602a;

    public C0595a(BottomSheetBehavior bottomSheetBehavior) {
        this.f3602a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C0675g c0675g = this.f3602a.f4854i;
        if (c0675g != null) {
            c0675g.m2297q(fFloatValue);
        }
    }
}
