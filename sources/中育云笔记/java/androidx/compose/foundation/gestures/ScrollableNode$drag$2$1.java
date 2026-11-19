package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", m26211f = "Scrollable.kt", m26212l = {330}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollableNode$drag$2$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9544p $forEachDelta;
    final /* synthetic */ ScrollingLogic $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$drag$2$1(InterfaceC9544p interfaceC9544p, ScrollingLogic scrollingLogic, InterfaceC11588c<? super ScrollableNode$drag$2$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$forEachDelta = interfaceC9544p;
        this.$this_with = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.$forEachDelta, this.$this_with, interfaceC11588c);
        scrollableNode$drag$2$1.L$0 = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ScrollableNode$drag$2$1) create(nestedScrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            InterfaceC9544p interfaceC9544p = this.$forEachDelta;
            final ScrollingLogic scrollingLogic = this.$this_with;
            InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.ScrollableNode$drag$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DragEvent.DragDelta) obj2);
                    return C10786q.f26013a;
                }

                public final void invoke(DragEvent.DragDelta dragDelta) {
                    nestedScrollScope.mo27202scrollByWithOverscrollOzD1aCk(scrollingLogic.m27246singleAxisOffsetMKHz9U(dragDelta.m27137getDeltaF1C5BW0()), NestedScrollSource.Companion.m31996getUserInputWNlRxjI());
                }
            };
            this.label = 1;
            if (interfaceC9544p.invoke(interfaceC9540l, this) == objM25952f) {
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
}
