package p070b.p074b.p075a.p076a.p083f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: b.b.a.a.f.d */
/* loaded from: classes.dex */
public class C0592d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f3592a;

    /* renamed from: b */
    public final /* synthetic */ ActionMenuView f3593b;

    /* renamed from: c */
    public final /* synthetic */ int f3594c;

    /* renamed from: d */
    public final /* synthetic */ boolean f3595d;

    /* renamed from: e */
    public final /* synthetic */ BottomAppBar f3596e;

    public C0592d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f3596e = bottomAppBar;
        this.f3593b = actionMenuView;
        this.f3594c = i;
        this.f3595d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f3592a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f3592a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f3596e;
        ActionMenuView actionMenuView = this.f3593b;
        int i = this.f3594c;
        boolean z = this.f3595d;
        int i2 = BottomAppBar.f4815W;
        actionMenuView.setTranslationX(bottomAppBar.m2620z(actionMenuView, i, z));
    }
}
