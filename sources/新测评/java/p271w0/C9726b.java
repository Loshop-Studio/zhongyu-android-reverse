package p271w0;

import p117i1.AbstractC7651j;
import p184o0.InterfaceC8690j;

/* renamed from: w0.b */
/* loaded from: classes3.dex */
public class C9726b implements InterfaceC8690j {

    /* renamed from: a */
    public final byte[] f17061a;

    public C9726b(byte[] bArr) {
        this.f17061a = (byte[]) AbstractC7651j.m12683d(bArr);
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: a */
    public Class mo3569a() {
        return byte[].class;
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f17061a;
    }

    @Override // p184o0.InterfaceC8690j
    public int getSize() {
        return this.f17061a.length;
    }

    @Override // p184o0.InterfaceC8690j
    public void recycle() {
    }
}
