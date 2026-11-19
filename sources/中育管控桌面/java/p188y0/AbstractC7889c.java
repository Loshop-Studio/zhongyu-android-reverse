package p188y0;

import android.graphics.drawable.Drawable;
import p016b1.AbstractC4409k;
import p181x0.InterfaceC7824b;

/* renamed from: y0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7889c implements InterfaceC7894h {

    /* renamed from: a */
    public final int f10609a;

    /* renamed from: b */
    public final int f10610b;

    /* renamed from: c */
    public InterfaceC7824b f10611c;

    public AbstractC7889c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p188y0.InterfaceC7894h
    /* renamed from: a */
    public final InterfaceC7824b mo9681a() {
        return this.f10611c;
    }

    @Override // p188y0.InterfaceC7894h
    /* renamed from: g */
    public final void mo9682g(InterfaceC7893g interfaceC7893g) {
        interfaceC7893g.mo2899d(this.f10609a, this.f10610b);
    }

    @Override // p188y0.InterfaceC7894h
    /* renamed from: h */
    public final void mo9683h(InterfaceC7824b interfaceC7824b) {
        this.f10611c = interfaceC7824b;
    }

    public AbstractC7889c(int i6, int i7) {
        if (AbstractC4409k.m1459t(i6, i7)) {
            this.f10609a = i6;
            this.f10610b = i7;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i6 + " and height: " + i7);
    }

    @Override // p160u0.InterfaceC7759l
    /* renamed from: d */
    public void mo2533d() {
    }

    @Override // p160u0.InterfaceC7759l
    public void onStart() {
    }

    @Override // p160u0.InterfaceC7759l
    public void onStop() {
    }

    @Override // p188y0.InterfaceC7894h
    /* renamed from: b */
    public void mo9677b(Drawable drawable) {
    }

    @Override // p188y0.InterfaceC7894h
    /* renamed from: e */
    public void mo9678e(Drawable drawable) {
    }

    @Override // p188y0.InterfaceC7894h
    /* renamed from: i */
    public final void mo9684i(InterfaceC7893g interfaceC7893g) {
    }
}
