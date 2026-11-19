package p070b.p074b.p075a.p076a.p081d;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: b.b.a.a.d.b */
/* loaded from: classes.dex */
public class C0581b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f3555a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f3556b;

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f3557c;

    public C0581b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f3557c = baseBehavior;
        this.f3555a = coordinatorLayout;
        this.f3556b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3557c.m2111G(this.f3555a, this.f3556b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
