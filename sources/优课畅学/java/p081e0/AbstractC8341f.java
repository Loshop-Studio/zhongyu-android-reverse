package p081e0;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p093f0.InterfaceC8404b;

/* renamed from: e0.f */
/* loaded from: classes3.dex */
public abstract class AbstractC8341f extends AbstractC8345j implements InterfaceC8404b.a {

    /* renamed from: h */
    public Animatable f15841h;

    public AbstractC8341f(ImageView imageView) {
        super(imageView);
    }

    @Override // p081e0.AbstractC8336a, p081e0.InterfaceC8344i
    /* renamed from: a */
    public void mo2815a(Drawable drawable) {
        super.mo2815a(drawable);
        m13572p(null);
        m13571n(drawable);
    }

    @Override // p081e0.AbstractC8345j, p081e0.AbstractC8336a, p081e0.InterfaceC8344i
    /* renamed from: d */
    public void mo13546d(Drawable drawable) {
        super.mo13546d(drawable);
        m13572p(null);
        m13571n(drawable);
    }

    @Override // p081e0.AbstractC8345j, p081e0.AbstractC8336a, p081e0.InterfaceC8344i
    /* renamed from: f */
    public void mo3147f(Drawable drawable) {
        super.mo3147f(drawable);
        Animatable animatable = this.f15841h;
        if (animatable != null) {
            animatable.stop();
        }
        m13572p(null);
        m13571n(drawable);
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: h */
    public void mo2816h(Object obj, InterfaceC8404b interfaceC8404b) {
        if (interfaceC8404b == null || !interfaceC8404b.mo13698a(obj, this)) {
            m13572p(obj);
        } else {
            m13570m(obj);
        }
    }

    /* renamed from: m */
    public final void m13570m(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f15841h = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f15841h = animatable;
        animatable.start();
    }

    /* renamed from: n */
    public void m13571n(Drawable drawable) {
        ((ImageView) this.f15844a).setImageDrawable(drawable);
    }

    /* renamed from: o */
    public abstract void mo13547o(Object obj);

    @Override // p001a0.InterfaceC0012l
    public void onStart() {
        Animatable animatable = this.f15841h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p001a0.InterfaceC0012l
    public void onStop() {
        Animatable animatable = this.f15841h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: p */
    public final void m13572p(Object obj) {
        mo13547o(obj);
        m13570m(obj);
    }
}
