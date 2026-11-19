package p047d0;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p052e0.InterfaceC3722b;

/* renamed from: d0.e */
/* loaded from: classes2.dex */
public abstract class AbstractC3695e extends AbstractC3699i implements InterfaceC3722b.a {

    /* renamed from: h */
    public Animatable f4315h;

    public AbstractC3695e(ImageView imageView) {
        super(imageView);
    }

    @Override // p047d0.AbstractC3691a, p047d0.InterfaceC3698h
    /* renamed from: a */
    public void mo4668a(Drawable drawable) {
        super.mo4668a(drawable);
        m4679q(null);
        m4678o(drawable);
    }

    @Override // p047d0.AbstractC3699i, p047d0.AbstractC3691a, p047d0.InterfaceC3698h
    /* renamed from: e */
    public void mo4669e(Drawable drawable) {
        super.mo4669e(drawable);
        m4679q(null);
        m4678o(drawable);
    }

    @Override // p047d0.InterfaceC3698h
    /* renamed from: f */
    public void mo2003f(Object obj, InterfaceC3722b interfaceC3722b) {
        if (interfaceC3722b == null || !interfaceC3722b.mo4722a(obj, this)) {
            m4679q(obj);
        } else {
            m4677n(obj);
        }
    }

    @Override // p047d0.AbstractC3699i, p047d0.AbstractC3691a, p047d0.InterfaceC3698h
    /* renamed from: i */
    public void mo2004i(Drawable drawable) {
        super.mo2004i(drawable);
        Animatable animatable = this.f4315h;
        if (animatable != null) {
            animatable.stop();
        }
        m4679q(null);
        m4678o(drawable);
    }

    /* renamed from: n */
    public final void m4677n(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f4315h = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f4315h = animatable;
        animatable.start();
    }

    /* renamed from: o */
    public void m4678o(Drawable drawable) {
        ((ImageView) this.f4318a).setImageDrawable(drawable);
    }

    @Override // p146z.InterfaceC4697i
    public void onStart() {
        Animatable animatable = this.f4315h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p146z.InterfaceC4697i
    public void onStop() {
        Animatable animatable = this.f4315h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: p */
    public abstract void mo4670p(Object obj);

    /* renamed from: q */
    public final void m4679q(Object obj) {
        mo4670p(obj);
        m4677n(obj);
    }
}
