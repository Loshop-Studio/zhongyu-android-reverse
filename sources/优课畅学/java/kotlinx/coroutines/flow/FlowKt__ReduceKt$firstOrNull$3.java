package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p169l8.AbstractC9268e;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m17801f = "Reduce.kt", m17802l = {179}, m17803m = "firstOrNull")
/* loaded from: classes5.dex */
public final class FlowKt__ReduceKt$firstOrNull$3<T> extends ContinuationImpl {

    /* renamed from: a */
    public Object f17863a;

    /* renamed from: b */
    public Object f17864b;

    /* renamed from: c */
    public /* synthetic */ Object f17865c;

    /* renamed from: d */
    public int f17866d;

    public FlowKt__ReduceKt$firstOrNull$3(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17865c = obj;
        this.f17866d |= Integer.MIN_VALUE;
        return AbstractC9268e.m16989A(null, null, this);
    }
}
