package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
final class DefaultDraggableState implements DraggableState {
    private final InterfaceC9540l onDelta;
    private final DragScope dragScope = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void dragBy(float f10) {
            this.this$0.getOnDelta().invoke(Float.valueOf(f10));
        }
    };
    private final MutatorMutex scrollMutex = new MutatorMutex();

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", m26211f = "Draggable.kt", m26212l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultDraggableState$drag$2 */
    public static final class C12822 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12822(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C12822> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$dragPriority = mutatePriority;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return DefaultDraggableState.this.new C12822(this.$dragPriority, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                MutatorMutex mutatorMutex = DefaultDraggableState.this.scrollMutex;
                DragScope dragScope = DefaultDraggableState.this.dragScope;
                MutatePriority mutatePriority = this.$dragPriority;
                InterfaceC9544p interfaceC9544p = this.$block;
                this.label = 1;
                if (mutatorMutex.mutateWith(dragScope, mutatePriority, interfaceC9544p, this) == objM25952f) {
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
            return ((C12822) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public DefaultDraggableState(InterfaceC9540l interfaceC9540l) {
        this.onDelta = interfaceC9540l;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f10) {
        this.onDelta.invoke(Float.valueOf(f10));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C12822(mutatePriority, interfaceC9544p, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    public final InterfaceC9540l getOnDelta() {
        return this.onDelta;
    }
}
