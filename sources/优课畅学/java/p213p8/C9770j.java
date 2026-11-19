package p213p8;

import p135i8.AbstractC8825c0;

/* renamed from: p8.j */
/* loaded from: classes5.dex */
public final class C9770j extends AbstractRunnableC9767g {

    /* renamed from: c */
    public final Runnable f19494c;

    public C9770j(Runnable runnable, long j10, InterfaceC9768h interfaceC9768h) {
        super(j10, interfaceC9768h);
        this.f19494c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f19494c.run();
        } finally {
            this.f19492b.mo18281a();
        }
    }

    public String toString() {
        return "Task[" + AbstractC8825c0.m14820a(this.f19494c) + '@' + AbstractC8825c0.m14821b(this.f19494c) + ", " + this.f19491a + ", " + this.f19492b + ']';
    }
}
