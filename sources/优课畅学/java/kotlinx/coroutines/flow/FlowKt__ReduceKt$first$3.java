package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p169l8.AbstractC9268e;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m17801f = "Reduce.kt", m17802l = {179}, m17803m = "first")
/* loaded from: classes5.dex */
public final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {

    /* renamed from: a */
    public Object f17854a;

    /* renamed from: b */
    public Object f17855b;

    /* renamed from: c */
    public Object f17856c;

    /* renamed from: d */
    public /* synthetic */ Object f17857d;

    /* renamed from: e */
    public int f17858e;

    public FlowKt__ReduceKt$first$3(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17857d = obj;
        this.f17858e |= Integer.MIN_VALUE;
        return AbstractC9268e.m17035y(null, null, this);
    }
}
