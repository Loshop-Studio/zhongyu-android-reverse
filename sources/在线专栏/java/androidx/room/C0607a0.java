package androidx.room;

import androidx.room.AbstractC0621h0;
import java.util.concurrent.Executor;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3372c;

/* renamed from: androidx.room.a0 */
/* loaded from: classes.dex */
final class C0607a0 implements InterfaceC3372c, InterfaceC0624j {

    /* renamed from: a */
    private final InterfaceC3372c f3924a;

    /* renamed from: b */
    private final AbstractC0621h0.f f3925b;

    /* renamed from: c */
    private final Executor f3926c;

    C0607a0(InterfaceC3372c interfaceC3372c, AbstractC0621h0.f fVar, Executor executor) {
        this.f3924a = interfaceC3372c;
        this.f3925b = fVar;
        this.f3926c = executor;
    }

    @Override // p149s0.InterfaceC3372c
    /* renamed from: F */
    public InterfaceC3371b mo3483F() {
        return new C0644z(this.f3924a.mo3483F(), this.f3925b, this.f3926c);
    }

    @Override // p149s0.InterfaceC3372c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3924a.close();
    }

    @Override // p149s0.InterfaceC3372c
    public String getDatabaseName() {
        return this.f3924a.getDatabaseName();
    }

    @Override // androidx.room.InterfaceC0624j
    public InterfaceC3372c getDelegate() {
        return this.f3924a;
    }

    @Override // p149s0.InterfaceC3372c
    public void setWriteAheadLoggingEnabled(boolean z3) {
        this.f3924a.setWriteAheadLoggingEnabled(z3);
    }
}
