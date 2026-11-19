package p084f1;

import android.graphics.drawable.Drawable;
import p073e1.InterfaceC7325b;
import p117i1.AbstractC7652k;

/* renamed from: f1.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7426c implements InterfaceC7431h {

    /* renamed from: a */
    public final int f12130a;

    /* renamed from: b */
    public final int f12131b;

    /* renamed from: c */
    public InterfaceC7325b f12132c;

    public AbstractC7426c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p084f1.InterfaceC7431h
    /* renamed from: a */
    public final InterfaceC7325b mo11957a() {
        return this.f12132c;
    }

    @Override // p084f1.InterfaceC7431h
    /* renamed from: c */
    public final void mo11958c(InterfaceC7325b interfaceC7325b) {
        this.f12132c = interfaceC7325b;
    }

    @Override // p084f1.InterfaceC7431h
    /* renamed from: h */
    public final void mo11960h(InterfaceC7430g interfaceC7430g) {
        interfaceC7430g.mo3719d(this.f12130a, this.f12131b);
    }

    public AbstractC7426c(int i10, int i11) {
        if (AbstractC7652k.m12704t(i10, i11)) {
            this.f12130a = i10;
            this.f12131b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // p020b1.InterfaceC4953l
    public void onDestroy() {
    }

    @Override // p020b1.InterfaceC4953l
    public void onStart() {
    }

    @Override // p020b1.InterfaceC4953l
    public void onStop() {
    }

    @Override // p084f1.InterfaceC7431h
    /* renamed from: b */
    public void mo11953b(Drawable drawable) {
    }

    @Override // p084f1.InterfaceC7431h
    /* renamed from: e */
    public void mo11954e(Drawable drawable) {
    }

    @Override // p084f1.InterfaceC7431h
    /* renamed from: g */
    public final void mo11959g(InterfaceC7430g interfaceC7430g) {
    }
}
