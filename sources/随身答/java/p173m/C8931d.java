package p173m;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* renamed from: m.d */
/* loaded from: classes3.dex */
public final class C8931d extends CoroutineDispatcher {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14962c = AtomicIntegerFieldUpdater.newUpdater(C8931d.class, "b");

    /* renamed from: a */
    public final CoroutineDispatcher f14963a;

    /* renamed from: b */
    public volatile /* synthetic */ int f14964b = 1;

    public C8931d(CoroutineDispatcher coroutineDispatcher) {
        this.f14963a = coroutineDispatcher;
    }

    /* renamed from: a */
    public final CoroutineDispatcher m14223a() {
        return f14962c.get(this) == 1 ? Dispatchers.getUnconfined() : this.f14963a;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo26290dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        m14223a().mo26290dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        m14223a().dispatchYield(coroutineContext, runnable);
    }

    /* renamed from: g */
    public final void m14224g(boolean z9) {
        this.f14964b = z9 ? 1 : 0;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return m14223a().isDispatchNeeded(coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i9, String str) {
        return m14223a().limitedParallelism(i9, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f14963a + ")";
    }
}
