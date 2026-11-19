package p141f2;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* renamed from: f2.a */
/* loaded from: classes3.dex */
public final class C9164a {

    /* renamed from: a */
    public static final C9164a f21403a = new C9164a();

    /* renamed from: a */
    public final void m18054a(View view, long j10, int i10) {
        AlphaAnimation alphaAnimation = i10 == 0 ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j10);
        alphaAnimation.setFillAfter(true);
        if (view != null) {
            view.startAnimation(alphaAnimation);
        }
    }

    /* renamed from: b */
    public final void m18055b(View view, float f10, float f11, long j10) {
        ScaleAnimation scaleAnimation;
        if (view != null) {
            if (view.getAlpha() == 1.0f) {
                view.setAlpha(0.5f);
                scaleAnimation = new ScaleAnimation(f10, f11, f10, f11, view.getWidth() / 2.0f, (view.getHeight() / 2.0f) + 30.0f);
            } else {
                view.setAlpha(1.0f);
                scaleAnimation = new ScaleAnimation(f11, f10, f11, f10, view.getWidth() / 2.0f, (view.getHeight() / 2.0f) + 30.0f);
            }
            scaleAnimation.setDuration(j10);
            scaleAnimation.setFillAfter(true);
            view.startAnimation(scaleAnimation);
        }
    }

    /* renamed from: c */
    public final void m18056c(long j10, boolean z10, View[] view, InterfaceC9529a callback) {
        AbstractC9979u.m20294g(view, "view");
        AbstractC9979u.m20294g(callback, "callback");
        TranslateAnimation translateAnimation = z10 ? new TranslateAnimation(0.0f, -view[0].getWidth(), 0.0f, 0.0f) : new TranslateAnimation(-view[0].getWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(j10);
        translateAnimation.setFillAfter(false);
        for (View view2 : view) {
            view2.startAnimation(translateAnimation);
        }
        translateAnimation.setAnimationListener(new a(callback));
    }

    /* renamed from: f2.a$a */
    public static final class a implements Animation.AnimationListener {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9529a f21404c;

        public a(InterfaceC9529a interfaceC9529a) {
            this.f21404c = interfaceC9529a;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f21404c.invoke();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
