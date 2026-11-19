package p000a.p052k.p053b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import p000a.p031h.p039f.C0217a;
import p000a.p052k.p053b.AbstractC0301c0;
import p000a.p052k.p053b.C0333s0;
import p000a.p052k.p053b.ComponentCallbacksC0320m;

/* renamed from: a.k.b.s */
/* loaded from: classes.dex */
public class C0332s extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2068a;

    /* renamed from: b */
    public final /* synthetic */ View f2069b;

    /* renamed from: c */
    public final /* synthetic */ ComponentCallbacksC0320m f2070c;

    /* renamed from: d */
    public final /* synthetic */ C0333s0.a f2071d;

    /* renamed from: e */
    public final /* synthetic */ C0217a f2072e;

    public C0332s(ViewGroup viewGroup, View view, ComponentCallbacksC0320m componentCallbacksC0320m, C0333s0.a aVar, C0217a c0217a) {
        this.f2068a = viewGroup;
        this.f2069b = view;
        this.f2070c = componentCallbacksC0320m;
        this.f2071d = aVar;
        this.f2072e = c0217a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        this.f2068a.endViewTransition(this.f2069b);
        ComponentCallbacksC0320m componentCallbacksC0320m = this.f2070c;
        ComponentCallbacksC0320m.b bVar = componentCallbacksC0320m.f1966J;
        Animator animator2 = bVar == null ? null : bVar.f2004b;
        componentCallbacksC0320m.m1173o0(null);
        if (animator2 == null || this.f2068a.indexOfChild(this.f2069b) >= 0) {
            return;
        }
        ((AbstractC0301c0.d) this.f2071d).m1067a(this.f2070c, this.f2072e);
    }
}
