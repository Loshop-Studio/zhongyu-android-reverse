package p070b.p074b.p075a.p076a.p083f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: b.b.a.a.f.c */
/* loaded from: classes.dex */
public class C0591c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f3591a;

    public C0591c(BottomAppBar bottomAppBar) {
        this.f3591a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        BottomAppBar.m2613v(this.f3591a);
        this.f3591a.f4817P = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3591a.f4821T++;
    }
}
