package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Draggable2DNode extends DragGestureNode {
    public static final int $stable = 8;
    private InterfaceC10570l onDragStarted;
    private InterfaceC10570l onDragStopped;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private Draggable2DState state;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", m17801f = "Draggable2D.kt", m17802l = {257}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.Draggable2DNode$drag$2 */
    public static final class C12832 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ Draggable2DNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12832(InterfaceC10574p interfaceC10574p, Draggable2DNode draggable2DNode, InterfaceC9324c<? super C12832> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$forEachDelta = interfaceC10574p;
            this.this$0 = draggable2DNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12832 c12832 = new C12832(this.$forEachDelta, this.this$0, interfaceC9324c);
            c12832.L$0 = obj;
            return c12832;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Drag2DScope drag2DScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12832) create(drag2DScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final Drag2DScope drag2DScope = (Drag2DScope) this.L$0;
                InterfaceC10574p interfaceC10574p = this.$forEachDelta;
                final Draggable2DNode draggable2DNode = this.this$0;
                InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.Draggable2DNode.drag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DragEvent.DragDelta) obj2);
                        return C8736p.f16368a;
                    }

                    public final void invoke(DragEvent.DragDelta dragDelta) {
                        Drag2DScope drag2DScope2 = drag2DScope;
                        Draggable2DNode draggable2DNode2 = draggable2DNode;
                        long jM20535getDeltaF1C5BW0 = dragDelta.m20535getDeltaF1C5BW0();
                        if (draggable2DNode2.reverseDirection) {
                            jM20535getDeltaF1C5BW0 = Offset.m24027constructorimpl(jM20535getDeltaF1C5BW0 ^ (-9223372034707292160L));
                        }
                        drag2DScope2.mo20533dragByk4lQ0M(jM20535getDeltaF1C5BW0);
                    }
                };
                this.label = 1;
                if (interfaceC10574p.invoke(interfaceC10570l, this) == objM17291f) {
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

    public Draggable2DNode(Draggable2DState draggable2DState, InterfaceC10570l interfaceC10570l, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, boolean z12, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3) {
        super(interfaceC10570l, z10, mutableInteractionSource, null);
        this.state = draggable2DState;
        this.startDragImmediately = z11;
        this.reverseDirection = z12;
        this.onDragStarted = interfaceC10570l2;
        this.onDragStopped = interfaceC10570l3;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    private final long m20578reverseIfNeededMKHz9U(long j10) {
        return this.reverseDirection ? Offset.m24027constructorimpl(j10 ^ (-9223372034707292160L)) : j10;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objDrag = this.state.drag(MutatePriority.UserInput, new C12832(interfaceC10574p, this, null), interfaceC9324c);
        return objDrag == AbstractC9434a.m17291f() ? objDrag : C8736p.f16368a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo20515onDragStartedk4lQ0M(long j10) {
        this.onDragStarted.invoke(Offset.m24024boximpl(j10));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo20516onDragStoppedTH1AsA0(long j10) {
        this.onDragStopped.invoke(Velocity.m27128boximpl(j10));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(Draggable2DState draggable2DState, InterfaceC10570l interfaceC10570l, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, boolean z12, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3) {
        boolean z13;
        boolean z14 = true;
        if (AbstractC9133u.m16128b(this.state, draggable2DState)) {
            z13 = false;
        } else {
            this.state = draggable2DState;
            z13 = true;
        }
        if (this.reverseDirection != z12) {
            this.reverseDirection = z12;
        } else {
            z14 = z13;
        }
        this.onDragStarted = interfaceC10570l2;
        this.onDragStopped = interfaceC10570l3;
        this.startDragImmediately = z11;
        update(interfaceC10570l, z10, mutableInteractionSource, null, z14);
    }
}
