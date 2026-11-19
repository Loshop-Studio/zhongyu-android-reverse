package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p169l8.AbstractC9268e;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m17801f = "Errors.kt", m17802l = {152}, m17803m = "catchImpl")
/* loaded from: classes5.dex */
public final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {

    /* renamed from: a */
    public Object f17773a;

    /* renamed from: b */
    public /* synthetic */ Object f17774b;

    /* renamed from: c */
    public int f17775c;

    public FlowKt__ErrorsKt$catchImpl$1(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17774b = obj;
        this.f17775c |= Integer.MIN_VALUE;
        return AbstractC9268e.m17016f(null, null, this);
    }
}
