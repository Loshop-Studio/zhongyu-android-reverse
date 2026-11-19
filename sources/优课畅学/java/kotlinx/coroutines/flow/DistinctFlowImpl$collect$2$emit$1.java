package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m17801f = "Distinct.kt", m17802l = {73}, m17803m = "emit")
/* loaded from: classes5.dex */
public final class DistinctFlowImpl$collect$2$emit$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f17698a;

    /* renamed from: b */
    public final /* synthetic */ DistinctFlowImpl.C91682 f17699b;

    /* renamed from: c */
    public int f17700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistinctFlowImpl$collect$2$emit$1(DistinctFlowImpl.C91682 c91682, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f17699b = c91682;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17698a = obj;
        this.f17700c |= Integer.MIN_VALUE;
        return this.f17699b.emit(null, this);
    }
}
