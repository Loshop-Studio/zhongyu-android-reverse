package p000a.p052k.p053b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p000a.p052k.p053b.AbstractC0347z0;
import p000a.p052k.p053b.C0300c;

/* renamed from: a.k.b.d */
/* loaded from: classes.dex */
public class C0302d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f1848a;

    /* renamed from: b */
    public final /* synthetic */ View f1849b;

    /* renamed from: c */
    public final /* synthetic */ boolean f1850c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0347z0.d f1851d;

    /* renamed from: e */
    public final /* synthetic */ C0300c.b f1852e;

    public C0302d(C0300c c0300c, ViewGroup viewGroup, View view, boolean z, AbstractC0347z0.d dVar, C0300c.b bVar) {
        this.f1848a = viewGroup;
        this.f1849b = view;
        this.f1850c = z;
        this.f1851d = dVar;
        this.f1852e = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1848a.endViewTransition(this.f1849b);
        if (this.f1850c) {
            this.f1851d.f2135a.m1263a(this.f1849b);
        }
        this.f1852e.m1002a();
    }
}
