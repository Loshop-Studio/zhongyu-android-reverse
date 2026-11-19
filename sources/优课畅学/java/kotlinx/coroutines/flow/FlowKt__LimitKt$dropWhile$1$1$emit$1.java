package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m17801f = "Limit.kt", m17802l = {33, 34, 36}, m17803m = "emit")
/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$dropWhile$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f17814a;

    /* renamed from: b */
    public Object f17815b;

    /* renamed from: c */
    public /* synthetic */ Object f17816c;

    /* renamed from: d */
    public final /* synthetic */ FlowKt__LimitKt$dropWhile$1$1 f17817d;

    /* renamed from: e */
    public int f17818e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$dropWhile$1$1$emit$1(FlowKt__LimitKt$dropWhile$1$1 flowKt__LimitKt$dropWhile$1$1, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f17817d = flowKt__LimitKt$dropWhile$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17816c = obj;
        this.f17818e |= Integer.MIN_VALUE;
        return this.f17817d.emit(null, this);
    }
}
