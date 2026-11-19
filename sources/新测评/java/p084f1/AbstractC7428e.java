package p084f1;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p095g1.InterfaceC7509b;

/* renamed from: f1.e */
/* loaded from: classes3.dex */
public abstract class AbstractC7428e extends AbstractC7432i implements InterfaceC7509b.a {

    /* renamed from: h */
    public Animatable f12133h;

    public AbstractC7428e(ImageView imageView) {
        super(imageView);
    }

    @Override // p084f1.AbstractC7424a, p084f1.InterfaceC7431h
    /* renamed from: b */
    public void mo11953b(Drawable drawable) {
        super.mo11953b(drawable);
        m11964p(null);
        m11963n(drawable);
    }

    @Override // p084f1.InterfaceC7431h
    /* renamed from: d */
    public void mo3702d(Object obj, InterfaceC7509b interfaceC7509b) {
        if (interfaceC7509b == null || !interfaceC7509b.mo12216a(obj, this)) {
            m11964p(obj);
        } else {
            m11962m(obj);
        }
    }

    @Override // p084f1.AbstractC7432i, p084f1.AbstractC7424a, p084f1.InterfaceC7431h
    /* renamed from: e */
    public void mo11954e(Drawable drawable) {
        super.mo11954e(drawable);
        m11964p(null);
        m11963n(drawable);
    }

    @Override // p084f1.AbstractC7432i, p084f1.AbstractC7424a, p084f1.InterfaceC7431h
    /* renamed from: f */
    public void mo3703f(Drawable drawable) {
        super.mo3703f(drawable);
        Animatable animatable = this.f12133h;
        if (animatable != null) {
            animatable.stop();
        }
        m11964p(null);
        m11963n(drawable);
    }

    /* renamed from: m */
    public final void m11962m(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f12133h = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f12133h = animatable;
        animatable.start();
    }

    /* renamed from: n */
    public void m11963n(Drawable drawable) {
        ((ImageView) this.f12136a).setImageDrawable(drawable);
    }

    /* renamed from: o */
    public abstract void mo11955o(Object obj);

    @Override // p020b1.InterfaceC4953l
    public void onStart() {
        Animatable animatable = this.f12133h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p020b1.InterfaceC4953l
    public void onStop() {
        Animatable animatable = this.f12133h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: p */
    public final void m11964p(Object obj) {
        mo11955o(obj);
        m11962m(obj);
    }
}
