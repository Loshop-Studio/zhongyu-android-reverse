package p019b1;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p030c1.InterfaceC5220b;

/* renamed from: b1.e */
/* loaded from: classes3.dex */
public abstract class AbstractC5094e extends AbstractC5098i implements InterfaceC5220b.a {

    /* renamed from: h */
    public Animatable f2193h;

    public AbstractC5094e(ImageView imageView) {
        super(imageView);
    }

    @Override // p019b1.AbstractC5090a, p019b1.InterfaceC5097h
    /* renamed from: b */
    public void mo2132b(Drawable drawable) {
        super.mo2132b(drawable);
        m2145p(null);
        m2144n(drawable);
    }

    @Override // p019b1.InterfaceC5097h
    /* renamed from: c */
    public void mo2142c(Object obj, InterfaceC5220b interfaceC5220b) {
        if (interfaceC5220b == null || !interfaceC5220b.mo2311a(obj, this)) {
            m2145p(obj);
        } else {
            m2143m(obj);
        }
    }

    @Override // p019b1.AbstractC5098i, p019b1.AbstractC5090a, p019b1.InterfaceC5097h
    /* renamed from: f */
    public void mo2133f(Drawable drawable) {
        super.mo2133f(drawable);
        m2145p(null);
        m2144n(drawable);
    }

    @Override // p019b1.AbstractC5098i, p019b1.AbstractC5090a, p019b1.InterfaceC5097h
    /* renamed from: g */
    public void mo2134g(Drawable drawable) {
        super.mo2134g(drawable);
        Animatable animatable = this.f2193h;
        if (animatable != null) {
            animatable.stop();
        }
        m2145p(null);
        m2144n(drawable);
    }

    /* renamed from: m */
    public final void m2143m(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f2193h = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f2193h = animatable;
        animatable.start();
    }

    /* renamed from: n */
    public void m2144n(Drawable drawable) {
        ((ImageView) this.f2196a).setImageDrawable(drawable);
    }

    /* renamed from: o */
    public abstract void mo2135o(Object obj);

    @Override // p288x0.InterfaceC9856i
    public void onStart() {
        Animatable animatable = this.f2193h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p288x0.InterfaceC9856i
    public void onStop() {
        Animatable animatable = this.f2193h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: p */
    public final void m2145p(Object obj) {
        mo2135o(obj);
        m2143m(obj);
    }
}
