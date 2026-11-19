package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m17801f = "Errors.kt", m17802l = {154}, m17803m = "emit")
/* loaded from: classes5.dex */
public final class FlowKt__ErrorsKt$catchImpl$2$emit$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f17778a;

    /* renamed from: b */
    public /* synthetic */ Object f17779b;

    /* renamed from: c */
    public final /* synthetic */ FlowKt__ErrorsKt$catchImpl$2 f17780c;

    /* renamed from: d */
    public int f17781d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$catchImpl$2$emit$1(FlowKt__ErrorsKt$catchImpl$2 flowKt__ErrorsKt$catchImpl$2, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f17780c = flowKt__ErrorsKt$catchImpl$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17779b = obj;
        this.f17781d |= Integer.MIN_VALUE;
        return this.f17780c.emit(null, this);
    }
}
