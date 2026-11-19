package androidx.compose.foundation.gestures;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollableNode$onWheelScrollStopped$1", m26211f = "Scrollable.kt", m26212l = {347}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollableNode$onWheelScrollStopped$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onWheelScrollStopped$1(ScrollableNode scrollableNode, long j10, InterfaceC11588c<? super ScrollableNode$onWheelScrollStopped$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = scrollableNode;
        this.$velocity = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new ScrollableNode$onWheelScrollStopped$1(this.this$0, this.$velocity, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
            long j10 = this.$velocity;
            this.label = 1;
            if (scrollingLogic.m27243onScrollStoppedBMRW4eQ(j10, true, this) == objM25952f) {
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
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ScrollableNode$onWheelScrollStopped$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
