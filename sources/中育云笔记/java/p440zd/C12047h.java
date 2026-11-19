package p440zd;

import sd.AbstractC11126j0;

/* renamed from: zd.h */
/* loaded from: classes6.dex */
public final class C12047h extends AbstractRunnableC12046g {

    /* renamed from: e */
    public final Runnable f28424e;

    public C12047h(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f28424e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f28424e.run();
    }

    public String toString() {
        return "Task[" + AbstractC11126j0.m24738a(this.f28424e) + '@' + AbstractC11126j0.m24739b(this.f28424e) + ", " + this.f28422c + ", " + AbstractC12048i.m26674c(this.f28423d) + ']';
    }
}
