package androidx.room;

import androidx.room.AbstractC0621h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p149s0.InterfaceC3375f;

/* renamed from: androidx.room.f0 */
/* loaded from: classes.dex */
final class C0617f0 implements InterfaceC3375f {

    /* renamed from: a */
    private final InterfaceC3375f f3947a;

    /* renamed from: b */
    private final AbstractC0621h0.f f3948b;

    /* renamed from: c */
    private final String f3949c;

    /* renamed from: d */
    private final List<Object> f3950d = new ArrayList();

    /* renamed from: e */
    private final Executor f3951e;

    C0617f0(InterfaceC3375f interfaceC3375f, AbstractC0621h0.f fVar, String str, Executor executor) {
        this.f3947a = interfaceC3375f;
        this.f3948b = fVar;
        this.f3949c = str;
        this.f3951e = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m3524d() {
        this.f3948b.m3575a(this.f3949c, this.f3950d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m3525m() {
        this.f3948b.m3575a(this.f3949c, this.f3950d);
    }

    /* renamed from: n */
    private void m3526n(int i4, Object obj) {
        int i5 = i4 - 1;
        if (i5 >= this.f3950d.size()) {
            for (int size = this.f3950d.size(); size <= i5; size++) {
                this.f3950d.add(null);
            }
        }
        this.f3950d.set(i5, obj);
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: C */
    public void mo3486C(int i4, byte[] bArr) {
        m3526n(i4, bArr);
        this.f3947a.mo3486C(i4, bArr);
    }

    @Override // p149s0.InterfaceC3375f
    /* renamed from: G */
    public long mo3520G() {
        this.f3951e.execute(new Runnable() { // from class: androidx.room.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3935a.m3524d();
            }
        });
        return this.f3947a.mo3520G();
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: c */
    public void mo3488c(int i4, String str) {
        m3526n(i4, str);
        this.f3947a.mo3488c(i4, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3947a.close();
    }

    @Override // p149s0.InterfaceC3375f
    /* renamed from: i */
    public int mo3521i() {
        this.f3951e.execute(new Runnable() { // from class: androidx.room.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3937a.m3525m();
            }
        });
        return this.f3947a.mo3521i();
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: k */
    public void mo3489k(int i4) {
        m3526n(i4, this.f3950d.toArray());
        this.f3947a.mo3489k(i4);
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: l */
    public void mo3490l(int i4, double d4) {
        m3526n(i4, Double.valueOf(d4));
        this.f3947a.mo3490l(i4, d4);
    }

    @Override // p149s0.InterfaceC3373d
    /* renamed from: w */
    public void mo3491w(int i4, long j4) {
        m3526n(i4, Long.valueOf(j4));
        this.f3947a.mo3491w(i4, j4);
    }
}
