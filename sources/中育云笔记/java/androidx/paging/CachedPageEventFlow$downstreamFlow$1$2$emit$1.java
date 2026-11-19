package androidx.paging;

import androidx.paging.CachedPageEventFlow$downstreamFlow$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p309qc.C10786q;
import p325rc.C10955k0;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", m26211f = "CachedPageEventFlow.kt", m26212l = {104}, m26213m = "emit", m26214v = 1)
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$downstreamFlow$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CachedPageEventFlow$downstreamFlow$1.C42112<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CachedPageEventFlow$downstreamFlow$1$2$emit$1(CachedPageEventFlow$downstreamFlow$1.C42112<? super T> c42112, InterfaceC11588c<? super CachedPageEventFlow$downstreamFlow$1$2$emit$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = c42112;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((C10955k0) null, (InterfaceC11588c<? super C10786q>) this);
    }
}
