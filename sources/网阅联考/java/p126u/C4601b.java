package p126u;

import p062g0.AbstractC3749i;
import p093m.InterfaceC4361j;

/* renamed from: u.b */
/* loaded from: classes2.dex */
public class C4601b implements InterfaceC4361j {

    /* renamed from: a */
    public final byte[] f5804a;

    public C4601b(byte[] bArr) {
        this.f5804a = (byte[]) AbstractC3749i.m4768d(bArr);
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f5804a;
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: b */
    public Class mo1898b() {
        return byte[].class;
    }

    @Override // p093m.InterfaceC4361j
    public int getSize() {
        return this.f5804a.length;
    }

    @Override // p093m.InterfaceC4361j
    public void recycle() {
    }
}
