package p210z2;

import android.animation.Animator;
import com.xuexiang.xui.widget.layout.ExpandableLayout;

/* renamed from: z2.a */
/* loaded from: classes3.dex */
public final class C6810a implements Animator.AnimatorListener {

    /* renamed from: a */
    public final int f11490a;

    /* renamed from: b */
    public boolean f11491b;

    /* renamed from: c */
    public final /* synthetic */ ExpandableLayout f11492c;

    public C6810a(ExpandableLayout expandableLayout, int i) {
        this.f11492c = expandableLayout;
        this.f11490a = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f11491b = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f11491b) {
            return;
        }
        int i = this.f11490a;
        int i8 = i == 0 ? 0 : 3;
        ExpandableLayout expandableLayout = this.f11492c;
        expandableLayout.f4520e = i8;
        expandableLayout.setExpansion(i);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f11492c.f4520e = this.f11490a == 0 ? 1 : 2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
