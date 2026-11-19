package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p054e7.C5483o;

/* renamed from: kotlinx.coroutines.q1 */
/* loaded from: classes4.dex */
public final class RunnableC5994q1 extends C5483o implements Runnable {

    /* renamed from: e */
    public final long f9493e;

    public RunnableC5994q1(long j7, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.getContext());
        this.f9493e = j7;
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: P */
    public final String mo5448P() {
        return super.mo5448P() + "(timeMillis=" + this.f9493e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC6014x.m5641l(this.f9276c);
        m5462v(new TimeoutCancellationException("Timed out waiting for " + this.f9493e + " ms", this));
    }
}
