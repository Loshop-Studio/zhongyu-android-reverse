package p002a1;

import android.graphics.drawable.Drawable;
import p109d1.AbstractC8910k;
import p428z0.InterfaceC11953b;

/* renamed from: a1.c */
/* loaded from: classes3.dex */
public abstract class AbstractC0032c implements InterfaceC0037h {

    /* renamed from: c */
    public final int f15c;

    /* renamed from: d */
    public final int f16d;

    /* renamed from: e */
    public InterfaceC11953b f17e;

    public AbstractC0032c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p002a1.InterfaceC0037h
    /* renamed from: a */
    public final InterfaceC11953b mo65a() {
        return this.f17e;
    }

    @Override // p002a1.InterfaceC0037h
    /* renamed from: g */
    public final void mo67g(InterfaceC0036g interfaceC0036g) {
        interfaceC0036g.mo75d(this.f15c, this.f16d);
    }

    @Override // p002a1.InterfaceC0037h
    /* renamed from: h */
    public final void mo68h(InterfaceC11953b interfaceC11953b) {
        this.f17e = interfaceC11953b;
    }

    public AbstractC0032c(int i10, int i11) {
        if (AbstractC8910k.m17490u(i10, i11)) {
            this.f15c = i10;
            this.f16d = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // p381w0.InterfaceC11652l
    public void onDestroy() {
    }

    @Override // p381w0.InterfaceC11652l
    public void onStart() {
    }

    @Override // p381w0.InterfaceC11652l
    public void onStop() {
    }

    @Override // p002a1.InterfaceC0037h
    /* renamed from: b */
    public void mo60b(Drawable drawable) {
    }

    @Override // p002a1.InterfaceC0037h
    /* renamed from: c */
    public void mo61c(Drawable drawable) {
    }

    @Override // p002a1.InterfaceC0037h
    /* renamed from: d */
    public final void mo66d(InterfaceC0036g interfaceC0036g) {
    }
}
