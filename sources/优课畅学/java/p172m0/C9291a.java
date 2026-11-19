package p172m0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: m0.a */
/* loaded from: classes3.dex */
public final class C9291a implements InterfaceC9292b {

    /* renamed from: b */
    public static final a f18313b = new a(null);

    /* renamed from: a */
    public final float f18314a;

    /* renamed from: m0.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public C9291a(float f10) {
        this.f18314a = f10;
    }

    @Override // p172m0.InterfaceC9292b
    /* renamed from: a */
    public Animator[] mo17095a(View view) {
        AbstractC9133u.m16133g(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "alpha", this.f18314a, 1.0f);
        animator.setDuration(300L);
        animator.setInterpolator(new LinearInterpolator());
        AbstractC9133u.m16132f(animator, "animator");
        return new Animator[]{animator};
    }

    public /* synthetic */ C9291a(float f10, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? 0.0f : f10);
    }
}
