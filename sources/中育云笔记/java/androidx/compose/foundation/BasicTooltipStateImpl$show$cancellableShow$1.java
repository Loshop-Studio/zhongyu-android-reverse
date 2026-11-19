package androidx.compose.foundation;

import kotlin.AbstractC9924b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1", m26211f = "BasicTooltip.kt", m26212l = {391}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BasicTooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements InterfaceC9540l {
    Object L$0;
    int label;
    final /* synthetic */ BasicTooltipStateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipStateImpl$show$cancellableShow$1(BasicTooltipStateImpl basicTooltipStateImpl, InterfaceC11588c<? super BasicTooltipStateImpl$show$cancellableShow$1> interfaceC11588c) {
        super(1, interfaceC11588c);
        this.this$0 = basicTooltipStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            BasicTooltipStateImpl basicTooltipStateImpl = this.this$0;
            this.L$0 = basicTooltipStateImpl;
            this.label = 1;
            C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(this), 1);
            c9997c.m20503F();
            basicTooltipStateImpl.setVisible(true);
            basicTooltipStateImpl.job = c9997c;
            Object objM20538x = c9997c.m20538x();
            if (objM20538x == AbstractC11725a.m25952f()) {
                AbstractC11831f.m26221c(this);
            }
            if (objM20538x == objM25952f) {
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

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((BasicTooltipStateImpl$show$cancellableShow$1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
