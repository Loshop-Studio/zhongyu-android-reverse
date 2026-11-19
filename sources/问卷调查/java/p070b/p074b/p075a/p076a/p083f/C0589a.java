package p070b.p074b.p075a.p076a.p083f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: b.b.a.a.f.a */
/* loaded from: classes.dex */
public class C0589a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f3587a;

    public C0589a(BottomAppBar bottomAppBar) {
        this.f3587a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        BottomAppBar.m2613v(this.f3587a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f3587a.f4821T++;
    }
}
