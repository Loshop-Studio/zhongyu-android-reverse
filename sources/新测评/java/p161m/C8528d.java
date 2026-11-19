package p161m;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* renamed from: m.d */
/* loaded from: classes3.dex */
public final class C8528d extends CoroutineDispatcher {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14160c = AtomicIntegerFieldUpdater.newUpdater(C8528d.class, "b");

    /* renamed from: a */
    public final CoroutineDispatcher f14161a;

    /* renamed from: b */
    public volatile /* synthetic */ int f14162b = 1;

    public C8528d(CoroutineDispatcher coroutineDispatcher) {
        this.f14161a = coroutineDispatcher;
    }

    /* renamed from: a */
    public final CoroutineDispatcher m14021a() {
        return f14160c.get(this) == 1 ? Dispatchers.getUnconfined() : this.f14161a;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo25831dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        m14021a().mo25831dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        m14021a().dispatchYield(coroutineContext, runnable);
    }

    /* renamed from: g */
    public final void m14022g(boolean z9) {
        this.f14162b = z9 ? 1 : 0;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return m14021a().isDispatchNeeded(coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10, String str) {
        return m14021a().limitedParallelism(i10, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f14161a + ")";
    }
}
