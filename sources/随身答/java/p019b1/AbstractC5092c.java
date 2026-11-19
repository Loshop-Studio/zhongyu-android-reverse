package p019b1;

import android.graphics.drawable.Drawable;
import p002a1.InterfaceC0010b;
import p091e1.AbstractC7838j;

/* renamed from: b1.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5092c implements InterfaceC5097h {

    /* renamed from: a */
    public final int f2190a;

    /* renamed from: b */
    public final int f2191b;

    /* renamed from: c */
    public InterfaceC0010b f2192c;

    public AbstractC5092c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p019b1.InterfaceC5097h
    /* renamed from: a */
    public final InterfaceC0010b mo2137a() {
        return this.f2192c;
    }

    @Override // p019b1.InterfaceC5097h
    /* renamed from: d */
    public final void mo2138d(InterfaceC0010b interfaceC0010b) {
        this.f2192c = interfaceC0010b;
    }

    @Override // p019b1.InterfaceC5097h
    /* renamed from: h */
    public final void mo2140h(InterfaceC5096g interfaceC5096g) {
        interfaceC5096g.mo2147d(this.f2190a, this.f2191b);
    }

    public AbstractC5092c(int i9, int i10) {
        if (AbstractC7838j.m12275r(i9, i10)) {
            this.f2190a = i9;
            this.f2191b = i10;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i9 + " and height: " + i10);
    }

    @Override // p288x0.InterfaceC9856i
    public void onDestroy() {
    }

    @Override // p288x0.InterfaceC9856i
    public void onStart() {
    }

    @Override // p288x0.InterfaceC9856i
    public void onStop() {
    }

    @Override // p019b1.InterfaceC5097h
    /* renamed from: b */
    public void mo2132b(Drawable drawable) {
    }

    @Override // p019b1.InterfaceC5097h
    /* renamed from: e */
    public final void mo2139e(InterfaceC5096g interfaceC5096g) {
    }

    @Override // p019b1.InterfaceC5097h
    /* renamed from: f */
    public void mo2133f(Drawable drawable) {
    }
}
