package p270v;

import p116h0.AbstractC8706j;
import p182n.InterfaceC9357j;

/* renamed from: v.b */
/* loaded from: classes3.dex */
public class C10237b implements InterfaceC9357j {

    /* renamed from: a */
    public final byte[] f20427a;

    public C10237b(byte[] bArr) {
        this.f20427a = (byte[]) AbstractC8706j.m14181d(bArr);
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f20427a;
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: b */
    public Class mo3016b() {
        return byte[].class;
    }

    @Override // p182n.InterfaceC9357j
    public int getSize() {
        return this.f20427a.length;
    }

    @Override // p182n.InterfaceC9357j
    public void recycle() {
    }
}
