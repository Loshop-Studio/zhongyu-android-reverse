package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m26211f = "Limit.kt", m26212l = {34, 35, 37}, m26213m = "emit")
/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$dropWhile$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f23741c;

    /* renamed from: d */
    public Object f23742d;

    /* renamed from: e */
    public /* synthetic */ Object f23743e;

    /* renamed from: f */
    public final /* synthetic */ FlowKt__LimitKt$dropWhile$1$1 f23744f;

    /* renamed from: g */
    public int f23745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$dropWhile$1$1$emit$1(FlowKt__LimitKt$dropWhile$1$1 flowKt__LimitKt$dropWhile$1$1, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23744f = flowKt__LimitKt$dropWhile$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23743e = obj;
        this.f23745g |= Integer.MIN_VALUE;
        return this.f23744f.emit(null, this);
    }
}
