package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", m26211f = "Clickable.kt", m26212l = {1257, 1260}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(AbstractClickableNode abstractClickableNode, long j10, MutableInteractionSource mutableInteractionSource, InterfaceC11588c<? super AbstractClickableNode$handlePressInteraction$2$1$delayJob$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = abstractClickableNode;
        this.$offset = j10;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PressInteraction.Press press;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.this$0.delayPressInteraction()) {
                long tapIndicationDelay = Clickable_androidKt.getTapIndicationDelay();
                this.label = 1;
                if (DelayKt.m20376b(tapIndicationDelay, this) != objM25952f) {
                }
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                press = (PressInteraction.Press) this.L$0;
                AbstractC9924b.m20071b(obj);
                this.this$0.pressInteraction = press;
                return C10786q.f26013a;
            }
            AbstractC9924b.m20071b(obj);
        }
        PressInteraction.Press press2 = new PressInteraction.Press(this.$offset, null);
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        this.L$0 = press2;
        this.label = 2;
        if (mutableInteractionSource.emit(press2, this) != objM25952f) {
            press = press2;
            this.this$0.pressInteraction = press;
            return C10786q.f26013a;
        }
        return objM25952f;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((AbstractClickableNode$handlePressInteraction$2$1$delayJob$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
