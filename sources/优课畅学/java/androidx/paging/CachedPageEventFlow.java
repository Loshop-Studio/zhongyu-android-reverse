package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.channels.BufferOverflow;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9276m;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9275l;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class CachedPageEventFlow<T> {
    private final InterfaceC9266c downstreamFlow;
    private final InterfaceC9212n job;
    private final InterfaceC9270g mutableSharedSrc;
    private final FlattenedPageController<T> pageController;
    private final InterfaceC9275l sharedForDownstream;

    public CachedPageEventFlow(InterfaceC9266c src, InterfaceC8822b0 scope) {
        AbstractC9133u.m16133g(src, "src");
        AbstractC9133u.m16133g(scope, "scope");
        this.pageController = new FlattenedPageController<>();
        InterfaceC9270g interfaceC9270gM17043a = AbstractC9276m.m17043a(1, Integer.MAX_VALUE, BufferOverflow.f17603a);
        this.mutableSharedSrc = interfaceC9270gM17043a;
        this.sharedForDownstream = AbstractC9268e.m17002N(interfaceC9270gM17043a, new CachedPageEventFlow$sharedForDownstream$1(this, null));
        InterfaceC9212n interfaceC9212nM14861d = AbstractC8839h.m14861d(scope, null, CoroutineStart.f17553b, new CachedPageEventFlow$job$1(src, this, null), 1, null);
        interfaceC9212nM14861d.mo16287k(new InterfaceC10570l(this) { // from class: androidx.paging.CachedPageEventFlow$job$2$1
            final /* synthetic */ CachedPageEventFlow<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Throwable th) {
                ((CachedPageEventFlow) this.this$0).mutableSharedSrc.mo16670a(null);
            }
        });
        this.job = interfaceC9212nM14861d;
        this.downstreamFlow = AbstractC9268e.m16990B(new CachedPageEventFlow$downstreamFlow$1(this, null));
    }

    public final void close() {
        InterfaceC9212n.a.m16777a(this.job, null, 1, null);
    }

    public final PageEvent.Insert<T> getCachedEvent$paging_common_release() {
        return this.pageController.getCachedEvent();
    }

    public final InterfaceC9266c getDownstreamFlow() {
        return this.downstreamFlow;
    }
}
