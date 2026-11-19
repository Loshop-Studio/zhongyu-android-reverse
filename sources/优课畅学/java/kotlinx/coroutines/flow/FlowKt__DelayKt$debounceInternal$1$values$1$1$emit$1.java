package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m17801f = "Delay.kt", m17802l = {204}, m17803m = "emit")
/* loaded from: classes5.dex */
public final class FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f17738a;

    /* renamed from: b */
    public final /* synthetic */ FlowKt__DelayKt$debounceInternal$1$values$1.C91711 f17739b;

    /* renamed from: c */
    public int f17740c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(FlowKt__DelayKt$debounceInternal$1$values$1.C91711 c91711, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f17739b = c91711;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17738a = obj;
        this.f17740c |= Integer.MIN_VALUE;
        return this.f17739b.emit(null, this);
    }
}
