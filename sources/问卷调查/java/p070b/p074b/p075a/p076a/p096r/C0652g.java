package p070b.p074b.p075a.p076a.p096r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: b.b.a.a.r.g */
/* loaded from: classes.dex */
public final class C0652g {

    /* renamed from: a */
    public final ArrayList<b> f3933a = new ArrayList<>();

    /* renamed from: b */
    public b f3934b = null;

    /* renamed from: c */
    public ValueAnimator f3935c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f3936d = new a();

    /* renamed from: b.b.a.a.r.g$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0652g c0652g = C0652g.this;
            if (c0652g.f3935c == animator) {
                c0652g.f3935c = null;
            }
        }
    }

    /* renamed from: b.b.a.a.r.g$b */
    public static class b {

        /* renamed from: a */
        public final int[] f3938a;

        /* renamed from: b */
        public final ValueAnimator f3939b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f3938a = iArr;
            this.f3939b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void m2262a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f3936d);
        this.f3933a.add(bVar);
    }
}
