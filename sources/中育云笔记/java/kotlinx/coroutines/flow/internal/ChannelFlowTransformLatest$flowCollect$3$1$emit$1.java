package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m26211f = "Merge.kt", m26212l = {26}, m26213m = "emit")
/* loaded from: classes6.dex */
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f23928c;

    /* renamed from: d */
    public Object f23929d;

    /* renamed from: e */
    public Object f23930e;

    /* renamed from: f */
    public /* synthetic */ Object f23931f;

    /* renamed from: g */
    public final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.C100421 f23932g;

    /* renamed from: h */
    public int f23933h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.C100421 c100421, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23932g = c100421;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23931f = obj;
        this.f23933h |= Integer.MIN_VALUE;
        return this.f23932g.emit(null, this);
    }
}
