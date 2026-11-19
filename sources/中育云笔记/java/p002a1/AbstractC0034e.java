package p002a1;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p027b1.InterfaceC5142b;

/* renamed from: a1.e */
/* loaded from: classes3.dex */
public abstract class AbstractC0034e extends AbstractC0038i implements InterfaceC5142b.a {

    /* renamed from: j */
    public Animatable f18j;

    public AbstractC0034e(ImageView imageView) {
        super(imageView);
    }

    @Override // p002a1.AbstractC0030a, p002a1.InterfaceC0037h
    /* renamed from: b */
    public void mo60b(Drawable drawable) {
        super.mo60b(drawable);
        m73p(null);
        m72n(drawable);
    }

    @Override // p002a1.AbstractC0038i, p002a1.AbstractC0030a, p002a1.InterfaceC0037h
    /* renamed from: c */
    public void mo61c(Drawable drawable) {
        super.mo61c(drawable);
        m73p(null);
        m72n(drawable);
    }

    @Override // p002a1.AbstractC0038i, p002a1.AbstractC0030a, p002a1.InterfaceC0037h
    /* renamed from: e */
    public void mo62e(Drawable drawable) {
        super.mo62e(drawable);
        Animatable animatable = this.f18j;
        if (animatable != null) {
            animatable.stop();
        }
        m73p(null);
        m72n(drawable);
    }

    @Override // p002a1.InterfaceC0037h
    /* renamed from: f */
    public void mo70f(Object obj, InterfaceC5142b interfaceC5142b) {
        if (interfaceC5142b == null || !interfaceC5142b.mo2659a(obj, this)) {
            m73p(obj);
        } else {
            m71m(obj);
        }
    }

    /* renamed from: m */
    public final void m71m(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f18j = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f18j = animatable;
        animatable.start();
    }

    /* renamed from: n */
    public void m72n(Drawable drawable) {
        ((ImageView) this.f21c).setImageDrawable(drawable);
    }

    /* renamed from: o */
    public abstract void mo63o(Object obj);

    @Override // p381w0.InterfaceC11652l
    public void onStart() {
        Animatable animatable = this.f18j;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p381w0.InterfaceC11652l
    public void onStop() {
        Animatable animatable = this.f18j;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: p */
    public final void m73p(Object obj) {
        mo63o(obj);
        m71m(obj);
    }
}
