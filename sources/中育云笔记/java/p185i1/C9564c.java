package p185i1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: i1.c */
/* loaded from: classes3.dex */
public final class C9564c implements InterfaceC9563b {

    /* renamed from: b */
    public static final a f22075b = new a(null);

    /* renamed from: a */
    public final float f22076a;

    /* renamed from: i1.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C9564c(float f10) {
        this.f22076a = f10;
    }

    @Override // p185i1.InterfaceC9563b
    /* renamed from: a */
    public Animator[] mo18806a(View view) {
        AbstractC9979u.m20294g(view, "view");
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(view, "scaleX", this.f22076a, 1.0f);
        scaleX.setDuration(300L);
        scaleX.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(view, "scaleY", this.f22076a, 1.0f);
        scaleY.setDuration(300L);
        scaleY.setInterpolator(new DecelerateInterpolator());
        AbstractC9979u.m20293f(scaleX, "scaleX");
        AbstractC9979u.m20293f(scaleY, "scaleY");
        return new Animator[]{scaleX, scaleY};
    }

    public /* synthetic */ C9564c(float f10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0.5f : f10);
    }
}
