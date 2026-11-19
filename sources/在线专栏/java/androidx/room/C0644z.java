package androidx.room;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.AbstractC0621h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3374e;
import p149s0.InterfaceC3375f;

/* renamed from: androidx.room.z */
/* loaded from: classes.dex */
final class C0644z implements InterfaceC3371b {

    /* renamed from: a */
    private final InterfaceC3371b f4121a;

    /* renamed from: b */
    private final AbstractC0621h0.f f4122b;

    /* renamed from: c */
    private final Executor f4123c;

    C0644z(InterfaceC3371b interfaceC3371b, AbstractC0621h0.f fVar, Executor executor) {
        this.f4121a = interfaceC3371b;
        this.f4122b = fVar;
        this.f4123c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m3638B(String str) {
        this.f4122b.m3575a(str, new ArrayList(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m3639I(String str, List list) {
        this.f4122b.m3575a(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m3640J(String str) {
        this.f4122b.m3575a(str, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m3641K(InterfaceC3374e interfaceC3374e, C0611c0 c0611c0) {
        this.f4122b.m3575a(interfaceC3374e.mo10088a(), c0611c0.m3487a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m3642L(InterfaceC3374e interfaceC3374e, C0611c0 c0611c0) {
        this.f4122b.m3575a(interfaceC3374e.mo10088a(), c0611c0.m3487a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m3643M() {
        this.f4122b.m3575a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m3653t() {
        this.f4122b.m3575a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m3654u() {
        this.f4122b.m3575a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m3655y() {
        this.f4122b.m3575a("END TRANSACTION", Collections.emptyList());
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: A */
    public void mo3501A() {
        this.f4123c.execute(new Runnable() { // from class: androidx.room.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f4105a.m3654u();
            }
        });
        this.f4121a.mo3501A();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: D */
    public Cursor mo3502D(final InterfaceC3374e interfaceC3374e) {
        final C0611c0 c0611c0 = new C0611c0();
        interfaceC3374e.mo10089b(c0611c0);
        this.f4123c.execute(new Runnable() { // from class: androidx.room.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f4115a.m3641K(interfaceC3374e, c0611c0);
            }
        });
        return this.f4121a.mo3502D(interfaceC3374e);
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: E */
    public Cursor mo3503E(final InterfaceC3374e interfaceC3374e, CancellationSignal cancellationSignal) {
        final C0611c0 c0611c0 = new C0611c0();
        interfaceC3374e.mo10089b(c0611c0);
        this.f4123c.execute(new Runnable() { // from class: androidx.room.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f4118a.m3642L(interfaceC3374e, c0611c0);
            }
        });
        return this.f4121a.mo3502D(interfaceC3374e);
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: H */
    public Cursor mo3504H(final String str) {
        this.f4123c.execute(new Runnable() { // from class: androidx.room.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f4110a.m3640J(str);
            }
        });
        return this.f4121a.mo3504H(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4121a.close();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: e */
    public void mo3505e() {
        this.f4123c.execute(new Runnable() { // from class: androidx.room.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f4104a.m3655y();
            }
        });
        this.f4121a.mo3505e();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: f */
    public void mo3506f() {
        this.f4123c.execute(new Runnable() { // from class: androidx.room.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f4107a.m3653t();
            }
        });
        this.f4121a.mo3506f();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: g */
    public List<Pair<String, String>> mo3507g() {
        return this.f4121a.mo3507g();
    }

    @Override // p149s0.InterfaceC3371b
    public String getPath() {
        return this.f4121a.getPath();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: h */
    public void mo3508h(final String str) throws SQLException {
        this.f4123c.execute(new Runnable() { // from class: androidx.room.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f4108a.m3638B(str);
            }
        });
        this.f4121a.mo3508h(str);
    }

    @Override // p149s0.InterfaceC3371b
    public boolean isOpen() {
        return this.f4121a.isOpen();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: j */
    public InterfaceC3375f mo3509j(String str) {
        return new C0617f0(this.f4121a.mo3509j(str), this.f4122b, str, this.f4123c);
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: p */
    public boolean mo3510p() {
        return this.f4121a.mo3510p();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: v */
    public boolean mo3512v() {
        return this.f4121a.mo3512v();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: x */
    public void mo3513x() {
        this.f4123c.execute(new Runnable() { // from class: androidx.room.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f4106a.m3643M();
            }
        });
        this.f4121a.mo3513x();
    }

    @Override // p149s0.InterfaceC3371b
    /* renamed from: z */
    public void mo3514z(final String str, Object[] objArr) throws SQLException {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.f4123c.execute(new Runnable() { // from class: androidx.room.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f4112a.m3639I(str, arrayList);
            }
        });
        this.f4121a.mo3514z(str, arrayList.toArray());
    }
}
