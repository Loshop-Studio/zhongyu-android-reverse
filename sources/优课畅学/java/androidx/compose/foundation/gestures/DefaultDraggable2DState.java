package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.p013ui.geometry.Offset;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC9165e;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class DefaultDraggable2DState implements Draggable2DState {
    private final InterfaceC10570l onDelta;
    private final Drag2DScope drag2DScope = new Drag2DScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggable2DState$drag2DScope$1
        @Override // androidx.compose.foundation.gestures.Drag2DScope
        /* renamed from: dragBy-k-4lQ0M, reason: not valid java name */
        public void mo20533dragByk4lQ0M(long j10) {
            this.this$0.getOnDelta().invoke(Offset.m24024boximpl(j10));
        }
    };
    private final MutatorMutex drag2DMutex = new MutatorMutex();

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", m17801f = "Draggable2D.kt", m17802l = {320}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2 */
    public static final class C12512 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12512(MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C12512> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$dragPriority = mutatePriority;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return DefaultDraggable2DState.this.new C12512(this.$dragPriority, this.$block, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12512) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                MutatorMutex mutatorMutex = DefaultDraggable2DState.this.drag2DMutex;
                Drag2DScope drag2DScope = DefaultDraggable2DState.this.drag2DScope;
                MutatePriority mutatePriority = this.$dragPriority;
                InterfaceC10574p interfaceC10574p = this.$block;
                this.label = 1;
                if (mutatorMutex.mutateWith(drag2DScope, mutatePriority, interfaceC10574p, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public DefaultDraggable2DState(InterfaceC10570l interfaceC10570l) {
        this.onDelta = interfaceC10570l;
    }

    @Override // androidx.compose.foundation.gestures.Draggable2DState
    /* renamed from: dispatchRawDelta-k-4lQ0M, reason: not valid java name */
    public void mo20532dispatchRawDeltak4lQ0M(long j10) {
        this.onDelta.invoke(Offset.m24024boximpl(j10));
    }

    @Override // androidx.compose.foundation.gestures.Draggable2DState
    public Object drag(MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C12512(mutatePriority, interfaceC10574p, null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    public final InterfaceC10570l getOnDelta() {
        return this.onDelta;
    }
}
