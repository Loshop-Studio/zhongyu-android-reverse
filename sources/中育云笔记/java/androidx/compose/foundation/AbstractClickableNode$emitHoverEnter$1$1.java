package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", m26211f = "Clickable.kt", m26212l = {1298}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AbstractClickableNode$emitHoverEnter$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ HoverInteraction.Enter $interaction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$emitHoverEnter$1$1(MutableInteractionSource mutableInteractionSource, HoverInteraction.Enter enter, InterfaceC11588c<? super AbstractClickableNode$emitHoverEnter$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$interactionSource = mutableInteractionSource;
        this.$interaction = enter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new AbstractClickableNode$emitHoverEnter$1$1(this.$interactionSource, this.$interaction, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            HoverInteraction.Enter enter = this.$interaction;
            this.label = 1;
            if (mutableInteractionSource.emit(enter, this) == objM25952f) {
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
        return ((AbstractClickableNode$emitHoverEnter$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
