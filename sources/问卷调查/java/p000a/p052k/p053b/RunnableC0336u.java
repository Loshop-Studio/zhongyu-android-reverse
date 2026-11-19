package p000a.p052k.p053b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p000a.p031h.p043j.ViewTreeObserverOnPreDrawListenerC0265n;

/* renamed from: a.k.b.u */
/* loaded from: classes.dex */
public class RunnableC0336u extends AnimationSet implements Runnable {

    /* renamed from: b */
    public final ViewGroup f2096b;

    /* renamed from: c */
    public final View f2097c;

    /* renamed from: d */
    public boolean f2098d;

    /* renamed from: e */
    public boolean f2099e;

    /* renamed from: f */
    public boolean f2100f;

    public RunnableC0336u(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2100f = true;
        this.f2096b = viewGroup;
        this.f2097c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation) {
        this.f2100f = true;
        if (this.f2098d) {
            return !this.f2099e;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f2098d = true;
            ViewTreeObserverOnPreDrawListenerC0265n.m860a(this.f2096b, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation, float f2) {
        this.f2100f = true;
        if (this.f2098d) {
            return !this.f2099e;
        }
        if (!super.getTransformation(j, transformation, f2)) {
            this.f2098d = true;
            ViewTreeObserverOnPreDrawListenerC0265n.m860a(this.f2096b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2098d || !this.f2100f) {
            this.f2096b.endViewTransition(this.f2097c);
            this.f2099e = true;
        } else {
            this.f2100f = false;
            this.f2096b.post(this);
        }
    }
}
