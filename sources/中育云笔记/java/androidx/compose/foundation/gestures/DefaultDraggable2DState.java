package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.p014ui.geometry.Offset;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class DefaultDraggable2DState implements Draggable2DState {
    private final InterfaceC9540l onDelta;
    private final Drag2DScope drag2DScope = new Drag2DScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggable2DState$drag2DScope$1
        @Override // androidx.compose.foundation.gestures.Drag2DScope
        /* renamed from: dragBy-k-4lQ0M, reason: not valid java name */
        public void mo27135dragByk4lQ0M(long j10) {
            this.this$0.getOnDelta().invoke(Offset.m30626boximpl(j10));
        }
    };
    private final MutatorMutex drag2DMutex = new MutatorMutex();

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", m26211f = "Draggable2D.kt", m26212l = {320}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2 */
    public static final class C12812 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12812(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C12812> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$dragPriority = mutatePriority;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return DefaultDraggable2DState.this.new C12812(this.$dragPriority, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                MutatorMutex mutatorMutex = DefaultDraggable2DState.this.drag2DMutex;
                Drag2DScope drag2DScope = DefaultDraggable2DState.this.drag2DScope;
                MutatePriority mutatePriority = this.$dragPriority;
                InterfaceC9544p interfaceC9544p = this.$block;
                this.label = 1;
                if (mutatorMutex.mutateWith(drag2DScope, mutatePriority, interfaceC9544p, this) == objM25952f) {
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
            return ((C12812) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public DefaultDraggable2DState(InterfaceC9540l interfaceC9540l) {
        this.onDelta = interfaceC9540l;
    }

    @Override // androidx.compose.foundation.gestures.Draggable2DState
    /* renamed from: dispatchRawDelta-k-4lQ0M, reason: not valid java name */
    public void mo27134dispatchRawDeltak4lQ0M(long j10) {
        this.onDelta.invoke(Offset.m30626boximpl(j10));
    }

    @Override // androidx.compose.foundation.gestures.Draggable2DState
    public Object drag(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C12812(mutatePriority, interfaceC9544p, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    public final InterfaceC9540l getOnDelta() {
        return this.onDelta;
    }
}
