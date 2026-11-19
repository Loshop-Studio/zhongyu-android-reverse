package p313r0;

import p109d1.AbstractC8909j;
import p198j0.InterfaceC9657j;

/* renamed from: r0.b */
/* loaded from: classes3.dex */
public class C10833b implements InterfaceC9657j {

    /* renamed from: c */
    public final byte[] f26144c;

    public C10833b(byte[] bArr) {
        this.f26144c = (byte[]) AbstractC8909j.m17468d(bArr);
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: a */
    public Class mo4219a() {
        return byte[].class;
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f26144c;
    }

    @Override // p198j0.InterfaceC9657j
    public int getSize() {
        return this.f26144c.length;
    }

    @Override // p198j0.InterfaceC9657j
    public void recycle() {
    }
}
