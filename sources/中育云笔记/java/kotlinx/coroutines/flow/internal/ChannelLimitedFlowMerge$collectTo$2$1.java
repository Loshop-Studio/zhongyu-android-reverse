package kotlinx.coroutines.flow.internal;

import com.tendcloud.tenddata.C7843ab;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p394wd.C11741p;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", m26211f = "Merge.kt", m26212l = {C7843ab.b.API_MYNA_STOP}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ChannelLimitedFlowMerge$collectTo$2$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23935c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC11594c f23936d;

    /* renamed from: e */
    public final /* synthetic */ C11741p f23937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelLimitedFlowMerge$collectTo$2$1(InterfaceC11594c interfaceC11594c, C11741p c11741p, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23936d = interfaceC11594c;
        this.f23937e = c11741p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ChannelLimitedFlowMerge$collectTo$2$1(this.f23936d, this.f23937e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23935c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11594c interfaceC11594c = this.f23936d;
            C11741p c11741p = this.f23937e;
            this.f23935c = 1;
            if (interfaceC11594c.collect(c11741p, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ChannelLimitedFlowMerge$collectTo$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
