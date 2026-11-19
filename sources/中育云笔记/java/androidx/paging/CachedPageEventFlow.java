package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.channels.BufferOverflow;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11607p;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

/* loaded from: classes3.dex */
public final class CachedPageEventFlow<T> {
    private final InterfaceC11594c downstreamFlow;
    private final InterfaceC10045g job;
    private final InterfaceC11602k mutableSharedSrc;
    private final FlattenedPageController<T> pageController;
    private final InterfaceC11607p sharedForDownstream;

    public CachedPageEventFlow(InterfaceC11594c src, InterfaceC11122i0 scope) {
        AbstractC9979u.m20294g(src, "src");
        AbstractC9979u.m20294g(scope, "scope");
        this.pageController = new FlattenedPageController<>();
        InterfaceC11602k interfaceC11602kM25591a = AbstractC11608q.m25591a(1, Integer.MAX_VALUE, BufferOverflow.f23519c);
        this.mutableSharedSrc = interfaceC11602kM25591a;
        this.sharedForDownstream = AbstractC11596e.m25542M(interfaceC11602kM25591a, new CachedPageEventFlow$sharedForDownstream$1(this, null));
        InterfaceC10045g interfaceC10045gM24726d = AbstractC11117h.m24726d(scope, null, CoroutineStart.f23477d, new CachedPageEventFlow$job$1(src, this, null), 1, null);
        interfaceC10045gM24726d.mo20404A(new InterfaceC9540l() { // from class: androidx.paging.g
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return CachedPageEventFlow.job$lambda$0$0(this.f1922c, (Throwable) obj);
            }
        });
        this.job = interfaceC10045gM24726d;
        this.downstreamFlow = AbstractC11596e.m25531B(new CachedPageEventFlow$downstreamFlow$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q job$lambda$0$0(CachedPageEventFlow cachedPageEventFlow, Throwable th) {
        cachedPageEventFlow.mutableSharedSrc.mo20854a(null);
        return C10786q.f26013a;
    }

    public final void close() {
        InterfaceC10045g.a.m20900a(this.job, null, 1, null);
    }

    public final PageEvent.Insert<T> getCachedEvent$paging_common() {
        return this.pageController.getCachedEvent();
    }

    public final InterfaceC11594c getDownstreamFlow() {
        return this.downstreamFlow;
    }
}
