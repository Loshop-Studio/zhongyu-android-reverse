package p135i8;

import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import p179m7.InterfaceC9324c;
import p191n8.C9473z;

/* renamed from: i8.w1 */
/* loaded from: classes5.dex */
public final class RunnableC8886w1 extends C9473z implements Runnable {

    /* renamed from: e */
    public final long f16547e;

    public RunnableC8886w1(long j10, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c.getContext(), interfaceC9324c);
        this.f16547e = j10;
    }

    @Override // kotlinx.coroutines.AbstractC9152a, kotlinx.coroutines.JobSupport
    /* renamed from: l0 */
    public String mo14929l0() {
        return super.mo14929l0() + "(timeMillis=" + this.f16547e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m16259E(TimeoutKt.m16324a(this.f16547e, DelayKt.m16228c(getContext()), this));
    }
}
