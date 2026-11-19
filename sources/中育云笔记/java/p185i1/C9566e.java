package p185i1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: i1.e */
/* loaded from: classes3.dex */
public final class C9566e implements InterfaceC9563b {
    @Override // p185i1.InterfaceC9563b
    /* renamed from: a */
    public Animator[] mo18806a(View view) {
        AbstractC9979u.m20294g(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationX", -view.getRootView().getWidth(), 0.0f);
        animator.setDuration(400L);
        animator.setInterpolator(new DecelerateInterpolator(1.8f));
        AbstractC9979u.m20293f(animator, "animator");
        return new Animator[]{animator};
    }
}
