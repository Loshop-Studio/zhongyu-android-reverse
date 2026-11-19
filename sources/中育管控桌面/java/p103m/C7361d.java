package p103m;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* renamed from: m.d */
/* loaded from: classes3.dex */
public final class C7361d extends CoroutineDispatcher {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9354c = AtomicIntegerFieldUpdater.newUpdater(C7361d.class, "b");

    /* renamed from: a */
    public final CoroutineDispatcher f9355a;

    /* renamed from: b */
    public volatile /* synthetic */ int f9356b = 1;

    public C7361d(CoroutineDispatcher coroutineDispatcher) {
        this.f9355a = coroutineDispatcher;
    }

    /* renamed from: a */
    public final CoroutineDispatcher m8367a() {
        return f9354c.get(this) == 1 ? Dispatchers.getUnconfined() : this.f9355a;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo18715dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        m8367a().mo18715dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        m8367a().dispatchYield(coroutineContext, runnable);
    }

    /* renamed from: g */
    public final void m8368g(boolean z6) {
        this.f9356b = z6 ? 1 : 0;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return m8367a().isDispatchNeeded(coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i6, String str) {
        return m8367a().limitedParallelism(i6, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f9355a + ")";
    }
}
