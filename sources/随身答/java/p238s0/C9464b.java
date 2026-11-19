package p238s0;

import p091e1.AbstractC7837i;
import p152k0.InterfaceC8259j;

/* renamed from: s0.b */
/* loaded from: classes3.dex */
public class C9464b implements InterfaceC8259j {

    /* renamed from: a */
    public final byte[] f16495a;

    public C9464b(byte[] bArr) {
        this.f16495a = (byte[]) AbstractC7837i.m12256d(bArr);
    }

    @Override // p152k0.InterfaceC8259j
    /* renamed from: a */
    public Class mo3221a() {
        return byte[].class;
    }

    @Override // p152k0.InterfaceC8259j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f16495a;
    }

    @Override // p152k0.InterfaceC8259j
    public int getSize() {
        return this.f16495a.length;
    }

    @Override // p152k0.InterfaceC8259j
    public void recycle() {
    }
}
