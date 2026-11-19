package p125p0;

import p016b1.AbstractC4408j;
import p067h0.InterfaceC6440j;

/* renamed from: p0.b */
/* loaded from: classes3.dex */
public class C7589b implements InterfaceC6440j {

    /* renamed from: a */
    public final byte[] f10047a;

    public C7589b(byte[] bArr) {
        this.f10047a = (byte[]) AbstractC4408j.m1438d(bArr);
    }

    @Override // p067h0.InterfaceC6440j
    /* renamed from: a */
    public Class mo2749a() {
        return byte[].class;
    }

    @Override // p067h0.InterfaceC6440j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f10047a;
    }

    @Override // p067h0.InterfaceC6440j
    public int getSize() {
        return this.f10047a.length;
    }

    @Override // p067h0.InterfaceC6440j
    public void recycle() {
    }
}
