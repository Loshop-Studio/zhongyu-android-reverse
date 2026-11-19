package p185i1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: i1.a */
/* loaded from: classes3.dex */
public final class C9562a implements InterfaceC9563b {

    /* renamed from: b */
    public static final a f22073b = new a(null);

    /* renamed from: a */
    public final float f22074a;

    /* renamed from: i1.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C9562a(float f10) {
        this.f22074a = f10;
    }

    @Override // p185i1.InterfaceC9563b
    /* renamed from: a */
    public Animator[] mo18806a(View view) {
        AbstractC9979u.m20294g(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "alpha", this.f22074a, 1.0f);
        animator.setDuration(300L);
        animator.setInterpolator(new LinearInterpolator());
        AbstractC9979u.m20293f(animator, "animator");
        return new Animator[]{animator};
    }

    public /* synthetic */ C9562a(float f10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0.0f : f10);
    }
}
