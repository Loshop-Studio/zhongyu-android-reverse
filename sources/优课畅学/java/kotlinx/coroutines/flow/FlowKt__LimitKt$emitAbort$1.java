package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m17801f = "Limit.kt", m17802l = {70}, m17803m = "emitAbort$FlowKt__LimitKt")
/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {

    /* renamed from: a */
    public Object f17819a;

    /* renamed from: b */
    public /* synthetic */ Object f17820b;

    /* renamed from: c */
    public int f17821c;

    public FlowKt__LimitKt$emitAbort$1(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17820b = obj;
        this.f17821c |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.m16606d(null, null, null, this);
    }
}
