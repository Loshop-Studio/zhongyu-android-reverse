package p188y0;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p195z0.InterfaceC7930b;

/* renamed from: y0.e */
/* loaded from: classes3.dex */
public abstract class AbstractC7891e extends AbstractC7895i implements InterfaceC7930b.a {

    /* renamed from: h */
    public Animatable f10612h;

    public AbstractC7891e(ImageView imageView) {
        super(imageView);
    }

    @Override // p188y0.AbstractC7887a, p188y0.InterfaceC7894h
    /* renamed from: b */
    public void mo9677b(Drawable drawable) {
        super.mo9677b(drawable);
        m9688r(null);
        m9687p(drawable);
    }

    @Override // p188y0.InterfaceC7894h
    /* renamed from: c */
    public void mo2882c(Object obj, InterfaceC7930b interfaceC7930b) {
        if (interfaceC7930b == null || !interfaceC7930b.mo9733a(obj, this)) {
            m9688r(obj);
        } else {
            m9686o(obj);
        }
    }

    @Override // p188y0.AbstractC7895i, p188y0.AbstractC7887a, p188y0.InterfaceC7894h
    /* renamed from: e */
    public void mo9678e(Drawable drawable) {
        super.mo9678e(drawable);
        m9688r(null);
        m9687p(drawable);
    }

    @Override // p188y0.AbstractC7895i, p188y0.AbstractC7887a, p188y0.InterfaceC7894h
    /* renamed from: f */
    public void mo2883f(Drawable drawable) {
        super.mo2883f(drawable);
        Animatable animatable = this.f10612h;
        if (animatable != null) {
            animatable.stop();
        }
        m9688r(null);
        m9687p(drawable);
    }

    /* renamed from: o */
    public final void m9686o(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f10612h = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f10612h = animatable;
        animatable.start();
    }

    @Override // p160u0.InterfaceC7759l
    public void onStart() {
        Animatable animatable = this.f10612h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p160u0.InterfaceC7759l
    public void onStop() {
        Animatable animatable = this.f10612h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: p */
    public void m9687p(Drawable drawable) {
        ((ImageView) this.f10615a).setImageDrawable(drawable);
    }

    /* renamed from: q */
    public abstract void mo9679q(Object obj);

    /* renamed from: r */
    public final void m9688r(Object obj) {
        mo9679q(obj);
        m9686o(obj);
    }
}
