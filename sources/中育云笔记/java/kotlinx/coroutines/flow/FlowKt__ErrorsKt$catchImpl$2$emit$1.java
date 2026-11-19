package kotlinx.coroutines.flow;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m26211f = "Errors.kt", m26212l = {Opcodes.IFNE}, m26213m = "emit")
/* loaded from: classes6.dex */
public final class FlowKt__ErrorsKt$catchImpl$2$emit$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f23705c;

    /* renamed from: d */
    public /* synthetic */ Object f23706d;

    /* renamed from: e */
    public final /* synthetic */ FlowKt__ErrorsKt$catchImpl$2 f23707e;

    /* renamed from: f */
    public int f23708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$catchImpl$2$emit$1(FlowKt__ErrorsKt$catchImpl$2 flowKt__ErrorsKt$catchImpl$2, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23707e = flowKt__ErrorsKt$catchImpl$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23706d = obj;
        this.f23708f |= Integer.MIN_VALUE;
        return this.f23707e.emit(null, this);
    }
}
