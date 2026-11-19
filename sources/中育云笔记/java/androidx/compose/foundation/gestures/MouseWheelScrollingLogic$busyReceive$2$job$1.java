package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MonotonicFrameClockKt;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11147o1;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", m26211f = "MouseWheelScrollable.kt", m26212l = {Opcodes.IF_ACMPNE}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$busyReceive$2$job$1 extends SuspendLambda implements InterfaceC9544p {
    private /* synthetic */ Object L$0;
    int label;

    public MouseWheelScrollingLogic$busyReceive$2$job$1(InterfaceC11588c<? super MouseWheelScrollingLogic$busyReceive$2$job$1> interfaceC11588c) {
        super(2, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        MouseWheelScrollingLogic$busyReceive$2$job$1 mouseWheelScrollingLogic$busyReceive$2$job$1 = new MouseWheelScrollingLogic$busyReceive$2$job$1(interfaceC11588c);
        mouseWheelScrollingLogic$busyReceive$2$job$1.L$0 = obj;
        return mouseWheelScrollingLogic$busyReceive$2$job$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC11122i0 interfaceC11122i0;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            AbstractC9924b.m20071b(obj);
        }
        while (AbstractC11147o1.m24780n(interfaceC11122i0.getCoroutineContext())) {
            C13211 c13211 = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1.1
                public final void invoke(long j10) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke(((Number) obj2).longValue());
                    return C10786q.f26013a;
                }
            };
            this.L$0 = interfaceC11122i0;
            this.label = 1;
            if (MonotonicFrameClockKt.withFrameNanos(c13211, this) == objM25952f) {
                return objM25952f;
            }
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((MouseWheelScrollingLogic$busyReceive$2$job$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
