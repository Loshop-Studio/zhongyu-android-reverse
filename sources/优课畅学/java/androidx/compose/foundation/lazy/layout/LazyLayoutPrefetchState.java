package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchState {
    public static final int $stable = 0;
    private final InterfaceC10570l onNestedPrefetch;
    private PrefetchHandleProvider prefetchHandleProvider;
    private final PrefetchMetrics prefetchMetrics;
    private final PrefetchScheduler prefetchScheduler;

    public final class NestedPrefetchScopeImpl implements NestedPrefetchScope {
        private final List<PrefetchRequest> _requests = new ArrayList();

        public NestedPrefetchScopeImpl() {
        }

        public final List<PrefetchRequest> getRequests() {
            return this._requests;
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public void schedulePrefetch(int i10) {
            mo21036schedulePrefetch0kLqBqw(i10, LazyLayoutPrefetchStateKt.ZeroConstraints);
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        /* renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
        public void mo21036schedulePrefetch0kLqBqw(int i10, long j10) {
            PrefetchHandleProvider prefetchHandleProvider$foundation_release = LazyLayoutPrefetchState.this.getPrefetchHandleProvider$foundation_release();
            if (prefetchHandleProvider$foundation_release == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider$foundation_release.m21047createNestedPrefetchRequestVKLhPVY(i10, j10, LazyLayoutPrefetchState.this.prefetchMetrics));
        }
    }

    public interface PrefetchHandle {
        void cancel();

        void markAsUrgent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutPrefetchState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<PrefetchRequest> collectNestedPrefetchRequests$foundation_release() {
        InterfaceC10570l interfaceC10570l = this.onNestedPrefetch;
        if (interfaceC10570l == null) {
            return AbstractC8809v.m14771n();
        }
        NestedPrefetchScopeImpl nestedPrefetchScopeImpl = new NestedPrefetchScopeImpl();
        interfaceC10570l.invoke(nestedPrefetchScopeImpl);
        return nestedPrefetchScopeImpl.getRequests();
    }

    public final PrefetchHandleProvider getPrefetchHandleProvider$foundation_release() {
        return this.prefetchHandleProvider;
    }

    public final PrefetchScheduler getPrefetchScheduler$foundation_release() {
        return this.prefetchScheduler;
    }

    public final PrefetchHandle schedulePrefetch(int i10) {
        return m21035schedulePrefetch0kLqBqw(i10, LazyLayoutPrefetchStateKt.ZeroConstraints);
    }

    /* renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
    public final PrefetchHandle m21035schedulePrefetch0kLqBqw(int i10, long j10) {
        PrefetchHandle prefetchHandleM21048schedulePrefetchVKLhPVY;
        PrefetchHandleProvider prefetchHandleProvider = this.prefetchHandleProvider;
        return (prefetchHandleProvider == null || (prefetchHandleM21048schedulePrefetchVKLhPVY = prefetchHandleProvider.m21048schedulePrefetchVKLhPVY(i10, j10, this.prefetchMetrics)) == null) ? DummyHandle.INSTANCE : prefetchHandleM21048schedulePrefetchVKLhPVY;
    }

    public final void setPrefetchHandleProvider$foundation_release(PrefetchHandleProvider prefetchHandleProvider) {
        this.prefetchHandleProvider = prefetchHandleProvider;
    }

    public LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, InterfaceC10570l interfaceC10570l) {
        this.prefetchScheduler = prefetchScheduler;
        this.onNestedPrefetch = interfaceC10570l;
        this.prefetchMetrics = new PrefetchMetrics();
    }

    public /* synthetic */ LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, InterfaceC10570l interfaceC10570l, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : prefetchScheduler, (i10 & 2) != 0 ? null : interfaceC10570l);
    }
}
