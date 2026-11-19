package p081e0;

import android.graphics.drawable.Drawable;
import p069d0.InterfaceC8270b;
import p116h0.AbstractC8707k;

/* renamed from: e0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC8338c implements InterfaceC8344i {

    /* renamed from: a */
    public final int f15826a;

    /* renamed from: b */
    public final int f15827b;

    /* renamed from: c */
    public InterfaceC8270b f15828c;

    public AbstractC8338c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: c */
    public final void mo13550c(InterfaceC8343h interfaceC8343h) {
        interfaceC8343h.mo3163d(this.f15826a, this.f15827b);
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: e */
    public final InterfaceC8270b mo13551e() {
        return this.f15828c;
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: g */
    public final void mo13552g(InterfaceC8270b interfaceC8270b) {
        this.f15828c = interfaceC8270b;
    }

    public AbstractC8338c(int i10, int i11) {
        if (AbstractC8707k.m14203u(i10, i11)) {
            this.f15826a = i10;
            this.f15827b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // p001a0.InterfaceC0012l
    public void onDestroy() {
    }

    @Override // p001a0.InterfaceC0012l
    public void onStart() {
    }

    @Override // p001a0.InterfaceC0012l
    public void onStop() {
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: a */
    public void mo2815a(Drawable drawable) {
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: b */
    public final void mo13549b(InterfaceC8343h interfaceC8343h) {
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: d */
    public void mo13546d(Drawable drawable) {
    }
}
