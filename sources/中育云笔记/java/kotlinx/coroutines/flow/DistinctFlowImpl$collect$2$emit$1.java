package kotlinx.coroutines.flow;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m26211f = "Distinct.kt", m26212l = {PatchStatus.CODE_LOAD_MFITEM}, m26213m = "emit")
/* loaded from: classes6.dex */
public final class DistinctFlowImpl$collect$2$emit$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f23606c;

    /* renamed from: d */
    public final /* synthetic */ DistinctFlowImpl.C100102 f23607d;

    /* renamed from: e */
    public int f23608e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistinctFlowImpl$collect$2$emit$1(DistinctFlowImpl.C100102 c100102, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23607d = c100102;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23606c = obj;
        this.f23608e |= Integer.MIN_VALUE;
        return this.f23607d.emit(null, this);
    }
}
