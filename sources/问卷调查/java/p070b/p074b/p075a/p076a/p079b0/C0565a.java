package p070b.p074b.p075a.p076a.p079b0;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* renamed from: b.b.a.a.b0.a */
/* loaded from: classes.dex */
public class C0565a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f3530a;

    public C0565a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f3530a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3530a.invalidate();
    }
}
