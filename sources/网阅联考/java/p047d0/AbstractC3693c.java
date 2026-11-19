package p047d0;

import android.graphics.drawable.Drawable;
import p016c0.InterfaceC2751b;
import p062g0.AbstractC3750j;

/* renamed from: d0.c */
/* loaded from: classes2.dex */
public abstract class AbstractC3693c implements InterfaceC3698h {

    /* renamed from: a */
    public final int f4312a;

    /* renamed from: b */
    public final int f4313b;

    /* renamed from: c */
    public InterfaceC2751b f4314c;

    public AbstractC3693c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p047d0.InterfaceC3698h
    /* renamed from: a */
    public void mo4668a(Drawable drawable) {
    }

    @Override // p047d0.InterfaceC3698h
    /* renamed from: b */
    public final void mo4672b(InterfaceC3697g interfaceC3697g) {
        interfaceC3697g.mo2030e(this.f4312a, this.f4313b);
    }

    @Override // p146z.InterfaceC4697i
    /* renamed from: c */
    public void mo1732c() {
    }

    @Override // p047d0.InterfaceC3698h
    /* renamed from: d */
    public final void mo4673d(InterfaceC2751b interfaceC2751b) {
        this.f4314c = interfaceC2751b;
    }

    @Override // p047d0.InterfaceC3698h
    /* renamed from: e */
    public void mo4669e(Drawable drawable) {
    }

    @Override // p047d0.InterfaceC3698h
    /* renamed from: g */
    public final void mo4674g(InterfaceC3697g interfaceC3697g) {
    }

    @Override // p047d0.InterfaceC3698h
    /* renamed from: h */
    public final InterfaceC2751b mo4675h() {
        return this.f4314c;
    }

    @Override // p146z.InterfaceC4697i
    public void onStart() {
    }

    @Override // p146z.InterfaceC4697i
    public void onStop() {
    }

    public AbstractC3693c(int i4, int i5) {
        if (AbstractC3750j.m4787r(i4, i5)) {
            this.f4312a = i4;
            this.f4313b = i5;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i4 + " and height: " + i5);
    }
}
