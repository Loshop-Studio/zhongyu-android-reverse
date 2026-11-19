package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.k0 */
/* loaded from: classes4.dex */
public final class C5975k0 extends AbstractRunnableC5978l0 {

    /* renamed from: c */
    public final RunnableC5994q1 f9467c;

    public C5975k0(long j7, RunnableC5994q1 runnableC5994q1) {
        super(j7);
        this.f9467c = runnableC5994q1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9467c.run();
    }

    @Override // kotlinx.coroutines.AbstractRunnableC5978l0
    public final String toString() {
        return super.toString() + this.f9467c;
    }
}
