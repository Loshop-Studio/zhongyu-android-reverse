package androidx.room;

import java.util.ArrayList;
import java.util.List;
import p149s0.InterfaceC3373d;

/* renamed from: androidx.room.c0 */
/* loaded from: classes.dex */
final class C0611c0 implements InterfaceC3373d {

    /* renamed from: a */
    private List<Object> f3933a = new ArrayList();

    C0611c0() {
    }

    /* renamed from: b */
    private void m3485b(int i4, Object obj) {
        int i5 = i4 - 1;
        if (i5 >= this.f3933a.size()) {
            for (int size = this.f3933a.size(); size <= i5; size++) {
                this.f3933a.add(null);
            }
        }
        this.f3933a.set(i5, obj);
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: C */
    public void mo3486C(int i4, byte[] bArr) {
        m3485b(i4, bArr);
    }

    /* renamed from: a */
    List<Object> m3487a() {
        return this.f3933a;
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: c */
    public void mo3488c(int i4, String str) {
        m3485b(i4, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: k */
    public void mo3489k(int i4) {
        m3485b(i4, null);
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: l */
    public void mo3490l(int i4, double d4) {
        m3485b(i4, Double.valueOf(d4));
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: w */
    public void mo3491w(int i4, long j4) {
        m3485b(i4, Long.valueOf(j4));
    }
}
