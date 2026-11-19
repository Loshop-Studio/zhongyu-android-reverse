package p213p8;

import java.util.concurrent.Executor;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: p8.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9765e extends ExecutorCoroutineDispatcher {

    /* renamed from: b */
    public final int f19486b;

    /* renamed from: c */
    public final int f19487c;

    /* renamed from: d */
    public final long f19488d;

    /* renamed from: e */
    public final String f19489e;

    /* renamed from: f */
    public CoroutineScheduler f19490f = m18279m();

    public AbstractC9765e(int i10, int i11, long j10, String str) {
        this.f19486b = i10;
        this.f19487c = i11;
        this.f19488d = j10;
        this.f19489e = str;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        CoroutineScheduler.m16783g(this.f19490f, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        CoroutineScheduler.m16783g(this.f19490f, runnable, null, true, 2, null);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    /* renamed from: i */
    public Executor mo16230i() {
        return this.f19490f;
    }

    /* renamed from: m */
    public final CoroutineScheduler m18279m() {
        return new CoroutineScheduler(this.f19486b, this.f19487c, this.f19488d, this.f19489e);
    }

    /* renamed from: o */
    public final void m18280o(Runnable runnable, InterfaceC9768h interfaceC9768h, boolean z10) {
        this.f19490f.m16792f(runnable, interfaceC9768h, z10);
    }
}
