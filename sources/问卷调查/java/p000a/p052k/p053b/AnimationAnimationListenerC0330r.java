package p000a.p052k.p053b;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p000a.p031h.p039f.C0217a;
import p000a.p052k.p053b.AbstractC0301c0;
import p000a.p052k.p053b.C0333s0;

/* renamed from: a.k.b.r */
/* loaded from: classes.dex */
public class AnimationAnimationListenerC0330r implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2051a;

    /* renamed from: b */
    public final /* synthetic */ ComponentCallbacksC0320m f2052b;

    /* renamed from: c */
    public final /* synthetic */ C0333s0.a f2053c;

    /* renamed from: d */
    public final /* synthetic */ C0217a f2054d;

    /* renamed from: a.k.b.r$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            if (AnimationAnimationListenerC0330r.this.f2052b.m1160i() != null) {
                AnimationAnimationListenerC0330r.this.f2052b.m1169m0(null);
                AnimationAnimationListenerC0330r animationAnimationListenerC0330r = AnimationAnimationListenerC0330r.this;
                ((AbstractC0301c0.d) animationAnimationListenerC0330r.f2053c).m1067a(animationAnimationListenerC0330r.f2052b, animationAnimationListenerC0330r.f2054d);
            }
        }
    }

    public AnimationAnimationListenerC0330r(ViewGroup viewGroup, ComponentCallbacksC0320m componentCallbacksC0320m, C0333s0.a aVar, C0217a c0217a) {
        this.f2051a = viewGroup;
        this.f2052b = componentCallbacksC0320m;
        this.f2053c = aVar;
        this.f2054d = c0217a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f2051a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
