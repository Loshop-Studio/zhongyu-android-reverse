package p000a.p052k.p053b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p000a.p052k.p053b.C0300c;

/* renamed from: a.k.b.f */
/* loaded from: classes.dex */
public class AnimationAnimationListenerC0306f implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f1862a;

    /* renamed from: b */
    public final /* synthetic */ View f1863b;

    /* renamed from: c */
    public final /* synthetic */ C0300c.b f1864c;

    /* renamed from: a.k.b.f$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AnimationAnimationListenerC0306f animationAnimationListenerC0306f = AnimationAnimationListenerC0306f.this;
            animationAnimationListenerC0306f.f1862a.endViewTransition(animationAnimationListenerC0306f.f1863b);
            AnimationAnimationListenerC0306f.this.f1864c.m1002a();
        }
    }

    public AnimationAnimationListenerC0306f(C0300c c0300c, ViewGroup viewGroup, View view, C0300c.b bVar) {
        this.f1862a = viewGroup;
        this.f1863b = view;
        this.f1864c = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f1862a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
